package com.ustglobal.jpawithibernatewebapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernatewebapp.dto.Product;

public class RetrieveDemo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//Product productDetails = entityManager.find(Product.class, 101);
		
		/*
		 * getReference() will return a proxy object, it is generally used when we no
		 * need to access the DB state.
		 */
		Product product = entityManager.getReference(Product.class, 102);
		
		/*
		 * System.out.println("Product ID : " + productDetails.getPId());
		 * System.out.println("Product Name : " + productDetails.getPName());
		 * System.out.println("Product Quantity : " + productDetails.getQuantity());
		 */
		
	}
	
}
