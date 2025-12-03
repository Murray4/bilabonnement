package com.example.bilabonnement.damageDepartment.forms.damageReportForm.repository;

import com.example.bilabonnement.damageDepartment.forms.damageReportForm.model.DamageItem;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class DamageItemRepository {

    @PersistenceContext
    private EntityManager em;


// Finder damage_Items ved at indtaste et report_ID

    public List<DamageItem> findByReportId(Integer reportId) {
        return em.createQuery(
                "select di from DamageItem di " +
                        "where di.damageReport.damageReportId = :rid " +
                        "order by di.damageItemId",
                DamageItem.class
        ).setParameter("rid", reportId).getResultList();
    }

// sletter damage_items ved at indtaste et report_id

    public void deleteByReportId(Integer reportId) {
        em.createQuery("delete from DamageItem di where di.damageReport.damageReportId = :rid")
                .setParameter("rid", reportId)
                .executeUpdate();
    }

// gemmer damage_items ved at indtaste et report_id

    public DamageItem save(DamageItem item) {
        if (item.getDamageItemId() == null) {
            em.persist(item);
            return item;
        } else {
            return em.merge(item);
        }
    }
}
