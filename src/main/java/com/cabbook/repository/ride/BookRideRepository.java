package com.cabbook.repository.ride;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cabbook.model.Login.Login;
import com.cabbook.model.ride.Ride;

public interface BookRideRepository extends JpaRepository<Ride,Long>{

	List<Ride> findByLogin(Login login);
	
	List<Ride> findAllByStatus(Ride ride);
	
	@Query("from Ride where status='pending'")
	ArrayList<Ride> findByStatus();

}
