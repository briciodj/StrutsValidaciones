package org.dao.generic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.modelo.hta.Hta;

public class DaoGeneric {
	
	public void addHta(Hta hta) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			session.save(hta);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
		
	}
}
