package chapter04_classEx01;
/*
날짜 : 2022/11/19 토요일
이름 : 이진선
내용 : 클래스와 객체 I,  p.150
 */
public class DeskLamp {
    private boolean isOn;

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public String toString(){
        return "현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
    }
}
