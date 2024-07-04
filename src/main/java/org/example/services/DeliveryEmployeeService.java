package org.example.services;

import org.example.daos.DeliveryEmployeeDao;
import org.example.exceptions.Entity;
import org.example.exceptions.FailedToCreateException;
import org.example.exceptions.InvalidException;
import org.example.models.DeliveryEmployeeRequest;
import org.example.validators.DeliveryEmployeeValidator;

import java.sql.SQLException;

public class DeliveryEmployeeService {

    DeliveryEmployeeDao deliveryEmployeeDao;

    DeliveryEmployeeValidator deliveryEmployeeValidator;

    public
    DeliveryEmployeeService(final DeliveryEmployeeDao deliveryEmployeeDao,
                                   final DeliveryEmployeeValidator deliveryEmployeeValidator) {
        this.deliveryEmployeeDao = deliveryEmployeeDao;
        this.deliveryEmployeeValidator = deliveryEmployeeValidator;
    }

    public int createDeliveryEmployee(
            final DeliveryEmployeeRequest employeeRequest)
            throws FailedToCreateException, SQLException, InvalidException {
        deliveryEmployeeValidator.validateEmployee(employeeRequest);

        int id = deliveryEmployeeDao.createDeliveryEmployee(employeeRequest);

        if (id == -1) {
            throw new FailedToCreateException(Entity.EMPLOYEE);
        }

        return id;
    }

}
