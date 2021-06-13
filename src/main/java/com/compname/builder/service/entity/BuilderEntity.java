package com.compname.builder.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="builders")

public class BuilderEntity {

	@Id
	private int  id;
	@Column(name="firstName")
	String firstName;
	
	@Column(name="lastName")
	String lastName;
	
	@Column(name="currentAddress")
	String currentAddress;
	
	@Column(name="permaInateAddress")
	String permaInateAddress;
	
	@Column(name="bloodgroup")
	String bloodgroup;
	
	@Column(name="emailId")
	String emailId;
	
	@Column(name="siteNo")
	int siteNo;
	
	@Column(name="addharNumber")
	double addharNumber;
	
	@Column(name="bankAccoutNumber")
	double bankAccoutNumber;
	
	@Column(name="mobileNumber")
	double mobileNumber;
	
	@Column(name="salary")
	double salary;

	public BuilderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BuilderEntity(int id, String firstName, String lastName, String currentAddress, String permaInateAddress,
			String bloodgroup, String emailId, int siteNo, double addharNumber, double bankAccoutNumber,
			double mobileNumber, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.currentAddress = currentAddress;
		this.permaInateAddress = permaInateAddress;
		this.bloodgroup = bloodgroup;
		this.emailId = emailId;
		this.siteNo = siteNo;
		this.addharNumber = addharNumber;
		this.bankAccoutNumber = bankAccoutNumber;
		this.mobileNumber = mobileNumber;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getPermaInateAddress() {
		return permaInateAddress;
	}

	public void setPermaInateAddress(String permaInateAddress) {
		this.permaInateAddress = permaInateAddress;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getSiteNo() {
		return siteNo;
	}

	public void setSiteNo(int siteNo) {
		this.siteNo = siteNo;
	}

	public double getAddharNumber() {
		return addharNumber;
	}

	public void setAddharNumber(double addharNumber) {
		this.addharNumber = addharNumber;
	}

	public double getBankAccoutNumber() {
		return bankAccoutNumber;
	}

	public void setBankAccoutNumber(double bankAccoutNumber) {
		this.bankAccoutNumber = bankAccoutNumber;
	}

	public double getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "BuilderEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", currentAddress="
				+ currentAddress + ", permaInateAddress=" + permaInateAddress + ", bloodgroup=" + bloodgroup
				+ ", emailId=" + emailId + ", siteNo=" + siteNo + ", addharNumber=" + addharNumber
				+ ", bankAccoutNumber=" + bankAccoutNumber + ", mobileNumber=" + mobileNumber + ", salary=" + salary
				+ "]";
	}
	
	
	
	
	
	
}
