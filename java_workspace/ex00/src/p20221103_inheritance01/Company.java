package p20221103_inheritance01;
public class Company {
    private static Company instance = new Company();

    private Company(){

    }

    public static Company com(){
        return instance;
    }

}