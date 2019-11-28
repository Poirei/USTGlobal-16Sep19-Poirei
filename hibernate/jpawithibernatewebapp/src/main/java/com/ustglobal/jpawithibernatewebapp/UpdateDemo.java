package com.ustglobal.jpawithibernatewebapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.ustglobal.jpawithibernatewebapp.dto.Product;

public class UpdateDemo {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			Product product = entityManager.find(Product.class, 101);
			product.setPName("Potato");
			System.out.println("Record updated.");
			entityTransaction.commit();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		
		entityManager.close();
		
	}
	
}
