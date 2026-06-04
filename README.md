# Employee Management System

## Project Overview

Employee Management System is a Java console-based application developed using Object-Oriented Programming (OOP) principles. The application allows users to manage employee records through various operations such as adding, viewing, searching, updating, and deleting employees.

The project demonstrates the practical implementation of core Java OOP concepts including Abstraction, Inheritance, Encapsulation, Polymorphism, Constructor Overloading, and Collections Framework.

---

## Features

### Employee Management

* Add Full-Time Employee
* Add Contract Employee
* View All Employees
* Search Employee by ID
* Update Employee Details
* Delete Employee by ID
* Search Employee by Salary

### Input Validation

* Employee ID accepts only numeric values
* Employee Name accepts only alphabetic characters
* Salary must be greater than zero
* Department accepts only alphabetic characters

---

## OOP Concepts Implemented

### 1. Encapsulation

Employee properties are declared as private fields and accessed using getter and setter methods.

Example:

```java
private int employeId;
private String employeName;
private double employeSalary;
private String employeDepartment;
```

### 2. Abstraction

The Employee class is declared as an abstract class and contains an abstract method.

```java
public abstract void displayDetails();
```

### 3. Inheritance

FullTimeEmployee and ContractEmployee inherit from the Employee class.

```java
public class FullTimeEmployee extends Employe
public class ContractEmployee extends Employe
```

### 4. Runtime Polymorphism

Parent class reference is used to hold child class objects.

```java
Employe employee;

employee = new FullTimeEmployee();
employee = new ContractEmployee();
```

### 5. Constructor Overloading

Both default and parameterized constructors are implemented.

```java
public Employe()

public Employe(int employeId,
               String employeName,
               double employeSalary,
               String employeDepartment)
```

### 6. Collections Framework

ArrayList is used to store employee records dynamically.

```java
private ArrayList<Employe> employes = new ArrayList<>();
```

---

## Project Structure

```text
EmployeeManagementSystem
│
├── Employe.java
├── FullTimeEmployee.java
├── ContractEmployee.java
├── EmployeManager.java
└── EmployeManagement.java
```

### Class Responsibilities

#### Employe.java

* Abstract parent class
* Contains common employee properties
* Defines abstract displayDetails() method

#### FullTimeEmployee.java

* Represents full-time employees
* Overrides displayDetails()

#### ContractEmployee.java

* Represents contract employees
* Overrides displayDetails()

#### EmployeManager.java

* Handles business operations
* Add Employee
* View Employee
* Search Employee
* Update Employee
* Delete Employee

#### EmployeManagement.java

* Main class
* Menu-driven user interaction

---

## Sample Output

```text
===== Employee Management System =====

1. Add Employee
2. View Employees
3. Search Employee
4. Delete Employee
5. Update Employee Details
6. Sort Employee Salary
7. Exit

Choose Employee Type: 1

Enter Employee ID: 101
Enter Employee Name: John
Enter Employee Salary: 50000
Enter Department: Java

Employee Added Successfully
```

---

## Technologies Used

* Java
* Object-Oriented Programming
* Collections Framework
* Constructor Overloading
* Runtime Polymorphism
* Input Validation

---

## Author

Viswanth Kumar

Java Developer Learning Project
