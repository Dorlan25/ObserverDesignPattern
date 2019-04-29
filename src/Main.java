public class Main {

    public static void main(String[] args) {


        StockGrabber stockGrabber = new StockGrabber();



        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(122.33);
        stockGrabber.setAAPLPrice(333.22);
        stockGrabber.setGOOGPrice(321.55);




    }
}
