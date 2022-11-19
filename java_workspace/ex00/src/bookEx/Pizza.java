package bookEx;

public class Pizza {
    int radius;

    public Pizza(int radius){
        this.radius = radius;
    }

    public Pizza whosLargest(Pizza p1, Pizza p2){
        if(p1.radius > p2.radius){
            return p1;
        }else{
            return p2;
        }
    }
}