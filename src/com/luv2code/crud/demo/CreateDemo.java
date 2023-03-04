package com.luv2code.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.domain.demo.Student;

public class CreateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
//			Instructor tempInstructor = new Instructor("Chad","Darby","chad@luv2code.com");
//			InstructorDetail tempInstructorDetail = new InstructorDetail("youtube.com/luv2code","luv 2 code!!!");
			Instructor tempInstructor = new Instructor("Mad","Good","chad@luv2code.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("youtube.com/G","Guitar");
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			session.beginTransaction();
			session.save(tempInstructor);
			session.getTransaction().commit();
		}finally {
			factory.close();
		}
	}

}
