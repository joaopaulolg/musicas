package com.joaoplg.musicas.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {

   private static final String PERSISTENCE_UNIT = "ripandoBaseConhecimento";
   
   private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
   
   private JpaUtil() {
      
   }

   public static EntityManager getEntityManager() {
      return factory.createEntityManager();
   }
   
}
