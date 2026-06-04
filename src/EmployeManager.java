import java.util.ArrayList;

public class EmployeManager{

    private ArrayList<Employe> employes= new ArrayList<>();

    public void addEmploye(Employe employe){
        employes.add(employe);
        System.out.println("Employe Added Successfully");
    }

    public void viewEmployes(){
        if(employes.isEmpty()){
            System.out.println("No Employes found");
        }
        else{
            for(Employe e:employes){
                e.displayDetails();
            }
        }
    }

    public void searchEmployeeById(int employeeId) {

        boolean found = false;

        for (Employe employee : employes) {

            if (employee.getEmployeId() == employeeId) {

                System.out.println("\nEmployee Found");
                System.out.println("-------------------");
                System.out.println("ID: " + employee.getEmployeId());
                System.out.println("Name: " + employee.getEmployeName());
                System.out.println("Department: " + employee.getEmployeDepartment());
                System.out.println("Salary: " + employee.getEmployeSalary());
                System.out.println("------------------");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found with ID: " + employeeId);
        }
    }

    public void DeleteEmployeeById(int employeeId) {
        boolean found = false;
        for (Employe employee : employes) {
            if (employee.getEmployeId() == employeeId) {
                employes.remove(employee);
                found = true;
                System.out.println("Employee Deleted Successfully");
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found with ID: " + employeeId);
        }
    }

    public void UpdateEmployeeById(int employeeId, String employeeName, double employeeSalary) {
        boolean found = false;
        for (Employe employee : employes) {
            if (employee.getEmployeId() == employeeId) {
                employee.setEmployeName(employeeName);
                employee.setEmployeSalary(employeeSalary);
                found = true;
                System.out.println("Employee Updated Successfully");
            }
        }
        if (!found) {
            System.out.println("Employee not found with ID: " + employeeId);
        }
    }

    public void SortBySalary(double employeSalary){
        boolean found = false;
        for (Employe employee : employes) {
            if (employee.getEmployeSalary() == employeSalary) {
                System.out.println("\nEmployee Found");
                System.out.println("-------------------");
                System.out.println("ID: " + employee.getEmployeId());
                System.out.println("Name: " + employee.getEmployeName());
                System.out.println("Department: " + employee.getEmployeDepartment());
                System.out.println("------------------");

                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee not found with Salary: " + employeSalary);
        }
    }


}
