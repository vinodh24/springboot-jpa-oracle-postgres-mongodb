package com.vinodh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinodh.mongodb.model.Common;
import com.vinodh.mongodb.model.Employe;
import com.vinodh.service.CommonService;

@RestController
@RequestMapping("/common")
public class CommonController {
	private static final Logger log = LoggerFactory.getLogger(BookController.class);

	@Autowired
	private CommonService commonService;

	@PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
	public Common createOrSaveBookInfo(@RequestBody Common common) {
		log.info("doing common..."+common);
		return commonService.insertCoomonInfo(common);
	}

	@PostMapping(path= "/addEmploye", consumes = "application/json", produces = "application/json")
	public Employe saveEmpolyeeInfo(@RequestBody Employe employe ) {
		log.info("doing employe..."+employe);
		return commonService.saveEmpolyeeInfo(employe);
	}

}
