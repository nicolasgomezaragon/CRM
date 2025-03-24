CREATE TABLE Companies (
    ID  INT PRIMARY KEY, 
    Name VARCHAR(100),
    CSM VARCHAR(100)
);

CREATE TABLE Addresses (
    ID INT PRIMARY KEY,
    Street  VARCHAR(100),
    City VARCHAR(100),
    State VARCHAR(100),
    PostalCode VARCHAR(100),
    CompanyID INT,
    FOREIGN KEY (CompanyID) REFERENCES Companies(ID)
);

CREATE TABLE Clients (
    ID INT PRIMARY KEY,
    Name VARCHAR(100),
    Email VARCHAR(100),
    DepartmentID VARCHAR(100),
    FOREIGN KEY (DepartmentID) REFERENCES Departments(ID)
);

CREATE TABLE  Departments (
    ID int PRIMARY KEY,
    Name VARCHAR(100)
);

/*
INSERT INTO Companies (ID, Name, Industry, Address) 
VALUES (1, 'FinTech Co.', 'Finance', '123 Wall Street');

INSERT INTO Clients (ID, Name, Email, Phone, CompanyID) 
VALUES (1, 'John Doe', 'john.doe@example.com', '555-1234', 1);

INSERT INTO Departments (ID, Name) 
VALUES (1, 'Customer Support');

INSERT INTO Agents (ID, Name, Email, DepartmentID) 
VALUES (1, 'Alice Smith', 'alice.smith@example.com', 1);
*/ 
