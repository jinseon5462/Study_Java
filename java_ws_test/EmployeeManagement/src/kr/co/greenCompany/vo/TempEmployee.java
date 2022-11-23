package kr.co.greenCompany.vo;

public class TempEmployee extends Employee{
    private int hireYear;

    public TempEmployee(String empno, String name, int pay, int hireYear){
        super(empno, name, pay);
        this.hireYear = hireYear;
    }
    public double getMonthPay(){
        pay = pay / 12;
        return pay;
    }

    public String toString(){
        String s = "[사원번호 : " + empno + "\t이름 : " + name + "\tPay : " + pay + "]";
        return s;
    }
}