package p20221108_interface01;

interface Buy {
    void buy();
}

interface Sell {
    void sell();
}

class Customer implements Buy, Sell {

    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }
}

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer();

        Buy buyer = cust;
        buyer.buy();

        Sell seller = cust;
        seller.sell();

        if(seller instanceof Customer) {
            Customer cust2 = (Customer) seller;
            cust2.buy();
            cust2.sell();
        }
    }
}
