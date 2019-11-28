package com.ustglobal.jpawithibernatewebapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernatewebapp.manytone.Pencil;
import com.ustglobal.jpawithibernatewebapp.manytone.PencilBox;

public class TestManyToOne {
	
	public static void main(String[] args) {
		
		Pencil pencil1 = new Pencil();
		pencil1.setPId(1);
		pencil1.setColor("Black");
		
		Pencil pencil2 = new Pencil();
		pencil2.setColor("Green");
		pencil2.setPId(2);
		
		PencilBox pencilBox = new PencilBox();
		pencilBox.setPbId(234);
		pencilBox.setPbName("Apsara Box.");
		
		pencil1.setPBox(pencilBox);
		pencil2.setPBox(pencilBox);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			System.out.println("Transaction started.");
			
			entityManager.persist(pencil1);
			entityManager.persist(pencil2);
			
			entityTransaction.commit();
			System.out.println("Transaction committed.");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
			System.out.println("Transaction rolled back.");
			
		}
		entityManager.close();
	}
	
}
