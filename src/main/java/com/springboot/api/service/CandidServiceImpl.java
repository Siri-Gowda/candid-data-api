package com.springboot.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.api.model.CandidDetails;
import com.springboot.api.repository.CandidRepository;

@Service
public class CandidServiceImpl implements CandidService {
	private static final Logger logger = LoggerFactory.getLogger(CandidServiceImpl.class);
	
	@Autowired
	private CandidRepository candidRepository;

	@Override
	public String insertCandidDetails(CandidDetails candidDetails) {
		logger.info("Details in service layer::"+candidDetails);
		candidRepository.save(candidDetails);
		
		return "Data inserted";
	}

	@Override
	public CandidDetails getCandidDetailsfullName(String fullName) {
		logger.info("Name in service layer::"+fullName);
		CandidDetails response = candidRepository.findByfullName(fullName);
		return response;
	}


	}

	


