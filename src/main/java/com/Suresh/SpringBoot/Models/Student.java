package com.Suresh.SpringBoot.Models;

public class Student {

	private Integer studId;
	private String studName;
	private Integer studAge;
	private Integer studphone;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String studName, int studAge, int studphone) {
		this.studName = studName;
		this.studAge = studAge;
		this.studphone = studphone;
	}

 
	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public Integer getStudAge() {
		return studAge;
	}

	public void setStudAge(Integer studAge) {
		this.studAge = studAge;
	}

	public Integer getStudphone() {
		return studphone;
	}

	public void setStudphone(Integer studphone) {
		this.studphone = studphone;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studAge=" + studAge + ", studphone="
				+ studphone + "]";
	}

}
