package com.example.bilabonnement.forms.damageReportForm.repository;

import com.example.bilabonnement.forms.damageReportForm.model.DamageReport;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class DamageReportFormRepository {

    @PersistenceContext
    private EntityManager em;

    public DamageReport save(DamageReport report) {
        if (report.getDamageReport_ID() == null) {
            em.persist(report);   // INSERT
            return report;
        } else {
            return em.merge(report); // UPDATE
        }
    }

//    public DamageReport findById(Long id) {
//        return em.find(DamageReport.class, id);
//    }

//    public List<DamageReport> findAll() {
//        return em.createQuery("SELECT r FROM DamageReport r", DamageReport.class)
//                .getResultList();
//    }

////    public void delete(Long id) {
////        DamageReport r = em.find(DamageReport.class, id);
////        if (r != null) {
////            em.remove(r);
////        }
//    }
}

