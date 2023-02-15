package com.xworkz.egg.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.egg.dto.CmDto;



@Repository
public class CmRepositoryImpl implements CmRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public CmRepositoryImpl() {

		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(CmDto dto) {
		System.out.println("running save..." + dto);

		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(dto);
		transaction.commit();
		manager.close();
		return true;
	}

}
