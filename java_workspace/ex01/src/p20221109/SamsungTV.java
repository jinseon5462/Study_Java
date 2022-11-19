package p20221109;

public class SamsungTV implements TV {
    Speaker speaker;

    public SamsungTV(){
        this.speaker = new SonySpeaker();
    }
    @Override
    public void tvOn() {
        System.out.println("삼성티비 전원을 켭니다.");
    }

    @Override
    public void tvOff() {
        System.out.println("삼성티비 전원을 끕니다.");
    }

    @Override
    public void tvVolumeUp() {
        System.out.println("삼성티비 소리를 높입니다.");
        speaker.volumeUp();
    }

    @Override
    public void tvVolumeDown() {
        System.out.println("삼성티비 소리를 낮춥니다.");
        speaker.volumeDown();
    }

    /*void powerOn(){
        System.out.println("Samsung TV 전원을 켭니다.");
    }
    void powerOff(){
        System.out.println("Samsung TV 전원을 끕니다.");
    }
    void volumeUp(){
        System.out.println("Samsung TV 소리를 올립니다.");
    }
    void volumeDown(){
        System.out.println("Samsung TV 소리를 낮춥니다.");
    }*/
}
