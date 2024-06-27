ALTER TABLE client
ADD employeeID int
FOREIGN KEY (employeeID) REFERENCES salesEmployee(employeeID);