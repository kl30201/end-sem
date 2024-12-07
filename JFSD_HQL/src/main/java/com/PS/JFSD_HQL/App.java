package com.PS.JFSD_HQL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
    	try
        {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sess = cfg.buildSessionFactory();
        Session s = sess.openSession();
        Transaction txn = s.beginTransaction();
        Student_details sd = new Student_details();
        sd.setDeptid(8);
        sd.setSname("Sandy");
        sd.setGender("male");
        sd.setHod("Dr.raju");
        sd.setLocation("m-block");
        s.save(sd);
        txn.commit();
        }catch(Exception e) {
            e.printStackTrace();
          }
    }    
      }
