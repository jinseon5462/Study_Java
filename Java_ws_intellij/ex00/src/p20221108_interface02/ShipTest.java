package p20221108_interface02;

public class ShipTest {
    public static void main(String[] args) {
        Man m1 = new Man("철수");
        Man m2 = new Man("만수");
        Woman w1 = new Woman("영희");
        Woman w2 = new Woman("소희");
        Woman w3 = new Woman("주희");
        Alien al1 = new Alien("외계인이지롱");

        Ship422 ship = new Ship422();
        ship.ridingPassenger(m1);
        ship.ridingPassenger(m2);
        ship.ridingPassenger(w1);
        ship.ridingPassenger(w2);
        ship.ridingPassenger(w3);

        int mCount = ship.countingMan();
        int wCount = ship.countingWoman();

        System.out.println("Man : " + mCount + ", " + "Woman : " + wCount);

        for(Human h : ship.list){
            System.out.println(h.name);
        }

        //ship.showList();
        /*
        for(int i = 0; i < ship.list.size(); i++){
            System.out.println(ship.list.get(i).name);
        }
         */
    }
}
