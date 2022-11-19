package p20221109;

import java.util.Scanner;

public class TVUser {
    public static void main(String[] args) {

        BeanFactory factory = new BeanFactory();

        Scanner sc = new Scanner(System.in);
        System.out.println("원하시는 제조사를 입력해주세요.");
        String tvName = sc.nextLine();

        TV tv = (TV) factory.getBean(tvName.trim().toLowerCase());
        tv.tvOn();
        tv.tvOff();
        tv.tvVolumeUp();
        tv.tvVolumeDown();

        //TV tv111 = factory.getBean(tvName.trim().toLowerCase()); //형변환하지 않으려면 BeanFactory클래스 object를 TV로 변경



       /* TV l_tv = (TV) factory.getBean(com);
        l_tv.tvOn();
        l_tv.tvVolumeUp();
        l_tv.tvVolumeDown();
        l_tv.tvVolumeDown();*/


        /*TV tv1 = new SamsungTV();
        tv1.tvOn();
        tv1.tvVolumeDown();
        tv1.tvVolumeUp();
        tv1.tvOff();*/
    }
}