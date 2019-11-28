package com.ustglobal.jpawithibernatewebapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsertWithJPQL {
	
	public static void main(String[] args) {
		
		String jpql = "insert into Product values (:pid, :pname, :quantity)";
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			System.out.println("Transaction started.");
			
			Query query = entityManager.createQuery(jpql);
			query.setParameter("pid", 104);
			query.setParameter("pname", "Smoothie");
			query.setParameter("quantity", 200);
			
			int count = query.executeUpdate();
			System.out.println(count + " Row(s) inserted.");
			entityTransaction.commit();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		entityManager.close();
	}
	
}
