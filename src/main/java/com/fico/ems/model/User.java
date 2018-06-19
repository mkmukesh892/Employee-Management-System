package com.fico.ems.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="USER")
public class User {
@Id
@GeneratedValue( strategy= GenerationType.AUTO )
@Column(name="USERID")
private int userId;

@Column(name="USERNAME")
private String userName;
@Column(name="EMAILID")
private String email;
@Column(name="DOB")
private String dob;
@Column(name="PASSWORD")
private String password;

public User() {
	
}

public User(int userId, String userName, String email, String dob, String password) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.email = email;
	this.dob = dob;
	this.password = password;
	
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


}
