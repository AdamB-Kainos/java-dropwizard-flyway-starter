package org.example.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeRequest {
    private String fName;
    private String lName;
    private double salary;
    private String bankAccountNum;
    private String nationalInsurance;

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

    @JsonCreator
    public EmployeeRequest(
            @JsonProperty("fName") String fName,
            @JsonProperty("lName") String lName,
            @JsonProperty("salary") double salary,
            @JsonProperty("bankAccountNum") String bankAccountNum,
            @JsonProperty("nationalInsurance") String nationalInsurance) {
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        this.bankAccountNum = bankAccountNum;
        this.nationalInsurance = nationalInsurance;
    }
}
