package com.cabbook.model.ride;

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
@Table(name="User_Ride")
public class Ride {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RideId")
	private Long rideId;
	
	private String sourceAddress;
	
	private String destinationAddress;
	
	private Long book_M_number;
	
	private String status;
	
	

	@ManyToOne
	@JoinColumn(name="Ride_Login_id")
	private Login login;
	
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Long getRideId() {
		return rideId;
	}

	public void setRideId(Long rideId) {
		this.rideId = rideId;
	}

	public String getSourceAddress() {
		return sourceAddress;
	}

	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}


	public Long getBook_M_number() {
		return book_M_number;
	}

	public void setBook_M_number(Long book_M_number) {
		this.book_M_number = book_M_number;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Ride [rideId=" + rideId + ", sourceAddress=" + sourceAddress + ", destinationAddress="
				+ destinationAddress + ", book_M_number=" + book_M_number + ", status=" + status + ", login="
				+ login + "]";
	}
}
