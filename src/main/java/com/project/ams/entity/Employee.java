package com.project.ams.entity;

import java.util.Date;

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
	
	@Column(name="password")
	private String password;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_type")
	private String empType;
	
	@Column(name="curr_designation")
	private String currentDesignation;
	
	@Column(name="project_code")
	private String projectCode;
	
	@Column(name="location")
	private String location;
	
	@Column(name="project_name")
	private String projectName;
	
	@Column(name="ibu")
	private String ibu;
	
	@Column(name="permanent_address")
	private String premanentAddress;
	
	@Column(name="local_address")
	private String localAddress;

	@Column(name="passport_number")
	private String passportNumber;
	
	@Column(name="passport_issue_date")
	private Date passportIssueDate;
	
	@Column(name="passport_expiry_date")
	private Date passportExpiryDate;
	
	@Column(name="issuing_office")
	private String issuingOffice;
	
	@Column(name="mobile_number")
	private int mobileNumber;
	
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


	public Employee(String password, String empName, String empType, String currentDesignation, String projectCode,
			String location, String projectName, String ibu, String premanentAddress, String localAddress,
			String passportNumber, Date passportIssueDate, Date passportExpiryDate, String issuingOffice,
			int mobileNumber, String educationalQualifications, String skills, int yearsExp, String prevEmployers,
			String prevDesignation) {
		this.password = password;
		this.empName = empName;
		this.empType = empType;
		this.currentDesignation = currentDesignation;
		this.projectCode = projectCode;
		this.location = location;
		this.projectName = projectName;
		this.ibu = ibu;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpType() {
		return empType;
	}


	public void setEmpType(String empType) {
		this.empType = empType;
	}


	public String getCurrentDesignation() {
		return currentDesignation;
	}


	public void setCurrentDesignation(String currentDesignation) {
		this.currentDesignation = currentDesignation;
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


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getIbu() {
		return ibu;
	}


	public void setIbu(String ibu) {
		this.ibu = ibu;
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


	public Date getPassportIssueDate() {
		return passportIssueDate;
	}


	public void setPassportIssueDate(Date passportIssueDate) {
		this.passportIssueDate = passportIssueDate;
	}


	public Date getPassportExpiryDate() {
		return passportExpiryDate;
	}


	public void setPassportExpiryDate(Date passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}


	public String getIssuingOffice() {
		return issuingOffice;
	}


	public void setIssuingOffice(String issuingOffice) {
		this.issuingOffice = issuingOffice;
	}


	public int getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(int mobileNumber) {
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
		return "Employee [empNum=" + empNum + ", password=" + password + ", empName=" + empName + ", empType=" + empType
				+ ", currentDesignation=" + currentDesignation + ", projectCode=" + projectCode + ", location="
				+ location + ", projectName=" + projectName + ", ibu=" + ibu + ", premanentAddress=" + premanentAddress
				+ ", localAddress=" + localAddress + ", passportNumber=" + passportNumber + ", passportIssueDate="
				+ passportIssueDate + ", passportExpiryDate=" + passportExpiryDate + ", issuingOffice=" + issuingOffice
				+ ", mobileNumber=" + mobileNumber + ", educationalQualifications=" + educationalQualifications
				+ ", skills=" + skills + ", yearsExp=" + yearsExp + ", prevEmployers=" + prevEmployers
				+ ", prevDesignation=" + prevDesignation + "]";
	}
}
