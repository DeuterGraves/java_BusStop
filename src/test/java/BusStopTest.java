import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Passenger passenger;


    @Before
    public void before(){
        busStop = new BusStop();
        passenger = new Passenger();
    }

    //Create a Named Bus Stop que empty ArrayList

    @Test
    public void busStopHasName(){
        assertEquals("The Jewel", busStop.getName());
    }

    @Test
    public void busStopQueIsEmpty(){
        assertEquals(0, busStop.queCount());
    }


    //Add a passenger to que
@Test
    public void addPassengerToQue(){
        busStop.addPassenger(passenger);
        assertEquals(1, busStop.queCount());
}

    //Remove person from que - leave the Q and join the Bus
    @Test
    public void removePassengerFromQue(){
        busStop.addPassenger(passenger);
        busStop.removePassenger(passenger);
        assertEquals(0, busStop.queCount());
    }


}
