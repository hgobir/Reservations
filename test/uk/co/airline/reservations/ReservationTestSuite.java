package uk.co.airline.reservations;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FlightTest.class, PassengerTest.class, SeatTest.class, TicketTest.class, DatabaseTest.class, CharterTest.class })
public class ReservationTestSuite {

}
