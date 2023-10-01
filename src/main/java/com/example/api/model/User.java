package com.example.api.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;

@Document
public class User {
	
	@Id
	private String Id;
	
	@Field
	private String FirstName;
	
	@Field
	private String LastName;

	public User() {}
	
	

	public User(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}



	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}



	@Override
	public String toString() {
		return "User [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}

	
	
}
	
