package basic01;

public class TriangleTest {
    public static void main(String[] args) {
        /*
        Triangle t1 = new Triangle(15, 20);
        System.out.println(t1.getArea());
         */

        Triangle[] triangles = new Triangle[3];

        for(int i = 0; i < 3; i++){
            triangles[i] = new Triangle(i + 4, i + 6);
            triangles[i].getArea();
        }

        for(int j = 0; j < 3; j++){
            triangles[j].showInfo();
        }
    }
}