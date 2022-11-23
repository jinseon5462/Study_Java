package kr.co.greenCompany.vo;

public abstract class Employee {
    protected String empno;
    protected String name;
    protected int pay;

    public Employee(String empno, String name, int pay) {
        this.empno = empno;
        this.name = name;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "...";
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
}