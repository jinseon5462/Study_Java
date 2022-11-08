package kr.co.greenCompany.vo;

public class RegularEmployee extends Employee{
    private int bonus;

    public RegularEmployee(String empno, String name, int pay, int bonus){
        super(empno, name, pay);
        this.bonus = bonus;
    }

    public double getMonthPay(){
        pay = (pay + bonus) / 12;
        return pay;
    }

    public String toString(){
        String s = "[사원번호 : " + empno + "\t이름 : " + name + "\tPay : " + pay + "]";
        return s;
    }
}