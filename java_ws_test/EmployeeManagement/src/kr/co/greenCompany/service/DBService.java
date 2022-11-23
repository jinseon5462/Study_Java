package kr.co.greenCompany.service;


import kr.co.greenCompany.vo.Employee;
import kr.co.greenCompany.vo.RegularEmployee;

import java.util.ArrayList;

public class DBService implements IDBService{
    ArrayList<Employee> empList = new ArrayList<Employee>();

    @Override
    public void insertEmp(Employee emp) {
        empList.add(emp);
    }

    @Override
    public Employee getEmp(String empno) {
        Employee emp = null;

        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i).getEmpno().equals(empno)){
                emp = empList.get(i);
                break;
            }
        }
        return emp;
    }

    @Override
    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    @Override
    public void updateEmp(Employee emp) {
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i).equals(emp)){
                empList.set(i, emp);
            }
        }
    }

    @Override
    public void deleteEmp(String empno) {
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i).getEmpno().equals(empno)){
                empList.remove(i);
            }
        }
    }
}