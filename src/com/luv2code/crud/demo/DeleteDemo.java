package com.luv2code.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.domain.demo.Student;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			int theId = 1;
			
			session.beginTransaction();
			Instructor tempIns = session.get(Instructor.class, theId);
			session.delete(tempIns);
			System.out.println("deleteing : "+tempIns);
			session.getTransaction().commit();
		}finally {
			factory.close();
		}
	}

}
