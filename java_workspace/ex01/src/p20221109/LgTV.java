package p20221109;

public class LgTV implements TV {
    Speaker speaker;

    public LgTV(){
        this.speaker = new AppleSpeaker();
    }
    @Override
    public void tvOn() {
        System.out.println("엘지 티비 전원을 켭니다.");
    }

    @Override
    public void tvOff() {
        System.out.println("엘지 티비 전원을 끕니다.");
    }

    @Override
    public void tvVolumeUp() {
        System.out.println("엘지 티비 볼륨을 높입니다.");
        speaker.volumeUp();
    }

    @Override
    public void tvVolumeDown() {
        System.out.println("엘지 티비 볼륨을 줄입니다.");
        speaker.volumeDown();
    }


    /*void turnOn(){
        System.out.println("LG TV 전원을 켭니다.");
    }
    void turnOff(){
        System.out.println("LG TV 전원을 끕니다.");
    }
    void soundUp(){
        System.out.println("LG TV 소리를 켭니다.");
    }
    void soundDown(){
        System.out.println("LG TV 소리를 낮춥니다.");
    }*/
}