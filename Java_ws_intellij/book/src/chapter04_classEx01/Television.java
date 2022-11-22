package chapter04_classEx01;
/*
날짜 : 2022/11/19 토요일
이름 : 이진선
내용 : 클래스와 객체 I, p.152
 */
public class Television {
    int channel;
    int volume;
    boolean onOff;

    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channel = 7;
        myTv.volume = 10;
        myTv.onOff = true;
        System.out.println("나의 텔레비전 채널은 " + myTv.channel + "이고 볼륨은 " + myTv.volume + "입니다.");

        Television yourTv = new Television();
        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.onOff = true;
        System.out.println("너의 텔레비전 채널은 " + yourTv.channel + "이고 볼륨은 " + yourTv.volume + "입니다.");
    }
}
