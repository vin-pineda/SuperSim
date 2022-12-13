import java.util.ArrayList;

public class CustomerFactory extends Thread {
    private long timeSlice;
    private long chance;
    private long nextAttempt;
    private ArrayList<Customer> customers;
    private long total;

    public CustomerFactory(long timeSlice, long chance, ArrayList<Customer> customers) {
        this.timeSlice = timeSlice;
        this.chance = chance;
        this.customers = customers;
        nextAttempt = System.currentTimeMillis() + this.timeSlice;
    }

    @Override
    public void run() {
        while(true) {
            if(nextAttempt < System.currentTimeMillis()) {
                long randNum = (long)(1 + Math.random() * 100);
                if(randNum <= chance) {
                    System.out.println("make customer");
                    total++;
                    System.out.println(total);
                    Customer c = new Customer();
                    customers.add(c);
                    c.start();
                }
                else {
                    System.out.println("did not make customer");
                }
                nextAttempt = System.currentTimeMillis() + timeSlice;
            }
        }
    }

}