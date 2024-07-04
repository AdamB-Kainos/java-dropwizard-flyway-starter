package org.example.daos;

import org.example.models.DeliveryEmployeeRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeliveryEmployeeDao {
    public int createDeliveryEmployee(final DeliveryEmployeeRequest
                                      deliveryEmployeeRequest) throws
            SQLException {
        Connection c = DatabaseConnector.getConnection();

        String insertStatement = "INSERT INTO deliveryEmployee (fName, lName, "
                + "salary, "
                + "bankAccountNumber, nationalInsuranceNumber) "
                + "VALUES (?,?,?,?,?)";

        PreparedStatement st = c.prepareStatement(insertStatement,
                Statement.RETURN_GENERATED_KEYS);

        st.setString(1, deliveryEmployeeRequest.getfName());
        st.setString(2, deliveryEmployeeRequest.getlName());
        st.setDouble(3, deliveryEmployeeRequest.getSalary());
        st.setString(4, deliveryEmployeeRequest.getBankAccountNum());
        st.setString(5, deliveryEmployeeRequest.getNationalInsurance());

        st.executeUpdate();

        ResultSet rs = st.getGeneratedKeys();

        if (rs.next()) {
            return rs.getInt(1);
        }

        return -1;
    }
}
