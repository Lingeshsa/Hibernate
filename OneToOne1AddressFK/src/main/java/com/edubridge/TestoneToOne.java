package com.edubridge;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestoneToOne {

	public static void main(String[] args) {
		
				System.out.println("Storing the data");
				try {
					Configuration cfg = new Configuration();

					cfg.configure("hibernate.cfg.xml");// populates the data of the configuration file

					// creating seession factory object
					SessionFactory factory = cfg.buildSessionFactory();
					Session session2 = factory.openSession();
					session2.close();

					System.out.println("successfully saved");
				} catch (Exception ex) {
					System.out.println("Problem in connection" + ex.getMessage());
				}
			


	}

}
