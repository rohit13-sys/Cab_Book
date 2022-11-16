package com.cabbook.model.User;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cabbook.model.Login.Login;

@Entity
@Table(name="User_reg")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RegId")
	private Long regId; 
	
	private String firstName;
	
	private String lastName;
	
	private Long m_number;
	
	

	@ManyToOne
	@JoinColumn(name="Login_id")
	private Login login;
	
	public Long getRegId() {
		return regId;
	}


	public Login getLogin() {
		return login;
	}


	public void setLogin(Login login) {
		this.login = login;
	}



	public void setRegId(Long regId) {
		this.regId = regId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getM_number() {
		return m_number;
	}

	public void setM_number(Long m_number) {
		this.m_number = m_number;
	}
	
	@Override
	public String toString() {
		return "UserReg [regId=" + regId + ", firstName=" + firstName + ", lastName=" + lastName + ", m_number="
				+ m_number + ", login=" + login + "]";
	}
}
