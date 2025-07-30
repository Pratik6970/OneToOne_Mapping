package com.app.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.OneToOne.pojos.Mobile;
import com.app.OneToOne.pojos.Student;

public class App 
{
    public static void main( String[] args )
    {
    	  System.out.println("One To One Mapping Here");

         
          Configuration cfg = new Configuration();
          cfg.configure("hibernate.cfg.xml");

          
          SessionFactory sessionFactory = cfg.buildSessionFactory();

          
          Mobile mobile1 = new Mobile();
          mobile1.setMobileName("SAMSUNG");

          Mobile mobile2 = new Mobile();
          mobile2.setMobileName("IPHONE");

        
          Student student1 = new Student();
          student1.setName("Ram");
          student1.setMobile(mobile1); // Assign mobile to student

          Student student2 = new Student();
          student2.setName("Shyam");
          student2.setMobile(mobile2); 

        
          Session session = sessionFactory.openSession();
          Transaction tx = session.beginTransaction();

          
          session.save(mobile1);
          session.save(mobile2);
          session.save(student1);
          session.save(student2);

         
          tx.commit();
          session.close();

          System.out.println("Data saved successfully with One-to-One mapping.");
        
       
         
         
         
       
       
       
       
    }
}
