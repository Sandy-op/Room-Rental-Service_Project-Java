package ServicesImpl;
import Services.RrsServices;

public class RrsServiceImpl implements RrsServices  {
    
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
		
    }

  
}
