package basic01;

public class DeskLamp {
    private boolean isOn;

    //public DeskLamp(){}

    public DeskLamp(boolean isOn){
        this.isOn = isOn;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public String getStatus(){
        return "현재 상태는" + (isOn == true ? "켜짐" : "꺼짐");
    }
}