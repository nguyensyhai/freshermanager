package com.example.demo.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Center;
import com.example.demo.model.Fresher;

public interface FresherRepository extends JpaRepository<Fresher,Integer> {

	public List<Fresher> findByCenter(Center center);
	public Fresher findFresherByName(String name);
	public Fresher findFresherByEmail(String email);
	public List<Fresher> findByName(String name);
	public List<Fresher> findByEmail(String email);
	public List<Fresher> findByPl(String pl);
	
	@Query("SELECT p FROM Fresher p WHERE p.averagepoint BETWEEN ?1 AND ?2")
	public List<Fresher> findByAveragepoint(float min ,float max);
	
	@Query("SELECT COUNT (*) FROM Fresher WHERE averagepoint BETWEEN ?1 AND ?2")
	public Long countByAv(float min,float max);
	
	public Long countByCenter(Center center);
}
