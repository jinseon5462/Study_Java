package p20221108_interface02;

import java.util.ArrayList;

public class Ship422 implements Shippable{

    ArrayList<Human> list = new ArrayList<>();


    @Override
    public void ridingPassenger(Human human) {
        if(human instanceof Man){
            list.add(human);
        }else if(human instanceof Woman){
            list.add(human);
        }else{
            //System.out.println("외계인이다!");
        }
    }

    @Override
    public int countingMan() {
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) instanceof Man){
                count++;
            }
        }
        return count;
    }

    public int countingWoman(){
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) instanceof Woman){
                count++;
            }
        }
        return count;
    }

    public void showList(){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).name);
        }
    }

}
