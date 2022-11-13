package kr.co.greenCompany.vo;

public class PartTimeEmployee extends Employee{
    private int workDay;

    public PartTimeEmployee(String empno, String name, int pay, int workDay){
        super(empno, name, pay);
        this.workDay = workDay;
    }

    public double getMonthPay(){
        pay = pay * workDay;
        return pay;
    }

    public String toString(){
        String s = "[사원번호 : " + empno + "\t이름 : " + name + "\tPay : " + pay + "]";
        return s;
    }
}