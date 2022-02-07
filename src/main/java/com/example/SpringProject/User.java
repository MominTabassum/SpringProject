package com.example.SpringProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this clas
@Table(name="project")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer project_id;



	private String project_name;



	private String project_desc;



	public Integer getproject_id() {
	return project_id;
	}



	public void setproject_id(Integer project_id) {
	this. project_id =  project_id;
	}



	public String getproject_name() {
	return project_name;
	}



	public void setproject_name(String project_name) {
	this.project_name = project_name;
	}



	public String getproject_desc() {
	return project_desc;
	}



	public void setproject_desc(String project_desc) {
	this.project_desc = project_desc;
	}
	
	

}
