package kr.co.greenCompany.service;

import kr.co.greenCompany.vo.Employee;
import java.util.ArrayList;

public interface IDBService {
    public void insertEmp(Employee emp);
    public Employee getEmp(String empno);
    public ArrayList<Employee> getEmpList();
    public void updateEmp(Employee emp);
    public void deleteEmp(String empno);
}