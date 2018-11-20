import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Passenger passenger;

    @Before
    public void before() {
        bus = new Bus("The Jewel", 10);
        passenger = new Passenger();
    }

    @Test
    public void checkBusEmpty() {
        assertEquals(0, bus.passengerCount());
    }


    @Test
    public void addPassengerToBus() {
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void removePassengerFromBus() {
       bus.addPassenger(passenger);
       bus.dropOffPassenger(passenger);
       assertEquals(0, bus.passengerCount());
    }

    @Test
    public void rejectPassengerOnboading(){
        Bus fullBus = new Bus ("Castle Terrace", 2);
        fullBus.addPassenger(passenger);
        fullBus.addPassenger(passenger);
        fullBus.addPassenger(passenger);
        assertEquals(2, fullBus.passengerCount());
    }

    //Add person from busStop to Passengers (pickup)
    @Test
    public void pickupPassengerFromBusStop(BusStop busStop){
        Passenger passenger = busStop.removePassenger();
        this.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }


}
