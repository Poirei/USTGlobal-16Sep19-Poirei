package com.ustglobal.jpawithibernatewebapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteWithJPQL {

	public static void main(String[] args) {

		String jpql = "delete from Product where pId = 102";

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();

			Query query = entityManager.createQuery(jpql);
			entityTransaction.begin();
			System.out.println("Transaction started.");
			int count = query.executeUpdate();
			System.out.println(count + " Row(s) deleted.");
			entityTransaction.commit();

		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();

		}
		entityManager.close();
	}

}
