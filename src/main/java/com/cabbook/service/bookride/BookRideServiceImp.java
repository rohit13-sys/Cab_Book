package com.cabbook.service.bookride;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabbook.model.Login.Login;
import com.cabbook.model.ride.Ride;
import com.cabbook.repository.ride.BookRideRepository;

@Service
@Transactional
public class BookRideServiceImp implements BookRideService {

	@Autowired
	BookRideRepository bookRideRepository;

	@Override
	public void saveRide(Ride ride) {
		this.bookRideRepository.save(ride);
	}

	@Override
	public List<Ride> getBookingData(Login login) {
		List<Ride> bookingData = this.bookRideRepository.findByLogin(login);
		return bookingData;
	}

	@Override
	public void cancelRide(Ride ride) {

		Ride ride2 = this.bookRideRepository.findById(ride.getRideId()).get();

		ride2.setStatus("cancelled by user");
		this.bookRideRepository.save(ride2);
		System.out.println(ride);
	}

	@Override
	public List<Ride> getDriverBookingData() {
		List<Ride> bookingData=this.bookRideRepository.findAll();
		return bookingData;
	}

	@Override
	public void acceptRide(Ride ride) {
		Ride ride2=this.bookRideRepository.findById(ride.getRideId()).get();
		ride2.setStatus("Accepted by driver");
		this.bookRideRepository.save(ride2);
	}

	@Override
	public void rejectRide(Ride ride) {
		Ride ride2=this.bookRideRepository.findById(ride.getRideId()).get();
		System.out.println("rejected ride>>>>"+ride2);
		ride2.setStatus("Rejected by driver");
		this.bookRideRepository.save(ride2);
	}

	@Override
	public ArrayList<Ride> getBookingWithStatus(Ride ride) {
		ArrayList<Ride> data=this.bookRideRepository.findByStatus();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+data);
		return data;
	}

}
