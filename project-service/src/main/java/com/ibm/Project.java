package com.ibm;

import java.util.ArrayList;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class Project {

	@Id
	private String id;
	

	@NotNull
	private String name;
	@NotNull
	private String type;
	private ArrayList<String> developerId;
	private ArrayList<String> testerId;
	private ArrayList<String> managerId;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<String> getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(ArrayList<String> developerId) {
		this.developerId = developerId;
	}

	public ArrayList<String> getTesterId() {
		return testerId;
	}

	public void setTesterId(ArrayList<String> testerId) {
		this.testerId = testerId;
	}

	public ArrayList<String> getManagerId() {
		return managerId;
	}

	public void setManagerId(ArrayList<String> managerId) {
		this.managerId = managerId;
	}

}
