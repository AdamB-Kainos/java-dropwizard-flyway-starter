package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryEmployee {
    @JsonProperty
    private int deliveryEmployeeID;
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

    public DeliveryEmployee(final int deliveryEmployeeID,
                            final String fName,
                            final String lName,
                            final double salary,
                            final String bankAccountNum,
                            final String nationalInsurance) {
        this.deliveryEmployeeID = deliveryEmployeeID;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        this.bankAccountNum = bankAccountNum;
        this.nationalInsurance = nationalInsurance;
    }

    public int getDeliveryEmployeeID() {
        return deliveryEmployeeID;
    }

    public void setDeliveryEmployeeID(final int deliveryEmployeeID) {
        this.deliveryEmployeeID = deliveryEmployeeID;
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
