package P1118;

public class Camp5<T> { // <>안에는 타입이 들어감 : <타입(자료형)>
    // 제네릭 :  타입이 정의 되어있지 않은 미완성 클래스이다. 따라서 객체생성시 타입을 정해줘야한다.
    private T unit;

    public void set(T unit){
        this.unit = unit;
    }

    public T get(){
        return unit;
    }

}
