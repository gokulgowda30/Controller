package Sevlet.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Servlet_dto {
@Id
private int ID;
private String Name;
private long Mobile;
private String DOB;
private String Email;
private String Gender;
private String Country;
private String Checkbox;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public long getMobile() {
	return Mobile;
}
public void setMobile(long mobile) {
	Mobile = mobile;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public String getCheckbox() {
	return Checkbox;
}
public void setCheckbox(String checkbox) {
	Checkbox = checkbox;
}
@Override
public String toString() {
	return "Servlet_dto [ID=" + ID + ", Name=" + Name + ", Mobile=" + Mobile + ", DOB=" + DOB + ", Email=" + Email
			+ ", Gender=" + Gender + ", Country=" + Country + ", Checkbox=" + Checkbox + "]";
}

}
