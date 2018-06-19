package com.fico.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
@Entity
@Table(name="EMPLOYEE")
public class Employee {
@Id
@Column(name="EMPID")
private int employeeId;
@Column(name="EMPNAME")
private String employeeName;
@Column(name="PRIMARYEMAIL")
private String primaryEmail;
@Column(name="OFFICEEMAIL")
private String email;
@Column(name="CONTACT")
private String contact;
@Column(name="POSITION")
private String position;
@Column(name="TEAM")
private String team;
public Employee() {
	
}
public Employee(int employeeId, String employeeName, String primaryEmail, String email, String contact, String position,
		String team) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.primaryEmail = primaryEmail;
	this.email = email;
	this.contact = contact;
	this.position = position;
	this.team = team;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getPrimaryEmail() {
	return primaryEmail;
}
public void setPrimaryEmail(String primaryEmail) {
	this.primaryEmail = primaryEmail;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}

}
