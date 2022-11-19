package p20221103_vendingmachine;

public class User {

    public int useMachine(Machine machine, String inputMoney){
        int money = machine.checkMoney(inputMoney);
        return money;
    }

    public void insertMoney(Machine machine, int money){
        machine.insert(money);
    }
}