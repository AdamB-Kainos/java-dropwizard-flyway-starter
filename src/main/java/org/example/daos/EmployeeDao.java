package org.example.daos;

import org.example.models.EmployeeRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao {
    public int createEmployee(final EmployeeRequest employeeRequest) throws
            SQLException {
        Connection c = DatabaseConnector.getConnection();

        String insertStatement = "INSERT INTO employee (fName, lName, salary, "
                + "bankAccountNumber, nationalInsuranceNumber) "
                + "VALUES (?,?,?,?,?)";

        PreparedStatement st = c.prepareStatement(insertStatement,
                Statement.RETURN_GENERATED_KEYS);

        st.setString(1, employeeRequest.getfName());
        st.setString(2, employeeRequest.getlName());
        st.setDouble(3, employeeRequest.getSalary());
        st.setString(4, employeeRequest.getBankAccountNum());
        st.setString(5, employeeRequest.getNationalInsurance());

        st.executeUpdate();

        ResultSet rs = st.getGeneratedKeys();

        if (rs.next()) {
            return rs.getInt(1);
        }

        return -1;
    }
}
