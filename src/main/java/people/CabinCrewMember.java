package people;

public class CabinCrewMember extends CrewMember {

    public CabinCrewMember(String name, Rank rank){
        super(name, rank);
    }

    public String relayMessage(String message){
        return "Attention all passengers" + message;
    }

}
