package bookEx;

public class PizzaTest {
    public static void main(String[] args){
        Pizza p1 = new Pizza(5);
        Pizza p2 = new Pizza(3);

        Pizza result = p1.whosLargest(p1, p2);
        System.out.println(result.radius);
    }
}