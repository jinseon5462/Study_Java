package p20221109;

public class AppleSpeaker implements Speaker{
    @Override
    public void volumeUp() {
        System.out.println("애플스피커 소리를 높입니다.");
    }

    @Override
    public void volumeDown() {
        System.out.println("애플스피커 소리를 낮춥니다.");

    }
}
