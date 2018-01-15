package com.project3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="phones")
public class Phone {
	@Id
	@Column(name="imei")
	@NotEmpty
	private String phoneImei;
	
	@Column(name="make")
	@NotEmpty
	private String phoneMake;
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee employee;
	
	public String getPhoneImei() {
		return phoneImei;
	}
	public void setPhoneImei(String phoneImei) {
		this.phoneImei = phoneImei;
	}
	public String getPhoneMake() {
		return phoneMake;
	}
	public void setPhoneMake(String phoneMake) {
		this.phoneMake = phoneMake;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
    
	
}
