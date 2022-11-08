package p20221031_inheritance;

public class MyUnit extends Unit {

    MyUnit(int energy){
        super(energy);  // 부모클래스의 생성자를 호출
    }

    @Override
    void attack(Unit unit) {
        super.attack(unit);
    }
}