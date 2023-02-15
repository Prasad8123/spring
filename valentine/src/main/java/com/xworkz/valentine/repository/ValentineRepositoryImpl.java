package com.xworkz.valentine.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.entity.ValentineEntity;

@Repository
public class ValentineRepositoryImpl implements ValentineRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public ValentineRepositoryImpl() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
	}

	@Override
	public boolean save(ValentineEntity entity) {
		
		System.out.println("running save.....");
		EntityManager manager=   entityManagerFactory.createEntityManager();
	EntityTransaction transaction=	manager.getTransaction();
	
	transaction.begin();
	manager.persist(entity);
	transaction.commit();
	manager.close();
		return true;
	}

}
