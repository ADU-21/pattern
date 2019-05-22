package com.adu.structural.composite;

/**
 * @author adu
 * @data 2019/5/22
 */
public class Developer implements Employee {
    private Long employeeId;
    private String name;

    public Developer(Long employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public String getEmployeeDetails() {
        return String.format("%s: %s", this.employeeId, this.name);
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
