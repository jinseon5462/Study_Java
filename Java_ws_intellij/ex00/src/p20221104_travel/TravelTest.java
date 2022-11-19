package p20221104_travel;

public class TravelTest {
    public static void main(String[] args) {

        BusanTravel2 travel = new BusanTravel2();
        Transportation bus = new Bus();
        Transportation train = new Train();

//        Transportation tt = new Transportation();

        travel.goBusan(bus);
        travel.goBusan(train);
    }
}