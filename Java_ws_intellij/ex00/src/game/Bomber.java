package game;

public class Bomber {
    static int bomb = 10;
    char[][] map = new char[5][5];

    public Bomber(char[][] map){
        this.map = map;
    }

    public boolean dropBomb(int x, int y){
        if(map[x][y] == 'O'){
            bomb -= 1;
            System.out.println("\n명중...!!");
            System.out.println("The end...");
            return true;
        }else{
            bomb -= 1;
            System.out.println("\n불발...!!");
            return false;
        }
    }

    public void showInfo(){
        System.out.println("\n남은 폭탄의 갯수 : " + bomb);
    }

}