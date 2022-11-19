package p20221031_inheritance;

public class BallTest {
    public static void main(String[] args) {

        Ball[] balls = new Ball[10];
        int redCount = 0;
        int blueCount = 0;
        int greenCount = 0;

        for(int i = 0; i < balls.length; i++){
            int rdNum = (int) (Math.random() * 3 + 1);
            if(rdNum == 1) {
                balls[i] = new RedBall();
            }else if(rdNum == 2) {
                balls[i] = new BlueBall();
            }else{
                balls[i] = new GreenBall();
            }
        }

        for(int j = 0; j < balls.length; j++){
            balls[j].showInfo();
        }

        for(int i = 0; i < balls.length; i++){
            if(balls[i] instanceof RedBall){
                redCount++;
            }else if(balls[i] instanceof BlueBall){
                blueCount++;
            }else{
                greenCount++;
            }
        }
        System.out.println("빨간공 : " + redCount);
        System.out.println("파란공 : " + blueCount);
        System.out.println("녹색공 : " + greenCount);
    }
}