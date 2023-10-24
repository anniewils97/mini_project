import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    static ArrayList<Flight> flights = new ArrayList<>();
    static ArrayList<Passenger> passengers = new ArrayList<>();
    static Scanner scanChoice = new Scanner(System.in);
    static Scanner destinationScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Bright Air");

        System.out.println("Please select one of the follow options:");
        // have a method which calls the menu below
        menu();

        // switch statement should go in the same method that contains the menu


    }
    public static void createFlight(){
//        System.out.println("Enter flight ID");
        int flightId = flights.size();
        System.out.println("Enter destination");
        String destination = destinationScanner.nextLine();
        Flight newflight = new Flight(flightId, destination);
        flights.add(newflight);
        System.out.println("Flight created successfully!");
    }
    public static void displayFlights(){
        for (Flight flight: flights){
//            flight.getFlights();
        }

    public static void createPassenger(){

        }
    }

    public static void menu(){
        System.out.println("1. Create a new flight");
        System.out.println("2. Display all available flights");
        System.out.println("3. Create a new passenger");
        System.out.println("4. Book a passenger onto a flight");
        System.out.println("5. Remove a passenger from a flight");
        System.out.println("6. Cancel a flight");
        int selectOptions = scanChoice.nextInt();

        switch (selectOptions) {
            case 1:
                createFlight();
                break;

            case 2:
                System.out.println("The available flights are: ");
                displayFlights();
                break;
        }
    }

}
