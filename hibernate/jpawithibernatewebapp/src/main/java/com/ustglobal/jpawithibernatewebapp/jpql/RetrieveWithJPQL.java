package com.ustglobal.jpawithibernatewebapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithibernatewebapp.dto.Product;

public class RetrieveWithJPQL {
	
	public static void main(String[] args) {
		
		String qlString = "from Product";
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery(qlString);
		List<Product> list = query.getResultList();
		
		for (Product product : list) {
			System.out.println(product);
		}
		entityManager.close();
		entityManagerFactory.close();
	}
	
}
