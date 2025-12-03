package com.example.bilabonnement.damageDepartment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DamageController {
    @GetMapping("/damageDepartment")
    public String damage(Model model) {
        model.addAttribute("activePage", "damageDepartment");
        return "damageDepartmentHTML/damageDepartment";
    }
}
