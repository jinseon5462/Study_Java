package p20221031_inheritance;

public class VipCustomer extends Customer {
    private int agentID;
    private double saleRate;

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    public double getSaleRate() {
        return saleRate;
    }

    public void setSaleRate(double saleRate) {
        this.saleRate = saleRate;
    }

    public VipCustomer(String customerName){
        this.customerName = customerName;
        this.customerGrade = "VIP";
        this.bonusRatio = 0.05;
        this.saleRate = 0.1;
    }
    @Override
    public int calcPrice(int price){
        bonusPoint += (int) (price * bonusRatio);
        int salePrice = (int)(price * saleRate);
        return price - salePrice;
    }
    public String showCustomerInfo(){
        String info = "\n✨VIP고객 정보✨" + "\n고객 이름 : " + customerName + "\n고객등급 : " + customerGrade + "\n현재 적립 포인트 : " + bonusPoint;
        return info;
    }
}