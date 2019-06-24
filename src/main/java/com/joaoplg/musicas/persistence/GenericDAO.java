package com.joaoplg.musicas.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.joaoplg.musicas.entities.Entidade;

public class GenericDAO<T extends Entidade> {

   private static final String PERSISTENCE_UNIT = "musicas";
   
   private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
   
   private Class<T> classe;

   protected GenericDAO(Class<T> classe) {
      this.classe = classe;
   }
   
   protected EntityManager getEntityManager() {
      return factory.createEntityManager();
   }
   
   public T persistir(T entidade) {
      EntityManager em = this.getEntityManager();
      em.getTransaction().begin();
      em.persist(entidade);
      em.getTransaction().commit();
      return entidade;
   }

   public T atualizar(T entidade) {
      EntityManager em = this.getEntityManager();
      em.getTransaction().begin();
      em.merge(entidade);
      em.flush();
      em.getTransaction().commit();
      return entidade;
   }

   public void remover(Serializable id) {
      EntityManager em = this.getEntityManager();
      em.getTransaction().begin();
      T entidade = this.findById(id);
      em.remove(entidade);
      em.flush();
      em.getTransaction().commit();
   }

   public T findById(Serializable id) {
      EntityManager em = this.getEntityManager();
      return em.find(classe, id);
   }

   public List<T> getAll() {
      EntityManager em = this.getEntityManager();
      CriteriaBuilder builder = em.getCriteriaBuilder();
      CriteriaQuery<T> query = builder.createQuery(classe);
      query.from(classe);
      return em.createQuery(query).getResultList();      
   }
   
}
