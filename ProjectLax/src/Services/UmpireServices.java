/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.Umpire;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Steve
 */
public class UmpireServices {
     public static void Save(Umpire umpire){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectLaxPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        trans.begin();
        em.persist(umpire);
        trans.commit();
        em.close();
        emf.close();
    }
}
