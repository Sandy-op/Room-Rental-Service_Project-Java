package Entity;

public class Customer {
    
    private int cid;
    private String cname;
    private long phno;
    private Address a;
    private double camt;
    
    //--constructor
    public Customer(int cid, String cname, long phno, Address a, double camt, String roomType) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.phno = phno;
	this.a = a;
	this.camt = camt;
    }
    //--Getter/Setter method
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public long getPhno() {
        return phno;
    }
    public void setPhno(long phno) {
        this.phno = phno;
    }
    public Address getA() {
        return a;
    }
    public void setA(Address a) {
        this.a = a;
    }
    public double getCamt() {
        return camt;
    }
    public void setCamt(double camt) {
        this.camt = camt;
    }
    
    //--toString method
    @Override
    public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", cphno=" + phno + ", a=" + a + ", camt=" + camt + "]";
    }
    
    
    
}
