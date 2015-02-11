/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


import DAL.Team;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Steve
 */
public class TeamServices {
  public static void Save(Team team){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectLaxPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        trans.begin();
        em.persist(team);
        trans.commit();
        em.close();
        emf.close();
    }   
  
  public static void main( String[ ] args ) 
   {
   	EntityManagerFactory emfactory = Persistence.
   			createEntityManagerFactory( "ProjectLaxPU" );
   	EntityManager entitymanager = emfactory.
   			createEntityManager( );
   	entitymanager.getTransaction( ).begin( );
   	Team team=entitymanager.
   			find( Team.class, 2 );
   	entitymanager.remove( team );
   	entitymanager.getTransaction( ).commit( );
   	entitymanager.close( );
   	emfactory.close( );
   }
  
}
