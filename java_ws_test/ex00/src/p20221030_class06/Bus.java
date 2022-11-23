package p20221030_class06;

public class Bus {
    String busNum;
    int money;
    int passengerCount;

    public Bus(String busNum){
        this.busNum = busNum;
    }
    public void take(int money){
        this.money += money;
        passengerCount++;
    }


    public void showInfo(){
        System.out.println(busNum + "버스의 현재 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
    }
}