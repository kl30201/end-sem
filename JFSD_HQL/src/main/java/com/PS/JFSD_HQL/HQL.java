package com.PS.JFSD_HQL;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class HQL
{
	public static void main( String[] args )
    {

	try
    {

    Configuration cfg = new Configuration();
    cfg.configure();
    SessionFactory sess = cfg.buildSessionFactory();
    
    Session s = sess.openSession();
    Transaction txn = s.beginTransaction()  ;
    //1.HQL query to  display all students  Records
    Query q = s.createQuery("from dept"); //here Student_details persistence class name not table name
    List<Student_details> list =  q.list();
    System.out.println(list);
   for(Student_details s1 : list) {
       System.out.println(s1);
    }
    
   //2.//HQL query to display all student records with specific columns.
   // Query q = s.createQuery("select sid,sname from Student_details where cgpa >7");
   //List<Object[]> sdsob = (List<Object[]>) q.list();
    
    //for(Object[] s1 : sdsob) {
   //System.out.println(s1[0]+ ":" + s1[1]);
    //}
    
    //txn.commit();
   
    
//3.HQL query to display only names of all students whose CGPA is greater than 7. 
    
    /*  Query q = s.createQuery("select sname,sid from Student_details where cgpa>7");
        List<Object[]> sdsob = (List<Object[]>) q.list();
        
        for(Object[] s1 : sdsob) {
        System.out.println(s1[0] + ":" + s1[1]);
        }*/
    
//4.HQL query to delete a Student whose Student ID is 30101 using input parameter (?) as well as named parameter (:)
              
    /*  Query q=s.createQuery("delete from Student_details where sid=:tempid");  
      q.setParameter("tempid",5);        
      int status=q.executeUpdate();  
      System.out.println(status); */
    
   // 5. HQL query to update few details of a student whose Student ID is 30102 using input parameter (?) as well as named parameter (:)  

       /* Query q=s.createQuery("update Student_details set sname=:n where sid=:i");  
        q.setParameter("n","Tulasi Sajja");  
        q.setParameter("i",5);  
          
        int status=q.executeUpdate();  
        System.out.println(status);*/
    

//6.//HQL query to perform aggregate functions like count (*), sum(), avg(), min(), max() functions on CGPA column.

  /*  Query q = s.createQuery("select max(cgpa) from Student_details");
        List<Integer> list=q.list();  
    System.out.println(list.get(0));  */
    
    
   
    
    //7.
    /*CriteriaBuilder cb = s.getCriteriaBuilder();
    CriteriaQuery<Student_details> cq = cb.createQuery(Student_details.class);
    Root<Student_details> root = cq.from(Student_details.class);
    cq.select(root);
    
    Query q = s.createQuery(cq);   //here Student_details persistence class name not table name
    List<Student_details> list =  q.list();
    System.out.println(list);
    for(Student_details s1 : list) {
        System.out.println(s1);
    }
    
    txn.commit();*/
    }catch(Exception e) {
        e.printStackTrace();
      }
}    
  }

