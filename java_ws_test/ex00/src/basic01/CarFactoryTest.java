package basic01;

public class CarFactoryTest {
    public static void main(String[] args){
        /*
        CarFactory[] car = new CarFactory[5];

        for(int i = 0; i < 5; i++){
            if(i % 2 == 0){
                car[i] = new CarFactory(i + 1, "Blue");
            }else{
                car[i] = new CarFactory(i + 1, "Yellow");
            }
        }

        for(int j = 0; j < 5; j++){
            car[j].showInfo();
        }
         */
        CarFactory[] car = new CarFactory[10];

        for(int i = 0; i < 5; i++){
            if(i % 2 == 0){
                car[i] = new CarFactory(i + 1, "Red");
            }else{
                car[i] = new CarFactory(i + 1, "Yellow");
            }
        }

        for(int j = 0; j < 5; j++){
            car[j].showInfo();
        }
    }
}