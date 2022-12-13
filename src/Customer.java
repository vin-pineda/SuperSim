public class Customer extends Thread {

    private static int nextID = 0;
    private int id;
    private long shopTime;     //how long in ms the customer shops for
    private long checkoutTime; //how long in ms it takes the customer to checkout
    private long enterTime;    //the time in ms the customer enters the store
    private long leaveTime;    //the time in ms the customer leaves the store
    private long minShopTime = 3000;  //the min time in ms the customer shops
    private long maxShopTime = 20000;  //the max time in ms the customer shops

    public Customer() {
        id = nextID;
        nextID++;
        enterTime = System.currentTimeMillis();
        shopTime = (long)(minShopTime + Math.random() * (maxShopTime-minShopTime));
        checkoutTime = 2000;
    }

    @Override
    public String toString() {
        return "Customer " + id;
    }

    @Override
    public void run() {
        while(enterTime + shopTime > System.currentTimeMillis()) {
        }
        System.out.println(this.toString() + " is done shopping with shop time " + shopTime);
    }
}