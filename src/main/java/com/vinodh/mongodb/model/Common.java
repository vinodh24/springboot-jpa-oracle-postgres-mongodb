package com.vinodh.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "common")
public class Common {
	
	@Transient
    public static final String SEQUENCE_NAME = "common_sequence";
	
	@Id
	private Integer id;
	private String subscriberId;
	private String portName;
	private String technology;
	

	public String getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}
	public String getPortName() {
		return portName;
	}
	public void setPortName(String portName) {
		this.portName = portName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Common [subscriberId=" + subscriberId + ", portName=" + portName + ", id=" + id + ", technology="
				+ technology + "]";
	}
	
}
