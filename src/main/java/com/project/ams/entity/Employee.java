package com.project.ams.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	// Define Fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_num")
	private int empNum;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="curr_ibu")
	private String currentIBU;
	
	@Column(name="project_code")
	private String projectCode;
	
	@Column(name="location")
	private String location;
	
	@Column(name="permanent_address")
	private String premanentAddress;
	
	@Column(name="local_address")
	private String localAddress;

	@Column(name="passport_number")
	private String passportNumber;
	
	@Column(name="passport_issue_date")
	private String passportIssueDate;
	
	@Column(name="passport_expiry_date")
	private String passportExpiryDate;
	
	@Column(name="issuing_office")
	private String issuingOffice;
	
	@Column(name="mobile_number")
	private String mobileNumber;
	
	@Column(name="educational_qualifications")
	private String educationalQualifications;
	
	@Column(name="skills")
	private String skills;
	
	@Column(name="years_exp")
	private int yearsExp;
	
	@Column(name="prev_employers")
	private String prevEmployers;
	
	@Column(name="prev_designation")
	private String prevDesignation;
	
	
	// Define Constructor
	public Employee() {}
	
	public Employee(String empName, String currentIBU, String projectCode, String location,
			String premanentAddress, String localAddress, String passportNumber, String passportIssueDate,
			String passportExpiryDate, String issuingOffice, String mobileNumber, String educationalQualifications,
			String skills, int yearsExp, String prevEmployers, String prevDesignation) {
		this.empName = empName;
		this.currentIBU = currentIBU;
		this.projectCode = projectCode;
		this.location = location;
		this.premanentAddress = premanentAddress;
		this.localAddress = localAddress;
		this.passportNumber = passportNumber;
		this.passportIssueDate = passportIssueDate;
		this.passportExpiryDate = passportExpiryDate;
		this.issuingOffice = issuingOffice;
		this.mobileNumber = mobileNumber;
		this.educationalQualifications = educationalQualifications;
		this.skills = skills;
		this.yearsExp = yearsExp;
		this.prevEmployers = prevEmployers;
		this.prevDesignation = prevDesignation;
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

	public String getCurrentIBU() {
		return currentIBU;
	}

	public void setCurrentIBU(String currentIBU) {
		this.currentIBU = currentIBU;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPremanentAddress() {
		return premanentAddress;
	}

	public void setPremanentAddress(String premanentAddress) {
		this.premanentAddress = premanentAddress;
	}

	public String getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPassportIssueDate() {
		return passportIssueDate;
	}

	public void setPassportIssueDate(String passportIssueDate) {
		this.passportIssueDate = passportIssueDate;
	}

	public String getPassportExpiryDate() {
		return passportExpiryDate;
	}

	public void setPassportExpiryDate(String passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}

	public String getIssuingOffice() {
		return issuingOffice;
	}

	public void setIssuingOffice(String issuingOffice) {
		this.issuingOffice = issuingOffice;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEducationalQualifications() {
		return educationalQualifications;
	}

	public void setEducationalQualifications(String educationalQualifications) {
		this.educationalQualifications = educationalQualifications;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public int getYearsExp() {
		return yearsExp;
	}

	public void setYearsExp(int yearsExp) {
		this.yearsExp = yearsExp;
	}

	public String getPrevEmployers() {
		return prevEmployers;
	}

	public void setPrevEmployers(String prevEmployers) {
		this.prevEmployers = prevEmployers;
	}

	public String getPrevDesignation() {
		return prevDesignation;
	}

	public void setPrevDesignation(String prevDesignation) {
		this.prevDesignation = prevDesignation;
	}
	

	// Define toString Method
	@Override
	public String toString() {
		return "Employee [empNum=" + empNum + ", empName=" + empName + ", currentIBU="
				+ currentIBU + ", projectCode=" + projectCode + ", location=" + location + ", premanentAddress="
				+ premanentAddress + ", localAddress=" + localAddress + ", passportNumber=" + passportNumber
				+ ", passportIssueDate=" + passportIssueDate + ", passportExpiryDate=" + passportExpiryDate
				+ ", issuingOffice=" + issuingOffice + ", mobileNumber=" + mobileNumber + ", educationalQualifications="
				+ educationalQualifications + ", skills=" + skills + ", yearsExp=" + yearsExp + ", prevEmployers="
				+ prevEmployers + ", prevDesignation=" + prevDesignation + "]";
	}
}
