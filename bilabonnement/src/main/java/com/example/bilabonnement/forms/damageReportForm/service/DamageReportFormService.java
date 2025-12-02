package com.example.bilabonnement.forms.damageReportForm.service;

import com.example.bilabonnement.forms.BaseForm;
import com.example.bilabonnement.forms.damageReportForm.model.DamageItem;
import com.example.bilabonnement.forms.damageReportForm.model.DamageReport;
import com.example.bilabonnement.forms.damageReportForm.repository.DamageReportFormRepository;
import org.springframework.stereotype.Service;

@Service
public class DamageReportFormService implements BaseForm {

    private final DamageReportFormRepository repository;

    public DamageReportFormService(DamageReportFormRepository repository) {
        this.repository = repository;
    }

    public void saveForm(Object form) {
        DamageReport report = (DamageReport) form;
        for (DamageItem item : report.getDamageItems()) {
            item.setDamageReport(report);
        }

        repository.save(report);
    }
}