package basic01;

public class FunctionTest {
    void f(){
        System.out.println("Hello\n");
    }

    static void f(char ch){
        if(ch == 't'){
            System.out.println("Hello Java\n");
        }else if(ch == 'f'){
            System.out.println("Good Bye Java\n");
        }
    }

    void f(int age){
        if(age > 19){
            System.out.println("πμ±μΈμ©νμ μ μ€μ κ±Έ νμν©λλ€π\n");
        }else{
            System.out.println("π₯λ―Έμ±λμλ μΆμκΈμ§λΌκ΅¬π₯\n");

        }
    }

    public static void main(String[] args) {
        FunctionTest ft = new FunctionTest();
        ft.f();
        f('t');
        f('f');

        FunctionTest ft2 = new FunctionTest();
        ft2.f(23);
        ft2.f(18);
    }
}