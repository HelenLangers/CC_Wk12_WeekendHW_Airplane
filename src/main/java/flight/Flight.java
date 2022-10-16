package flight;

import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;
    private int capacity;

    public Flight(String flightNumber,int capacity, String departureAirport, String destinationAirport, String departureTime){
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber){
        this.flightNumber = flightNumber;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public String getDepartureAirport(){
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport){
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport(){
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport){
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureTime(){
        return departureTime;
    }

    public void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    }

    public void addPilot(Pilot pilot){
        this.pilots.add(pilot);
    }

    public void addCrewMember(CabinCrewMember cabinCrewMember){
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public int getPilotListLength(){
        return pilots.size();
    }

    public int getCabinCrewListLength(){
        return cabinCrewMembers.size();
    }

    public int getPassengerListLength(){
        return passengers.size();
    }

}
