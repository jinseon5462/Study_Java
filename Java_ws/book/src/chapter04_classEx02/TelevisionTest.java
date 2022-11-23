package chapter04_classEx02;
/*
날짜 : 2022/11/19 토요일
이름 : 이진선
내용 : 생성자와 메소드 오버로딩, p.157
 */
class Television {
    private int channel;
    private int volume;
    private boolean onOff;

    Television(int channel, int volume, boolean onOff){
        this.channel = channel;
        this.volume = volume;
        this.onOff = onOff;
    }

    void print(){
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }
}

public class TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television(7, 10, true);
        myTv.print();

        Television yourTv = new Television(11, 20, true);
        yourTv.print();
    }
}
