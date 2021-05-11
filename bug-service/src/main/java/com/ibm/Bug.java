package com.ibm;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;

public class Bug {
	@Id
	private String id;
	
	private String name;
	
	private TYPE type;
	
	private SEVERITY severity;
		
	private String projectId;
	
	private PRIORITY priority;
	
	private STATUS status;
	
	private String module;
	
	private String synopsis;
	
	private String description;
	
	private String product;
	private String location;
	private String buildVersion;
	private String developerId;
	private String testerId;
	private Date submittedOn;
	private Date eta;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.trim();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module.trim();
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description.trim();
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public SEVERITY getSeverity() {
		return severity;
	}

	public void setSeverity(SEVERITY severity) {
		this.severity = severity;
	}

	public PRIORITY getPriority() {
		return priority;
	}

	public void setPriority(PRIORITY priority) {
		this.priority = priority;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		if(status==STATUS.NOT_A_BUG || status==STATUS.DUPLICATE || status==STATUS.REJECTED || status==STATUS.WONT_FIX ) {
			this.status = STATUS.CLOSED;
		}
		else if(status==STATUS.DEFERRED || status==STATUS.NEED_MORE_INFO ) {
			this.status = STATUS.ASSIGNED;
		}
		else {
			this.status = status;
		}
		}
		
	

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuildVersion() {
		return buildVersion;
	}

	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(String developerId) {
		this.developerId = developerId;
	}

	public String getTesterId() {
		return testerId;
	}

	public void setTesterId(String testerId) {
		this.testerId = testerId;
	}

	public Date getSubmittedOn() {
		return submittedOn;
	}

	public void setSubmittedOn(Date submittedOn) {
		
		this.submittedOn = submittedOn;
	}

	public Date getEta() {
		return eta;
	}

	public void setEta(Date eta) {
		if (eta.compareTo(new Date()) < 0) {
			throw new IllegalArgumentException("ETA cannot be past date");
		}
		this.eta = eta;
	}

}
