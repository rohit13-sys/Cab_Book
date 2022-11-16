package com.cabbook.model.Driver;

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
@Table(name = "Driver_Reg")
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RegId")
	private Long regId;

	private String firstName;

	private String lastName;

	private String m_number;

	@ManyToOne
	@JoinColumn(name = "Login_Id")
	Login login;

	public Long getRegId() {
		return regId;
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

	public String getM_number() {
		return m_number;
	}

	public void setM_number(String m_number) {
		this.m_number = m_number;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Driver [regId=" + regId + ", firstName=" + firstName + ", lastName=" + lastName + ", m_number="
				+ m_number + ", login=" + login + "]";
	}

}
