package org.example.validators;

import org.example.exceptions.Entity;
import org.example.exceptions.InvalidException;
import org.example.models.DeliveryEmployeeRequest;

public class DeliveryEmployeeValidator {

    public void validateEmployee(final DeliveryEmployeeRequest
                                         deliveryEmployeeRequest)
            throws InvalidException {

        if (deliveryEmployeeRequest.getSalary() < 1) {
            throw new InvalidException(Entity.EMPLOYEE,
                    "Invalid DeliveryEmployeeId, must be greater than 1");
        }
        if (deliveryEmployeeRequest.getfName() == null) {
            throw new InvalidException(Entity.EMPLOYEE,
                    "Invalid DeliveryEmployee FirstName, must not be null");
        }
        if (deliveryEmployeeRequest.getlName() == null) {
            throw new InvalidException(Entity.EMPLOYEE,
                    "Invalid DeliveryEmployee LastName, must not be null");
        }
        if (deliveryEmployeeRequest.getBankAccountNum() == null) {
            throw new InvalidException(Entity.EMPLOYEE,
                    "Invalid DeliveryEmployee BankAccountNumber, must not be "
                            + "null");
        }
        if (deliveryEmployeeRequest.getNationalInsurance() == null) {
            throw new InvalidException(Entity.EMPLOYEE,
                    "Invalid DeliveryEmployeeId, NationalInsurance Number must"
                            + " be greater than 1");
        }

    }
}
