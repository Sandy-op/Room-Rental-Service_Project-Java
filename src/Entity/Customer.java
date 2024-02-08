package Entity;

public class Customer {
    
    private int cid;
    private String cname;
    private long cphno;
    private Address a;
    private double camt;
    
    //--constructor
    public Customer(int cid, String cname, long cphno, Address a, double camt) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cphno = cphno;
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
    public long getCphno() {
        return cphno;
    }
    public void setCphno(long cphno) {
        this.cphno = cphno;
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
	return "Customer [cid=" + cid + ", cname=" + cname + ", cphno=" + cphno + ", a=" + a + ", camt=" + camt + "]";
    }
    
    
    
}
