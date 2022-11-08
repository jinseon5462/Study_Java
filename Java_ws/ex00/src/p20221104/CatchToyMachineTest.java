package p20221104;


public class CatchToyMachineTest {
    public static void main(String[] args) {
        CatchToyMachine cm = new CatchToyMachine();

        Toy toy = cm.catchToy();
        //System.out.println(toy.getName());

        if(toy instanceof Doll){
            System.out.println("인형이 나왔습니다." + toy.getName());
        }else if(toy instanceof KeyHolder){
            System.out.println("키홀더가 나왔습니다." + toy.getName());
        }

        for(int i = 0; i < 10; i++){
            System.out.println(cm.toys[i].getName());
        }
    }
}