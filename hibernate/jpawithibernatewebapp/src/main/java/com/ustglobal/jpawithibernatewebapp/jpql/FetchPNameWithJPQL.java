package com.ustglobal.jpawithibernatewebapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithibernatewebapp.dto.Product;

public class FetchPNameWithJPQL {
	
	public static void main(String[] args) {
		
		String jpql = "select pName from Product";
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery(jpql);
		List<String> list = query.getResultList();
		
		for (String product : list) {
			System.out.println(product);
		}
	}
	
}
