




package com.PS.JFSD_HQL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student_details {
@Id
	int deptid;
	  String sname;
	  String gender;
	  String hod;
	  String location;
	public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getHod() {
	return hod;
}
public void setHod(String hod) {
	this.hod = hod;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
	@Override
	public String toString() {
		return "Student_details [deptid=" + deptid + ", sname=" + sname + ", gender=" + gender + ", hod=" + hod + ", location="
				+ location + "]";
	}
}
