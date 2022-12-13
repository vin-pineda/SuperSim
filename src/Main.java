import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        CustomerFactory customerFactory = new CustomerFactory(5000, 50, customers);
        customerFactory.start();
    }
}