package com.ibm.rest.consume.demo.model;

import java.time.Instant;
import java.util.List;

public class Employee {

	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private int age;

	private String departmentId;
	private String roleId;

	private List<String> projectIds;

	private int salary;

	private Instant joiningDate; // ISO date handled properly

	private String status;

	private List<String> skills;

	private double performanceScore;

	private Address address; // Nested object

	private List<String> certifications;

	private boolean managerApproval;
	private boolean remote;

	// Default constructor (MANDATORY)
	public Employee() {
	}

	// Getters & Setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public List<String> getProjectIds() {
		return projectIds;
	}

	public void setProjectIds(List<String> projectIds) {
		this.projectIds = projectIds;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Instant getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Instant joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public double getPerformanceScore() {
		return performanceScore;
	}

	public void setPerformanceScore(double performanceScore) {
		this.performanceScore = performanceScore;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<String> certifications) {
		this.certifications = certifications;
	}

	public boolean isManagerApproval() {
		return managerApproval;
	}

	public void setManagerApproval(boolean managerApproval) {
		this.managerApproval = managerApproval;
	}

	public boolean isRemote() {
		return remote;
	}

	public void setRemote(boolean remote) {
		this.remote = remote;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", age=" + age + ", departmentId=" + departmentId + ", roleId=" + roleId
				+ ", projectIds=" + projectIds + ", salary=" + salary + ", joiningDate=" + joiningDate + ", status="
				+ status + ", skills=" + skills + ", performanceScore=" + performanceScore + ", address=" + address
				+ ", certifications=" + certifications + ", managerApproval=" + managerApproval + ", remote=" + remote
				+ "]";
	}
}

class Address {

	private String street;
	private String city;
	private String state;
	private String pincode;
	private String country;

	public Address() {
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", country=" + country + "]";
	}
}