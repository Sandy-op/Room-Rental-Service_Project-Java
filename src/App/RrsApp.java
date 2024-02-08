package App;
import java.util.Scanner;
//import Entity.Address;
//import Entity.Customer;
import Services.RrsServices;
import ServicesImpl.RrsServiceImpl;

public class RrsApp {
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	RrsServices r = new RrsServiceImpl();
	System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_Welcome to TATA TAJ HOTEL-_-_-_-_-_-_-_-_-_-_-_");
	while(true) {
	    System.out.println("~~~~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~");
	    System.out.println("1.RoomInfo\n2.Rooms Availability");
	    System.out.println("3.CheckIn\n4.Exit");
	    System.out.println("============Enter Your Option=============");
	    int op = sc.nextInt();
	    switch(op) {
	    case 1:r.roomInfo(); break;
	    case 2:r.checkAvailability(); break;
	    case 3:System.out.println("Need to be implemented ..!!"); break;
	    case 4:System.out.println("===============Thankyou Visit Again===============");
	    	System.exit(0); break;
	    	default:System.out.println("========================Invalid Option=====================");
	    }
	    
	}
    }
}
