package com.springboot.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="resume")
public class CandidDetails {
	//attributes 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int num;
	private String fullName;
	private String graduation;
	private int batch;
	private String mblNum;
	private String university;
	
//parameterized method
	public CandidDetails() {
		
	}
	public CandidDetails(int num,String fullName,String graduation,int batch,String mblNum,String university) {
		this.num=num;
		this.fullName=fullName;
		this.graduation=graduation;
		this.batch=batch;
		this.mblNum=mblNum;
		this.university=university;
	}
	//Setter and Getter methods
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGraduation() {
		return graduation;
	}
	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public String getMblNum() {
		return mblNum;
	}
	public void setMblNum(String mblNum) {
		this.mblNum = mblNum;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	//toString()method
	@Override
	public String toString() {
		return "CandidDetails [num=" + num + ", fullName=" + fullName + ", Graduation=" + graduation + ", batch="
				+ batch + ", mblNum=" + mblNum + ", university=" + university + "]";
	}
	
	
	
	

	
	
	

}
