package com.app.adventurehub.booking.domain.model;

import java.util.List;

import com.app.adventurehub.booking.resource.BookingResource;
import com.app.adventurehub.trip.resource.TripAggregateResource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AgencyBookingView {
	TripAggregateResource trip;
	List<BookingResource> bookings;
}