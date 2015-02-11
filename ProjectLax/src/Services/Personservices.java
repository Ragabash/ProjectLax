/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import DAL.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author 11628
 */
public class Personservices {
        
    public static void Save(Person person){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectLaxPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        trans.begin();
        em.persist(person);
        trans.commit();
        em.close();
        emf.close();
    }
    
    
}
