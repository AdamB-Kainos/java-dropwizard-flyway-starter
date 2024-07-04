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

    }
}
