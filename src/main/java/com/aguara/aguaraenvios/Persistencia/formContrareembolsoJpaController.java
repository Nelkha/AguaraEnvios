/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguara.aguaraenvios.Persistencia;

import com.aguara.aguaraenvios.Models.formContrareembolso;
import com.aguara.aguaraenvios.Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Nelkha
 */
public class formContrareembolsoJpaController implements Serializable {

    public formContrareembolsoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(formContrareembolso formContrareembolso) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(formContrareembolso);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(formContrareembolso formContrareembolso) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            formContrareembolso = em.merge(formContrareembolso);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = formContrareembolso.getIdComprobante();
                if (findformContrareembolso(id) == null) {
                    throw new NonexistentEntityException("The formContrareembolso with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            formContrareembolso formContrareembolso;
            try {
                formContrareembolso = em.getReference(formContrareembolso.class, id);
                formContrareembolso.getIdComprobante();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The formContrareembolso with id " + id + " no longer exists.", enfe);
            }
            em.remove(formContrareembolso);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<formContrareembolso> findformContrareembolsoEntities() {
        return findformContrareembolsoEntities(true, -1, -1);
    }

    public List<formContrareembolso> findformContrareembolsoEntities(int maxResults, int firstResult) {
        return findformContrareembolsoEntities(false, maxResults, firstResult);
    }

    private List<formContrareembolso> findformContrareembolsoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(formContrareembolso.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public formContrareembolso findformContrareembolso(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(formContrareembolso.class, id);
        } finally {
            em.close();
        }
    }

    public int getformContrareembolsoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<formContrareembolso> rt = cq.from(formContrareembolso.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
