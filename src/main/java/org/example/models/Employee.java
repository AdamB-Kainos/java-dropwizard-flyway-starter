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

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public Employee(int employeeID, String fName, String lName, double salary,
                    String bankAccountNum, String nationalInsurance) {
        this.employeeID = employeeID;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        this.bankAccountNum = bankAccountNum;
        this.nationalInsurance = nationalInsurance;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(String bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public void setNationalInsurance(String nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }
}
