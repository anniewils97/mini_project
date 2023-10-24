public class Passenger {

    private String name;
    private String contactInfo;
    private int passengerId;

    public Passenger(String name, String contactInfo, int passengerId){
        this.name = name;
        this.contactInfo = contactInfo;
        this.passengerId = passengerId;
    }

//    GETTER AND SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }
}
