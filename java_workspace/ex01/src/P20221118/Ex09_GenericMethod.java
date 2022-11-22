package P20221118;

class MyData{
    public static <T> T showData(T data){
        if(data instanceof String) //if문 중괄호 생략하려면 한 줄만 가능, 두 줄째부터는 if문 처리가 안됨
            System.out.println("String");
         else if (data instanceof Integer)
            System.out.println("Integer");
         else if (data instanceof Double)
            System.out.println("Double");

        return data;
    }
}

public class Ex09_GenericMethod {
    public static void main(String[] args) {
    	String x = MyData.showData("hello world");
    	//or MyData.showData("hello world"); -> String 출력됨
    	System.out.println(x);

    	String x1 = MyData.<String>showData("hello world"); // 정석적인 방법

        MyData.showData(1); //Integer //타입을 알아서 추론해줌
        MyData.showData(1.9); //Double
        

    }
}
