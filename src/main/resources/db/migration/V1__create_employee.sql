CREATE TABLE employee (
    employeeID int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    fName varchar(200) NOT NULL,
    lName varchar(200) NOT NULL,
    salary decimal(11, 2) NOT NULL,
    bankAccountNumber varchar(20) NOT NULL,
    nationalInsuranceNumber varchar(20) NOT NULL
);

INSERT INTO employee (fName, lName, salary, bankAccountNumber, nationalInsuranceNumber)
    VALUES ('Adam','Bowman',100000.00, 12345678, 11111111),
     ('John','Smith',50000.00, 22345678, 22222222),
     ('Andrew','Brown',200000.00, 3245678, 33333333),
     ('Thomas','Yellow',30000.00, 42345678, 44444444);