package com.ustglobal.jpawithibernatebookapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernatebookapp.dto.Books;

public class DeleteBook {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			Books book = entityManager.find(Books.class, 402);
			
			if (book != null) {
				entityManager.remove(book);
				System.out.println("Record deleted.");
			} else {
				System.out.println("No book found with such ID.");
			}
			
			entityTransaction.commit();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		
	}
	
}
