package Entity;

public class Address {
    private String houseno;
    private String streetName;
    private int pincode;
    
    //--constructor
    public Address(String houseno, String streetName, int pincode) {
	super();
	this.houseno = houseno;
	this.streetName = streetName;
	this.pincode = pincode;
    }

    //--getter/setter method
    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    //--toString method
    @Override
    public String toString() {
	return "Address [houseno=" + houseno + ", streetName=" + streetName + ", pincode=" + pincode + "]";
    }
    
    
    
    
}
