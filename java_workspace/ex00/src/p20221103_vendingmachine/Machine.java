package p20221103_vendingmachine;

public class Machine {

    public int checkMoney(String insertMoney){
        for(int i = 0; i < insertMoney.length(); i++){
            if(insertMoney.charAt(i) >= '0' && insertMoney.charAt(i) <= '9'){
                int money = Integer.parseInt(insertMoney);
                return money;
            }
        }
        return 0;
    }

    public void select(){

    }

    public void insert(int money){
        if(money >= 1200){
            System.out.println("==========Menu==========");
            System.out.println("1. 콜라(1200) 2. 실론티(1000) 3. 물(800)");
        }else if(money >= 1000){
            System.out.println("==========Menu==========");
            System.out.println("2. 실론티(1000) 3. 물(800)");
        }else{
            System.out.println("==========Menu==========");
            System.out.println("3. 물(800)");
        }
    }
}