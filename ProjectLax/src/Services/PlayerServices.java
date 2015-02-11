/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.Player;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Steve
 */
public class PlayerServices {
     public static void Save(Player player){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectLaxPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        trans.begin();
        em.persist(player);
        trans.commit();
        em.close();
        emf.close();
    }
     
     public static void Delete(Player player){
     
         
     
     
     }
}
