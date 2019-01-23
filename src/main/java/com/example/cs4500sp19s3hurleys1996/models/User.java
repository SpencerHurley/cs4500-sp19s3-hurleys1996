package com.example.cs4500sp19s3hurleys1996.models;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	
	public User(Integer id, String username, String password, String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPassword(password);
		this.setUsername(username);
	}
	public Integer getId() {
		return id;
	}
 	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
