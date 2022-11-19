package p20221101;

public class User {
    int money;
    int exchanege;
    public int insertMoney(String checkMoney){
        for(int i = 0; i < checkMoney.length(); i++){
            if(checkMoney.charAt(i) >= '0' && checkMoney.charAt(i) <= '9'){
                this.money = Integer.parseInt(checkMoney);
            }else{
                System.out.println("돈을 다시 입력해주세요");
                break;
            }
        }
        if(money >= 1200){
            System.out.println("====메뉴====");
            System.out.println("1. 콜라(1200) 2. 물(800) 3. 실론티(1000)");
        }else if(money >= 800){
            System.out.println("====메뉴====");
            System.out.println("2. 물(800) 3. 실론티(1000)");
        }
        return money;
    }


    public int selectMenu(int selectMenu){
        if(selectMenu == 1){
            System.out.println("콜라를 선택하셨습니다.");
            exchanege = money - 1200;
        }else if(selectMenu == 2){
            System.out.println("물을 선택하셨습니다.");
            exchanege = money - 800;
        }else{
            System.out.println("실론티를 선택하셨습니다.");
            exchanege = money - 1000;
        }
        return exchanege;
    }




}
