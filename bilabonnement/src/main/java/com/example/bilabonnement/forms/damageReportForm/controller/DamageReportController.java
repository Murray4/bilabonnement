package com.example.bilabonnement.forms.damageReportForm.controller;

import com.example.bilabonnement.forms.damageReportForm.model.DamageReport;
import com.example.bilabonnement.forms.damageReportForm.model.DamageItem;
import com.example.bilabonnement.forms.damageReportForm.service.DamageReportFormService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.DriverManager;


@Controller
@RequestMapping("/damage-report")
public class DamageReportController {

    private final DamageReportFormService service;

    public DamageReportController(DamageReportFormService service) {
        this.service = service;
    }


    @GetMapping("/testdb")
    public String testDB() {
        try (Connection c = DriverManager.getConnection(
                System.getenv("DB_URL"),
                System.getenv("DB_USER"),
                System.getenv("DB_PASSWORD"))) {
            return "Database connection works!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }


    // GET: Vis formularen
    @GetMapping("/damageReportForm")
    public String showDamageReportForm(Model model) {
        // Opret et tomt DamageReport-objekt som Thymeleaf skal binde data til
        DamageReport damageReport = new DamageReport();
        damageReport.getDamageItems().add(new DamageItem()); // én tom række til start

        model.addAttribute("damageReport", damageReport);
        return "forms/damageReportForm";
    }

    // POST: Gem formularen
    @PostMapping("/damageReportForm")
    public String save(@ModelAttribute DamageReport damageReport) {

        // Fix: rebind items så de har parent
        for (DamageItem item : damageReport.getDamageItems()) {
            item.setDamageReport(damageReport);
        }

        service.saveForm(damageReport);

        return "redirect:/damage-report?success";
    }
}
