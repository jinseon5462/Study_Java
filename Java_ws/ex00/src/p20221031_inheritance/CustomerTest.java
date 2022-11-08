package p20221031_inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer kim = new Customer("김명팔");
        kim.calcPrice(100000);
        String info = kim.showCustomerInfo();
        System.out.println(info);


        VipCustomer lee = new VipCustomer("이춘식");
        lee.calcPrice(100000);
        String vipInfo = lee.showCustomerInfo();
        System.out.println(vipInfo);

        VipCustomer kwak = new VipCustomer("곽두팔");
        kwak.calcPrice(200000);
        String vipInfo2 = kwak.showCustomerInfo();
        System.out.println(vipInfo2);
    }
}