package org.example.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryEmployeeRequest {
    private String fName;
    private String lName;
    private double salary;
    private String bankAccountNum;
    private String nationalInsurance;

    @JsonCreator
    public DeliveryEmployeeRequest(
            @JsonProperty("fName") final String fName,
            @JsonProperty("lName") final String lName,
            @JsonProperty("salary") final double salary,
            @JsonProperty("bankAccountNum") final String bankAccountNum,
            @JsonProperty("nationalInsurance") final String nationalInsurance) {
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        this.bankAccountNum = bankAccountNum;
        this.nationalInsurance = nationalInsurance;
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
