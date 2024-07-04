package org.example.services;

import org.example.daos.EmployeeDao;
import org.example.exceptions.Entity;
import org.example.exceptions.FailedToCreateException;
import org.example.exceptions.InvalidException;
import org.example.models.EmployeeRequest;
import org.example.validators.EmployeeValidator;

import java.sql.SQLException;

public class EmployeeService {

    EmployeeDao employeeDao;

    EmployeeValidator employeeValidator;

    public EmployeeService(EmployeeDao employeeDao,
                           EmployeeValidator employeeValidator) {
        this.employeeDao = employeeDao;
        this.employeeValidator = employeeValidator;
    }

    public int createEmployee(EmployeeRequest employeeRequest)
            throws FailedToCreateException, SQLException, InvalidException {
        employeeValidator.validateEmployee(employeeRequest);

        int id = employeeDao.createEmployee(employeeRequest);

        if (id == -1) {
            throw new FailedToCreateException(Entity.EMPLOYEE);
        }

        return id;
    }

}
