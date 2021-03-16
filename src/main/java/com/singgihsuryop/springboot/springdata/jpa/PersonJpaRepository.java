package com.singgihsuryop.springboot.springdata.jpa;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJpaRepository extends JpaRepository<PersonEntity, String>{

	List<PersonEntity> findByName(String name);
	
}
