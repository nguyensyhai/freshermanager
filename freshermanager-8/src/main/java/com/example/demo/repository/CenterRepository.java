package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Center;
 
@Repository
public interface CenterRepository extends JpaRepository<Center, Integer> {
	public Center findCenterByName(String name);
}
