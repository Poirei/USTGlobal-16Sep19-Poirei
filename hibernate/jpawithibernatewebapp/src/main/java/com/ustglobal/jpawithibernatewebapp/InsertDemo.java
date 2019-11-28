package com.ustglobal.jpawithibernatewebapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernatewebapp.dto.Product;

public class InsertDemo {
	public static void main(String[] args) {

		Product product = new Product();

		product.setPId(101);
		product.setPName("Pencil");
		product.setQuantity(100);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(product);
			System.out.println("Record saved.");
			entityTransaction.commit();

		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		entityManager.close();

	}

}
