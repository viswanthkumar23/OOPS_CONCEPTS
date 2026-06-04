import java.util.Scanner;

public class EmployeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeManager manager = new EmployeManager();
        Employe employee;

        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Update Employee Details");
            System.out.println("6. Sort Employee Salary");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("\n1. Full Time Employee");
                    System.out.println("2. Contract Employee");
                    System.out.print("Choose Employee Type: ");
                    String type = sc.next();


                    if (type.equals("1")) {
                        employee = new FullTimeEmployee();
                    }else if(type.equals("2")) {
                        employee = new ContractEmployee();
                    }else {
                        System.out.println("Invalid Choice");
                        break;
                    }

                    System.out.print("Enter Employee ID: ");
                    String employeeID = sc.next();
                    if(employeeID.matches("[0-9]+")) {
                        employee.setEmployeId(Integer.parseInt(employeeID));
                    }else{
                        System.out.println("Invalid Employee ID");
                        break;
                    }
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String employeeName = sc.nextLine();
                    if(employeeName.matches("[a-zA-Z]+")) {
                        employee.setEmployeName(employeeName);
                    }else{
                        System.out.println("Invalid Employee Name");
                        break;
                    }

                    System.out.print("Enter Employee Salary: ");
                    double employeeSalary = sc.nextDouble();
                    if(employeeSalary > 0) {
                        employee.setEmployeSalary(employeeSalary);
                    }else{
                        System.out.println("Invalid Employee Salary");
                        break;
                    }
                    sc.nextLine();
                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();
                    if(department.matches("[a-zA-Z]+")) {
                        employee.setEmployeDepartment(department);
                    }else{
                        System.out.println("Invalid Department Name");
                        break;
                    }
                    manager.addEmploye(employee);
                    break;
                case 2:
                    manager.viewEmployes();
                    break;
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    String searchId = sc.next();
                    if(searchId.matches("[0-9]+")) {
                        manager.searchEmployeeById(Integer.parseInt(searchId));
                        break;
                    }else{
                        System.out.println("Invalid Employee ID");
                        break;
                    }
                    case 4:
                        System.out.print("Enter Employee ID to search: ");
                        String DeleteSearchId = sc.next();
                        if(DeleteSearchId.matches("[0-9]+")) {
                            manager.DeleteEmployeeById(Integer.parseInt(DeleteSearchId));
                            break;
                        }else{
                            System.out.println("Invalid Employee ID");
                            break;
                        }
                        case 5:
                        System.out.print("Enter Employee ID to search: ");
                        int updateSearchId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Employee Name: ");
                        String updateEmployeName= sc.nextLine();
                        System.out.print("Enter Employee Salary: ");
                        double updateEmployeSalary=sc.nextDouble();
                        manager.UpdateEmployeeById(updateSearchId,updateEmployeName,updateEmployeSalary);
                        break;

                        case 6:
                            System.out.print("Enter Employee Salary to sort: ");
                            double salary = sc.nextDouble();
                            if(salary > 0) {
                                manager.SortBySalary(salary);
                                break;
                            }else{
                                System.out.println("Invalid Employee Salary");
                                break;
                            }
                            case 7:
                                System.out.println("\n=====Exiting the Application=====");

            }

        } while (choice != 7);

        sc.close();
    }
}
