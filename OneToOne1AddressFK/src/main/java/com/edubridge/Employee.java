package com.edubridge;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "OneToOneEmployee")
public class Employee {
	
	//employee table it should create a Foreign Key	
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @PrimaryKeyJoinColumn
  private int empId;
  
  @Column(name="Employee_name",length =20)
  private String empName;  
  
  
  
  
  //making the address as a foreign key in the employee class(parent class)
    @OneToOne 
	@JoinColumn(name="ADDRESS_ID_FK") /*changing the address id into address id fk in employee class*/
    private Address address;



public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}





}
