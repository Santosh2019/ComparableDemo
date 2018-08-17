package com.scp.demo.ComparableDemo;

import java.util.Comparator;

public class Student{
	
	private int studentId;
	private String studentName;
	private String studentAdd;
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getStudentAdd() {
		return studentAdd;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentAdd(String studentAdd) {
		this.studentAdd = studentAdd;
	}
	public Student(int studentId, String studentName, String studentAdd) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAdd = studentAdd;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\n Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAdd=" + studentAdd + "]";
	}
	
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getStudentName().compareTo(o2.getStudentName());
	}
	

}

class ById implements Comparator<Student>
{

	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getStudentId()-o2.getStudentId();
	}
	
}
class ByName implements Comparator<Student>
{

	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getStudentName().compareTo(o2.getStudentName());
	}
	
}
class ByAdd implements Comparator<Student>
{

	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getStudentAdd().compareTo(o2.getStudentAdd());
	}
	
}
