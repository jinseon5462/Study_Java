package p20221116_io;

import java.io.Serializable;

/*
ObjectInput/OutputStream
네트워크를 통해서 객체를 편리하게 전달하기 위해 사용한다.
객체를 기록하기 위해서는 직렬화(serialization)를 해야한다.
객체를 읽기 위해서는 역직렬화(deserialization)를 해야한다.
직렬화할 객체는 클래스를 정의할때 Serializable이라는 인터페이스를 구현한다고 표시해야 한다.
 */

public class Person implements Serializable {	// Serializable 직렬화한다는 표시만 한다.
	private static final long serialVersionUID = -5986693535978894756L;

    String name;
    String city;
    int age;

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", city=" + city + ", age=" + age + "]";
    }
}
