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
            System.out.println("💕성인용품점에 오신걸 환영합니다💕\n");
        }else{
            System.out.println("😥미성년자는 출입금지라구😥\n");

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