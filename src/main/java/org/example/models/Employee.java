package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    @JsonProperty
    private int employeeID;
    @JsonProperty
    private String fName;
    @JsonProperty
    private String lName;
    @JsonProperty
    private double salary;
    @JsonProperty
    private String bankAccountNum;
    @JsonProperty
    private String nationalInsurance;

    public Employee(final int employeeID,
                    final String fName,
                    final String lName,
                    final double salary,
                    final String bankAccountNum,
                    final String nationalInsurance) {
        this.employeeID = employeeID;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        this.bankAccountNum = bankAccountNum;
        this.nationalInsurance = nationalInsurance;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(final int employeeID) {
        this.employeeID = employeeID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(final String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(final String lName) {
        this.lName = lName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public String getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(final String bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public void setNationalInsurance(final String nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }
}
