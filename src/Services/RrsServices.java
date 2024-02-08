package Services;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import Entity.Customer;

public interface RrsServices {
    LinkedHashMap<Integer,Customer> ac = new LinkedHashMap<>();
    ArrayList<Customer> l1 = new ArrayList<>();
    
    void roomInfo();
    void checkAvailability();
    void checkIn();
}
