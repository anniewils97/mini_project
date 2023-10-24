import java.util.ArrayList;
import java.util.List;

public class Flight {

    private int flightId;
    private String destination;
    private ArrayList<Passenger> passengers;


    public Flight(int flightId, String destination){
        this.flightId = flightId;
        this.destination = destination;
        this.passengers = new ArrayList<>(); // where do we initialise passengers list
    }

//    METHODS
    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }
    public void removePassenger(Passenger passenger){
        passengers.remove(passenger);
    }


    

//    GETTER AND SETTER
    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

}
