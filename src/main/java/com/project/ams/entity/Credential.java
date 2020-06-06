package com.project.ams.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credential")
public class Credential {

	// Define Fields
	@Id
	@Column(name="emp_num")
	private int empNum;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="auth_token")
	private String authToken;
	
	// Define Constructor
	public Credential() {}

	public Credential(int empNum, String empName, String password, String authToken) {
		this.empNum = empNum;
		this.empName = empName;
		this.password = password;
		this.authToken = authToken;
	}
	
	
	// Define Getter/Setter
	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	
	// Define toString Method
	@Override
	public String toString() {
		return "Credentials [empNum=" + empNum + ", empName=" + empName + ", password=" + password + ", authToken="
				+ authToken + "]";
	}
	
}
