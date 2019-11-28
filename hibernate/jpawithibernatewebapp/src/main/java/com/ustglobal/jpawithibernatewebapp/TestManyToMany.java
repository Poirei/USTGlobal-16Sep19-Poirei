package com.ustglobal.jpawithibernatewebapp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernatewebapp.manytomany.Course;
import com.ustglobal.jpawithibernatewebapp.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setSId(401);
		student1.setSName("KSI");

		Course course1 = new Course();
		course1.setCId(104);
		course1.setCName("Web Tech.");

		Course course2 = new Course();
		course2.setCId(118);
		course2.setCName("DBMS");

		List<Course> list = new ArrayList<Course>();

		list.add(course1);
		list.add(course2);

		student1.setCourses(list);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			System.out.println("transaction started.");
			
			entityManager.persist(student1);
			
			entityTransaction.commit();
			System.out.println("transaction committed.");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
			System.out.println("transaction rolled back!");
			
		}
		entityManager.close();
	}

}
