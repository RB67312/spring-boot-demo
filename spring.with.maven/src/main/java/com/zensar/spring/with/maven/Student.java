package com.zensar.spring.with.maven;

public class Student {
	import javax.annotation.PostConstruct;
	import javax.annotation.PreDestroy;
	import org.springframework.beans.factory.DisposableBean;
	import org.springframework.beans.factory.InitializingBean;
	public class Student implements InitializingBean,DisposableBean { private int studentId;
	private String studentName;
	private String studentAge;
	private Address address;
	@PostConstruct
	public void myInit() {
	System.out.println("Im inside MyInit");
	}
	@PreDestroy
	public void myDestroy1() {
	System.out.println("Im inside MyInit");
	} public Student() {
	super();
	} public Student(int studentId, String studentName, String studentAge, Address address) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAge = studentAge;
	this.address = address;
	} public int getStudentId() {
	return studentId;
	} public void setStudentId(int studentId) {
	this.studentId = studentId;
	} public String getStudentName() {
	return studentName;
	} public void setStudentName(String studentName) {
	this.studentName = studentName;
	} public String getStudentAge() {
	return studentAge;
	} public void setStudentAge(String studentAge) {
	this.studentAge = studentAge;
	} public Address getAddress() {
	return getAddress();
	} public void setAddress(Address address) {
	this.address = address;
	} @Override
	public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
	+ ", address=" + address + "]";
	}
	public void myDestroy() {
	System.out.println("Im a inside destroy");
	} public void afterPropertiesSet() throws Exception {
	System.out.println("After the Properties");
	} public void destroy() throws Exception {
	System.out.println("After the Destroy");
	}
	}

	private String State;
	private String city;
	private String pincode; public Address() {
	super();
	} public Address(String state, String city, String pincode) {
	super();
	State = state;
	this.city = city;
	this.pincode = pincode;
	} public String getState() {
	return State;
	} public void setState(String state) {
	State = state;
	} public String getCity() {
	return city;
	} public void setCity(String city) {
	this.city = city;
	} public String getPincode() {
	return pincode;
	} public void setPincode(String pincode) {
	this.pincode = pincode;
	} @Override
	public String toString() {
	return "Address [State=" + State + ", city=" + city + ", pincode=" + pincode + "]";
	}


}
