package com.edubridge;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name ="OneToOneAddress")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ADDRESS_ID",length =20)
	private int addressId; 
	
	
	@Column(name="STREET_NAME")
    private String street;
    @Column(name="CITY_NAME")
    private String city;
    @Column(name="STATE_NAME")
    private String state;
    @Column(name="PIN_CODE")
    private String pincode;
    
    @OneToOne 
  	@JoinColumn(name="Employee_ID_FK")
      private Employee employee;

    

    
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
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
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

}
