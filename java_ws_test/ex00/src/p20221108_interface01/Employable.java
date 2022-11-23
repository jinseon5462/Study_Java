package p20221108_interface01;

public interface Employable {
    String getName();

    static boolean isEmpty(String name){
        if(name == null || name.trim().length() == 0){
            return true;
        }else {
            return false;
        }
    }
}
