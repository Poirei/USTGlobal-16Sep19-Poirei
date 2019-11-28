package com.ustglobal.jpawithibernatewebapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernatewebapp.onetone.Person;
import com.ustglobal.jpawithibernatewebapp.onetone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {
		
		VoterCard voterCard = new VoterCard();
		
		voterCard.setVId(130430);
		voterCard.setVName("Gavin King");

		Person person = new Person();
		
		person.setPId(205);
		person.setPName("Lee");
		person.setVoterCard(voterCard);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
//			entityManager.persist(person);
			
			VoterCard vc = entityManager.find(VoterCard.class, 130430);
			System.out.println(vc.getPerson().getPName());
			
			entityTransaction.commit();

		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();

		}
		entityManager.close();
	}

}
