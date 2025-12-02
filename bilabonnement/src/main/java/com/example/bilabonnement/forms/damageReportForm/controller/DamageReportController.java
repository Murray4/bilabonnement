package com.example.bilabonnement.forms.damageReportForm.controller;

import com.example.bilabonnement.forms.damageReportForm.model.DamageReport;
import com.example.bilabonnement.forms.damageReportForm.model.DamageItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class DamageReportController {

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
    public String saveDamageReport(@ModelAttribute DamageReport damageReport) {

        // TODO: Send til Service → repository → database
        System.out.println("Report saved:");
        System.out.println("Total KM: " + damageReport.getTotalKm());
        System.out.println("Items: " + damageReport.getDamageItems().size());

        return "redirect:/damageReportForm?success";
    }
}
