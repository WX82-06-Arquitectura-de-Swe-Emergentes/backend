package com.app.adventurehub.booking.resource;

import java.util.Date;

import com.app.adventurehub.booking.enums.BookingStatus;
import com.app.adventurehub.trip.resource.TripAggregateResource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.With;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class TravelerBookingAggregate {
	private BookingResource booking;
	// private UserAggregateResource user;
	private TripAggregateResource trip;
}
