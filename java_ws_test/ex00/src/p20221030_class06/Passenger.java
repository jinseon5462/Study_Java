package p20221030_class06;

public class Passenger {
    String name;
    int money;

    public Passenger(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus){
        this.money -= 1500;
        bus.take(1500);
    }
    public void outBus(Bus bus){
        bus.passengerCount--;
    }

    public void showInfo(){
        System.out.println(name + "가 가진 금액은 " + money + "원입니다.");
    }
}