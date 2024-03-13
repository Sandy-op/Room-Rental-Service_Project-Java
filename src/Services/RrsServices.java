package Services;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import Entity.Customer;

public interface RrsServices {
    LinkedHashMap<Integer,Customer> ac = new LinkedHashMap<>();
    LinkedHashMap<Integer,Customer> nonAc = new LinkedHashMap<>();
    LinkedHashMap<Integer,Customer> delux = new LinkedHashMap<>();
    ArrayList<Customer> l1 = new ArrayList<>();
    
    void roomInfo();
    void checkAvailability();
    void checkIn();
    void allocate(LinkedHashMap<Integer,Customer> m,double camt,String roomType, int roomno);
    void checkOut();
    
}
