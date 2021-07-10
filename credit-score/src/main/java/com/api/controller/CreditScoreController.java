package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.api.entity.CreditScore;
import com.api.service.CreditScoreService;


@RestController
public class CreditScoreController {
	@Autowired
	CreditScoreService creditScoreService;
	
	@GetMapping("/creditscore/{panCard}")
	private CreditScore getCreditScore(@PathVariable("panCard") String panCard) {
		return creditScoreService.getCreditScore(panCard);	
	}
}
