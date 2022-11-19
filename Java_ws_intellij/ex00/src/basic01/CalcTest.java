package basic01;

public class CalcTest {
    public static void main(String[] args){
        /*
        Calculator c = new Calculator();
        int resultAdd = c.add(23422, 14154);
        int resultMin = c.minus(2145, 1232);
        int resultMultiple = c.multiple(132, 124);
        double resultDivide = c.divide(642, 0);
        */
        int resultAdd = Calculator.add(10, 20);
        int resultMin = Calculator.minus(10, 20);
        int resultMultiple = Calculator.multiple(10, 20);
        double resultDivie = Calculator.divide(32, 3);


        System.out.println(resultAdd);
        System.out.println(resultMin);
        System.out.println(resultMultiple);
        System.out.printf("%.2f", resultDivie);
    }
}