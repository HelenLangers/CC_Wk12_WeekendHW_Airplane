package people;

public class Pilot extends CrewMember{

    private String pilotLicenseNumber;

    public Pilot(String name, Rank rank, String pilotLicenseNumber){
        super( name, rank);
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String getPilotLicenseNumber(){
        return pilotLicenseNumber;
    }

}
