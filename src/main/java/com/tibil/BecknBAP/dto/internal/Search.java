package com.tibil.BecknBAP.dto.internal;

import java.util.List;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Search {
	
	@NotNull(message= "Provide a designation")
	private String designation;
	@Min(0)
	private int experience;
	@NotEmpty(message= "Provide aleast one technology")
	private List<String> technologies;
	
	public Search(String designation, int experiance, List<String> technologies) {
		super();
		this.designation = designation;
		this.experience = experiance;
		this.technologies = technologies;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	
	

}
