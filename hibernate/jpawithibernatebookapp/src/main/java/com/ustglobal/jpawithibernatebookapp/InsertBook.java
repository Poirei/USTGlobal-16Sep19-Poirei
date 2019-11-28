package com.ustglobal.jpawithibernatebookapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernatebookapp.dto.Books;

public class InsertBook {
	
	public static void main(String[] args) {
		
		Books book = new Books();
		
		book.setBId(402);
		book.setIsbnNo(1862594426301L);
		book.setName("PUBG Guide");
		book.setAuthor("Brendan Greene");
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			entityManager.persist(book);
			entityTransaction.commit();
			System.out.println("Record inserted.");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		entityManager.close();
	}
	
}
