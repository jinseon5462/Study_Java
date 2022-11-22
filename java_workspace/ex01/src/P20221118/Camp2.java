package P20221118;

public class Camp2 {
    private Object unit; //human, machine 모두 object 하나로 받기(상속) 가능
    // **object는 모든 클래스의 부모이다.

    public void set(Object unit) {
        this.unit = unit;
    }

    public Object get() {
        return unit;
    }


}
