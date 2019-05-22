package com.adu.structural.composite;

/**
 * @author adu
 * @data 2019/5/22
 */
public class Client {
    public static void main(String[] args) {
        Company company = new Company();

        Developer developer1 = new Developer(101L, "developer1");
        Developer developer2 = new Developer(102L, "developer2");
        Manager manager1 = new Manager(201L, "manager1");

        company.addEmployee(developer1);
        company.addEmployee(developer2);
        company.addEmployee(manager1);

        System.out.println(company.getEmployeeDetails());
    }
}
