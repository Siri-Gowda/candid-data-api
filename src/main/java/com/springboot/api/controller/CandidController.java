package com.springboot.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.model.CandidDetails;
import com.springboot.api.service.CandidService;

@RestController
@RequestMapping("/api")
public class CandidController {
	
	//using log4j to print the logs in console
	private final Logger logger = LoggerFactory.getLogger(CandidController.class);
	
	@Autowired
	private CandidService candidService;
	
	
	/*
	 * post method:
	 *         to create the new data
	 *         @PostMapping
	 */
	
	@PostMapping("/candid-data")
	public String addCandidDetails(@RequestBody CandidDetails candidDetails) {
		logger.info("Candidate Data in controller layer::"+candidDetails);
		String response = "Resume Details";
		return response;
		
		
	}
	@PostMapping("add-candid-data")
	public String insertCandidDetails(@RequestBody CandidDetails candidDetails) {
		logger.info("insert::"+candidDetails);
		String response=candidService.insertCandidDetails(candidDetails);
		return response;
	}
	/*
	 * get method:
	 *     to get (or) retrieve the data
	 *     @GetMapping
	 */
	@GetMapping("/candid-data/{fullName}")
	public CandidDetails getCandidDetailsByfullName(@PathVariable String fullName) {
		logger.info("Name in controller layer::"+fullName);
		CandidDetails response = candidService.getCandidDetailsfullName(fullName);
		return response;
	}
	
		
	}


