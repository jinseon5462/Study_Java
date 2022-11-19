package p20221103_inheritance01;

public class CompanyTest {
    public static void main(String[] args) {
        Company c1 = Company.com();
        Company c2 = Company.com();
        System.out.println(c1 == c2);
    }
}