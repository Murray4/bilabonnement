package com.example.bilabonnement.damageDepartment.forms.damageReportForm.controller;

import com.example.bilabonnement.dataRegistration.model.Car;
import com.example.bilabonnement.dataRegistration.model.LeaseContract;
import com.example.bilabonnement.dataRegistration.repository.CarRepo;
import com.example.bilabonnement.dataRegistration.repository.LeaseContractRepo;
import com.example.bilabonnement.damageDepartment.forms.damageReportForm.model.DamageItem;
import com.example.bilabonnement.damageDepartment.forms.damageReportForm.model.DamageReport;
import com.example.bilabonnement.damageDepartment.forms.damageReportForm.service.DamageReportService;
import com.example.bilabonnement.util.ValidationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/damageReportForm")
public class DamageReportController {

    @Autowired private DamageReportService damageReportService;
    @Autowired private LeaseContractRepo leaseContractRepo;
    @Autowired private CarRepo carRepo;

//Hvis ikke der er et lease_ID så e der en tom formular. Hvis den har henter den info
    @GetMapping("/new")
    public String newDamageReport(@RequestParam(required = false) Integer leaseId, Model model) {
        DamageReport report = null;

        if (leaseId != null) {
            report = damageReportService.findByLeaseIdWithItems(leaseId);
            if (report == null) {
                report = new DamageReport();
                report.setLeasingContractId(leaseId);
                report.setTotalKm(0);
                report.setDamageItems(new ArrayList<>());
            }
            if (report.getDamageItems() == null || report.getDamageItems().isEmpty()) {
                report.getDamageItems().add(new DamageItem());
            }
            report.updatePaidStatusFromDate();

// Beregn totals til visning
            damageReportService.recalc(report);

            loadLeaseInfo(leaseId, model, report.getTotalKm());
        }

        if (report == null) {
            report = new DamageReport();
            report.setDamageItems(new ArrayList<>());
            report.getDamageItems().add(new DamageItem());
            // (valgfrit) damageReportService.recalc(report);
        }

        model.addAttribute("damageReport", report);
        return "damageDepartmentHTML/damageReportForm";
    }


// Gemmer og opdaterer rapporten man arbejder på.

    @PostMapping("/save")
    public String saveDamageReport(@ModelAttribute DamageReport damageReport, Model model) {

        // --- Simpel validering af input fra formularen (tal mv.) ---
        // Vi bruger små hjælpemetoder fra util (ValidationUtil) for at tjekke:
        // - totalKm: må ikke være negativ og må max have 6 cifre
        // - hver damageItemPrice: må ikke være negativ og må max have 6 heltalscifre + 2 decimaler
        boolean hasErrors = false;

        // Valider kilometertal
        if (!ValidationUtil.isNullOrNonNegativeIntegerWithMaxDigits(damageReport.getTotalKm(), 6)) {
            model.addAttribute("kmError", "Kilometertal skal være 0 eller større og må maks have 6 cifre.");
            hasErrors = true;
        }

        // Valider priser på skader
        if (damageReport.getDamageItems() != null) {
            for (int i = 0; i < damageReport.getDamageItems().size(); i++) {
                DamageItem it = damageReport.getDamageItems().get(i);
                // Tillad tom linje (fx placeholder) – vi tjekker kun hvis der ER en pris
                if (it != null && it.getDamageItemPrice() != null) {
                    if (!ValidationUtil.isNonNegativeWithMaxDigits(it.getDamageItemPrice(), 6, 2)) {
                        model.addAttribute("priceError", "Pris må ikke være negativ og må maks have 6 cifre før komma og 2 decimaler.");
                        hasErrors = true;
                        break;
                    }
                }
            }
        }

// Hvis der er fejl: vi returnerer samme view med fejlbeskeder – og sørger for at lease-info og totals vises
        if (hasErrors) {
            Integer leaseId = damageReport.getLeasingContractId();
            if (leaseId != null) {
                loadLeaseInfo(leaseId, model, damageReport.getTotalKm());
            }
            // Beregn totals så felterne vises korrekt efter fejl
            damageReportService.recalc(damageReport);
            model.addAttribute("damageReport", damageReport);
            return "damageDepartmentHTML/damageReportForm";
        }


// --- Slut validering ---

        DamageReport saved = damageReportService.processAndSaveDamageReport(damageReport);
        Integer leaseId = saved.getLeasingContractId();
        return (leaseId != null)
                ? "redirect:/damageReportForm/new?leaseId=" + leaseId
                : "redirect:/damageReportForm/new";
    }

// Helper til at se info fra leasingkontrakt og bil

    private void loadLeaseInfo(Integer leaseId, Model model, Integer totalKmInput) {
        LeaseContract lease = leaseContractRepo.findById(leaseId.longValue());
        if (lease == null) return;

        Car car = carRepo.findById(lease.getVehicleId()).orElse(null);
        int mileage = (car != null) ? car.getMileage() : 0;

        int drivenKm = damageReportService.calculateDrivenKm(totalKmInput, mileage);
        double extraKmPrice = damageReportService.calculateExtraKmPrice(totalKmInput, mileage, lease.getSubscription());

        model.addAttribute("vehicleId", lease.getVehicleId());
        model.addAttribute("renterId", lease.getRenterId());
        model.addAttribute("drivenKm", drivenKm);
        model.addAttribute("extraKmPrice", extraKmPrice);
    }

// Tilbageknap i damageDepartment

    @GetMapping
    public String overview(Model model) {
        return "damageDepartmentHTML/damageDepartment"; // hvis du har en anden side
    }
}
