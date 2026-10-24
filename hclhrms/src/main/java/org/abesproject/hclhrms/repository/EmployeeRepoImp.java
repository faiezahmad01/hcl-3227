package org.abesproject.hclhrms.repository;

import org.abesproject.hclhrms.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepoImp {
    String addemp(Employee emp);
    String addEmpBulk(List<Employee> ls);
    List<Employee> getEmp();
    Employee getEmpById(long empid);
    String deleteById(long empid);
    String updateById(long emp,Employee updateEmp);

}

//package org.abesproject.hclhrms.repository;

import org.abesproject.hclhrms.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmpRepoImp implements EmployeeRepo {
    List<Employee> emplist = new ArrayList<>();

    @Override
    public String addemp(Employee emp) {
        emplist.add(emp);
        return "Employee added succesfully";
    }

    @Override
    public String addEmpBulk(List<Employee> ls) {
        emplist.addAll(ls);
        return "Employee added in bulk";
    }

    @Override
    public List<Employee> getEmp() {
        return emplist;
    }

    @Override
    public Employee getEmpById(long empid) {
        return emplist.stream().filter(e->e.getEmp_id()==empid).findFirst().orElse(null);
    }

    @Override
    public String deleteById(long empid) {
        return "";
    }

    @Override
    public String updateById(long empId, Employee updateEmp) {
        Employee existingEmp = getEmpById(empId);

        existingEmp.setName(updateEmp.getName());
        existingEmp.setSalary(updateEmp.getSalary());
        existingEmp.setDepartment(updateEmp.getDepartment());

        employeeRepository.save(existingEmp);

        return "Employee updated successfully";
    }
}