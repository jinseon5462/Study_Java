package p20221108_interface02;

public class Main {

    public static void testMethod(Interface01 i){

    }

    public static void main(String[] args) {
        Interface01 x = new A();
        x.ifunc();

        A y = (A) x;
        y.afunc();
        y.ifunc();
    }
}
