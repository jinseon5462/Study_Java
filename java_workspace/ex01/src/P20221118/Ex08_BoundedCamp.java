package P20221118;

class Camp8<T extends Number>{
    private T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}


public class Ex08_BoundedCamp {
    public static void main(String[] args) {
        Camp8<Integer> iBox = new Camp8<>();
        iBox.set(24);

        Camp8<Double> dBox = new Camp8<>();
        dBox.set(5.97);
        //Camp8 클래스는 Number 상속 받았기 때문에 String, Boolean, Student 타입 사용불가
        //Camp8<String> sBox = new Camp8<String>(); //error
        //Camp8<Boolean> bBox = new Camp8<Boolean>(); //error
        //Camp8<Student> stuBox = new Camp8<Student>(); //error
        Camp8<Long> lBox = new Camp8<>();
        Camp8<Short> stBox = new Camp8<>();

        System.out.println(iBox.get());
        System.out.println(dBox.get());
    }
}
