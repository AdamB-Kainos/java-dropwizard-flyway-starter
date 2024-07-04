package org.example.validators;

import org.example.exceptions.Entity;
import org.example.exceptions.InvalidException;
import org.example.models.EmployeeRequest;

public class EmployeeValidator {

    public void validateEmployee(final EmployeeRequest employeeRequest)
            throws InvalidException {

        if (employeeRequest.getSalary() < 1) {
            throw new InvalidException(Entity.EMPLOYEE,
                    "Invalid EmployeeId, must be greater than 1");
        }

    }
}
