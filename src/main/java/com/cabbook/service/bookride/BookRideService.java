package com.cabbook.service.bookride;

import java.util.ArrayList;
import java.util.List;

import com.cabbook.model.Login.Login;
import com.cabbook.model.ride.Ride;

public interface BookRideService {

	void saveRide(Ride ride);

	List<Ride> getBookingData(Login login);

	void cancelRide(Ride ride);
	
	List<Ride> getDriverBookingData();
	
	void acceptRide(Ride ride);
	
	void rejectRide(Ride ride);

	ArrayList<Ride> getBookingWithStatus(Ride ride);



}
