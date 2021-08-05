package com.vinodh.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employe {
	
	@Transient
    public static final String SEQUENCE_NAME = "employe_sequence";
	
	@Id
	private Integer empoyeeId;
	private String name;
	private String salary;
	private Common common;
	
	public Integer getEmpoyeeId() {
		return empoyeeId;
	}
	public void setEmpoyeeId(Integer empoyeeId) {
		this.empoyeeId = empoyeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Common getCommon() {
		return common;
	}
	public void setCommon(Common common) {
		this.common = common;
	}
	@Override
	public String toString() {
		return "Employe [empoyeeId=" + empoyeeId + ", name=" + name + ", salary=" + salary + ", common=" + common + "]";
	}

}
