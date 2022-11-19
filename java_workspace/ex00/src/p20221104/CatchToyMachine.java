package p20221104;

public class CatchToyMachine {
    Toy[] toys;

    public CatchToyMachine(){
        toys = new Toy[10];

        for(int i = 0; i < toys.length; i++){
            if(i % 3 == 0){
                int rd = ((int)(Math.random() * 3));
                if(rd == 0){
                    Doll d1 = new Doll();
                    toys[i] = d1;
                    toys[i].setName("곰인형");
                }else if(rd == 1){
                    Doll d2 = new Doll();
                    toys[i] = d2;
                    toys[i].setName("공주인형");
                }else if(rd == 2){
                    Doll d3 = new Doll();
                    toys[i] = d3;
                    toys[i].setName("춘식이인형");
                }
            }else if(i % 3 == 1){
                int rd = ((int)(Math.random() * 3));
                if(rd == 0){
                    KeyHolder k1 = new KeyHolder();
                    toys[i] = k1;
                    toys[i].setName("HYNDAI 키홀더");
                }else if(rd == 1){
                    KeyHolder k2 = new KeyHolder();
                    toys[i] = k2;
                    toys[i].setName("BMW 키홀더");
                }else if(rd == 2){
                    KeyHolder k3 = new KeyHolder();
                    toys[i] = k3;
                    toys[i].setName("벤츠 키홀더");
                }
            }else if(i % 3 == 2){
                int rd = ((int)(Math.random() * 3));
                if(rd == 0){
                    BubbleGum b1 = new BubbleGum();
                    toys[i] = b1;
                    toys[i].setName("보라색풍선껌");
                }else if(rd == 1){
                    BubbleGum b2 = new BubbleGum();
                    toys[i] = b2;
                    toys[i].setName("노란색풍선껌");
                }else if(rd == 2){
                    BubbleGum b3 = new BubbleGum();
                    toys[i] = b3;
                    toys[i].setName("파란색풍선껌");
                }
            }
        }
    }
    public Toy catchToy(){
        int rd = ((int)(Math.random() * 10));
        return toys[rd];
    }
}