package com.joaoplg.musicas.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

   private static final String PERSISTENCE_UNIT = "ripandoBaseConhecimento";
   
   private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
   
   private JpaUtil() {
      
   }

   public static EntityManager getEntityManager() {
      return factory.createEntityManager();
   }
   
}
