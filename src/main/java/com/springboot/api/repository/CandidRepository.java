package com.springboot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.api.model.CandidDetails;

@Repository
public interface CandidRepository extends JpaRepository<CandidDetails, String> {

	@Query(value="select * from resume c where c.num= ?1",nativeQuery = true)
	CandidDetails findByfullName(String fullName);

}
