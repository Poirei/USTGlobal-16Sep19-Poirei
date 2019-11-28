package com.ustglobal.jpawithibernatebookapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernatebookapp.dto.Books;

public class RetrieveBook {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			
			Books book = entityManager.find(Books.class, 401);
			
			if (book != null) {
				System.out.println("ID : " + book.getBId());
				System.out.println("Name : " + book.getName());
				System.out.println("ISBN No. : " + book.getIsbnNo());
				System.out.println("Author : " + book.getAuthor());
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		entityManager.close();
	}
	
}
