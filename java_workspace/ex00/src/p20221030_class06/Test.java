package p20221030_class06;

public class Test {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("철수", 10000);
        Passenger p2 = new Passenger("영희", 8000);
        Passenger p3 = new Passenger("동휘", 5000);

        Bus bus = new Bus("108번");

        p1.takeBus(bus);
        p1.showInfo();

        p2.takeBus(bus);
        p2.showInfo();

        p3.takeBus(bus);
        p3.showInfo();

        bus.showInfo();
        p1.outBus(bus);
        p2.outBus(bus);
        bus.showInfo();
    }
}