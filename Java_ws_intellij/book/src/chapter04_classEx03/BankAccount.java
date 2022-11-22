package chapter04_classEx03;

public class BankAccount {
    int accountNumber;  // 계좌번호
    String owner;       // 예금주
    int balance;        // 잔액을 표시하는 변수

    //저금
    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        balance -= amount;
    }

    public String toString(){
        return "현재 잔액은 " + balance + "원 입니다.";
    }
}
