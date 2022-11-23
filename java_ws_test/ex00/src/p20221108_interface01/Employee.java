package p20221108_interface01;

public class Employee implements Employable {

    private String name;
    public Employee(String name) {
        if(Employable.isEmpty(name) == true){
            System.out.println("이름은 반드시 입력해야함!");
        }

        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
