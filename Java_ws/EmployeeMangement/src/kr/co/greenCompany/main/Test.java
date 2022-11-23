package kr.co.greenCompany.main;

import kr.co.greenCompany.service.DBService;
import kr.co.greenCompany.vo.Employee;
import kr.co.greenCompany.vo.RegularEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DBService dbs = new DBService();
        Employee emp1 = new RegularEmployee("E001", "홍길동", 3600, 1200);
        Employee emp2 = new RegularEmployee("E002", "이춘배", 3900, 200);
        Employee emp3 = new RegularEmployee("E003", "곽길상", 3100, 100);
        Employee emp4 = new RegularEmployee("E004", "배춘식", 3300, 1000);
        Employee emp5 = new RegularEmployee("E005", "김명팔", 5500, 900);

        // Create
        dbs.insertEmp(emp1);
        dbs.insertEmp(emp2);
        dbs.insertEmp(emp3);
        dbs.insertEmp(emp4);
        dbs.insertEmp(emp5);

        // Read
        Employee temp1 = dbs.getEmp("E001");
        Employee temp2 = dbs.getEmp("E002");
        Employee temp3 = dbs.getEmp("E003");
        Employee temp4 = dbs.getEmp("E004");
        Employee temp5 = dbs.getEmp("E005");
        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);
        System.out.println(temp4);
        System.out.println(temp5);

        //Update
        emp1.setEmpno("E1111");   // emp1의 사번을 E111로 변경
        dbs.updateEmp(emp1);

        // Delete
        dbs.deleteEmp(emp2.getEmpno());
        dbs.deleteEmp(emp3.getEmpno());


        // 리스트 출력
        ArrayList<Employee> list = new ArrayList<>();
        System.out.println(dbs.getEmpList());

    }
}