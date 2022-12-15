package asmAp;
public class Pilot extends Employee {
    private String flightExperience;
    private String position;

    public Pilot(String id, String name, String dob, String gender,
            String address, int phone, String flightExperience, String position) 
    {
        super(id, name, dob, gender, address, phone);
        this.flightExperience = flightExperience;
        this.position = position; 
    }

    public String getFlightExperience() {
        return flightExperience;
    }

    public void setFlightExperience(String flightExperience) {
        this.flightExperience = flightExperience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}


