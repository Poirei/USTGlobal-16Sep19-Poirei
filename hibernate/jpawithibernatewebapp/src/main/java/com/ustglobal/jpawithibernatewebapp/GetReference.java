package com.ustglobal.jpawithibernatewebapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernatewebapp.dto.Product;

public class GetReference {

	public static void main(String[] args) {

		EntityManager entityManager = null;

		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();

			Product product = entityManager.getReference(Product.class, 102);
			System.out.println(product.getPId());

		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
	}

}
