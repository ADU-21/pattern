package com.adu.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.sun.deploy.util.StringUtils;

/**
 * @author adu
 * @data 2019/5/22
 */
public class Company implements Employee {
    private List<Employee> employeeList;

    public Company() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public String getEmployeeDetails() {
        return StringUtils.join(employeeList.stream()
            .map(Employee::getEmployeeDetails)
            .collect(Collectors.toList()), "\n");
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }
}
