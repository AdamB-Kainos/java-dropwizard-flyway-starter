ALTER TABLE Project
ADD COLUMN clientID int 
NOT NULL;

ALTER TABLE Project
ADD FOREIGN KEY (clientID)
REFERENCES client(clientID);

ALTER TABLE Project
ADD COLUMN TechLead int;

ALTER TABLE Project
ADD FOREIGN KEY (TechLead)
REFERENCES deliveryEmployee(employeeID);
