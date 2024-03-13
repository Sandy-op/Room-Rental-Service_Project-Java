package ServicesImpl;
import java.util.LinkedHashMap;
import java.util.Scanner;

import Entity.Address;
import Entity.Customer;
import Services.RrsServices;

public class RrsServiceImpl implements RrsServices  {
    
    Scanner ip = new Scanner(System.in);
    
    {
    for(int i=101; i<=108; i++) {
	    ac.put(i,null);
	}
    }

    @Override
    public void roomInfo() {
	System.out.println("------------------Room Details---------------------");
	System.out.println("------------------AC Rooms-------------------------");
	System.out.println("1.AC\n2.TV\n3.WIFI\n4.Fridge");
	System.out.println("Price: 25000/Night");
    }

    @Override
    public void checkAvailability() {
	System.out.println("--------------AC Rooms-----------------");
	int c=0;
	for(int key:ac.keySet()) { //[101,102,103-------110]
	    if(ac.get(key)==null) {
		System.out.println(key+" ");
		c++;
	    }
	}
	if(c==0) {
	    System.out.println("All rooms occupied");
	}
	System.out.println();
    }

    @Override
    public void checkIn() {
	System.out.println("===============Check in=====================");
	System.out.println("================Room Details================");
	System.out.println("1.Ac\n2.Non-Ac\n3.Delux");
	System.out.println("============Enter Your Option===============");
	int op=ip.nextInt();
	System.out.println("Please Enter the roomNo:-");
	int roomno=ip.nextInt();
	
	switch(op) {
	case 1: if(ac.containsKey(roomno) && ac.get(roomno)==null) {
	    	allocate(ac,2500,"Ac",roomno);
		}
		else {
		    System.out.println("Invalid RoomNo. or Room is not available ..!!");
		}
		break;
	case 2: System.out.println("Need to be implemented..!!");
	case 3: System.out.println("Need to be implemented..!!");
	default: System.out.println("Invalid Option.....!!!");
	}
    }

    @Override
    public void allocate(LinkedHashMap<Integer, Customer> m, double camt, String roomType, int roomno) {
	System.out.println("==============Customer Details==============");
	System.out.println("Please Enter Customer Id:-");
	int cid = ip.nextInt();
	System.out.println("Please Enter Customer Name:-");
	String cname = ip.next();
	System.out.println("Please Enter Customer Phno:-");
	long phno=ip.nextLong();
	System.out.println("Please Enter the House No:-");
	String houseno =ip.next();
	System.out.println("Please Enter the Street Name:-");
	String streetName= ip.next();
	System.out.println("Please Enter location pincode:-");
	int pincode = ip.nextInt();
	
	Address a = new Address(houseno,streetName,pincode);
	Customer c= new Customer(cid,cname,phno,a,camt,roomType);
	l1.add(c);
	m.put(roomno,c);
	System.out.println(c.getCname()+" had allocate for "+roomType+" roomno: "+roomno);
	System.out.println("Amount need to be paid "+camt);

    }

    @Override
    public void checkOut() {
		System.out.println("==============check out=============");
		System.out.println("============Rooms Details===========");
		System.out.println("1.Ac\n2.Non-AC\n3.Delux");
		System.out.println("Enter Your Option:-");
		int op = ip.nextInt();
		System.out.println("Please Enter the roomno:-");
		int roomno = ip.nextInt();
		System.out.println("Please Enter Customer Id");
		int cid = ip.nextInt();
		switch(op) {
		case 1: if(ac.containsKey(roomno) && ac.get(roomno)!=null && ac.get(roomno).getCid()==cid) {
		System.out.println(" Thanks for Visiting "+ac.get(roomno).getCname());
		ac.put(roomno, null);
		}else {
		System.out.println("Invalid room no. or room is not available");
		}break;
		case 2:System.out.println("need to be implemented");break;
		case 3:System.out.println("need to be implemented");break;
		default:System.out.println("Invalid option");
		}
	
    }

   
}
