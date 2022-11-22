package chapter08_exception;

public class DivideByZero {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;

        } catch (ArithmeticException e){
            System.out.println("error : 0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램은 계속 진행됩니다.");
    }
}
