package com.springcore;

public class Student {
private int studentId;
private String studentName;
private String Address;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}


public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentId= " + studentId + ", studentName= " + studentName + ", Address= " + Address + "]";
}


}
