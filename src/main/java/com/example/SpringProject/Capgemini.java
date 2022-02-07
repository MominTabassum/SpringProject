package com.example.SpringProject;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class Capgemini {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer project_id;
	

}
