import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Passenger> load;


    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.load = new ArrayList<>();
    }

    public int passengerCount() {
        return load.size();
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengerCount() < capacity) {
            load.add(passenger);
        }
        return;
    }

    public Passenger dropOffPassenger(Passenger passenger) {
        return load.remove(0);
    }

}
