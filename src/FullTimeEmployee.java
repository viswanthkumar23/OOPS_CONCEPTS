public class FullTimeEmployee extends Employe{

    public FullTimeEmployee(int employeId, String employeName, double employeSalary, String employeDepartment) {
        super(employeId, employeName, employeSalary, employeDepartment);
    }

    public FullTimeEmployee() {
        super();
    }

    @Override
    public void displayDetails() {

        System.out.println("\n----- Full Time Employee -----");
        System.out.println("ID         : " + getEmployeId());
        System.out.println("Name       : " + getEmployeName());
        System.out.println("Salary     : " + getEmployeSalary());
        System.out.println("Department : " + getEmployeDepartment());
        System.out.println("Type       : Full Time");
    }
}