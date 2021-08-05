package com.vinodh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinodh.mongodb.model.Common;
import com.vinodh.mongodb.model.Employe;
import com.vinodh.mongodb.repository.CommonRepository;
import com.vinodh.mongodb.repository.EmployeeRepository;

@Service
public class CommonService {

	@Autowired
	private CommonRepository commonRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;

	public Common insertCoomonInfo(Common common) {
		common.setId(sequenceGeneratorService.getSequenceNumber(Common.SEQUENCE_NAME));
		return commonRepository.save(common);
	}

	public Employe saveEmpolyeeInfo(Employe employe) {
		employe.setEmpoyeeId(sequenceGeneratorService.getSequenceNumber(Employe.SEQUENCE_NAME));
		return employeeRepository.save(employe);
	}

}
