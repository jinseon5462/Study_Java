package basic01;

public class CarFactory {
    public int carNumber;
    public String color;

    public CarFactory(int carNumber, String color){
        this.carNumber = carNumber;
        this.color = color;
    }

    public void showInfo(){
        System.out.println(carNumber + "번 색깔은 " + color + "입니다.");
    }

    public void showInformation(){
        System.out.println(carNumber + "번의 색깔은 " + color + "입니다.");
    }
}