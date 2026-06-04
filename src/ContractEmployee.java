public class ContractEmployee extends Employe{

    public ContractEmployee(int employeId, String employeName, double employeSalary, String employeDepartment) {
        super(employeId, employeName, employeSalary, employeDepartment);
    }

    public ContractEmployee() {
        super();
    }

    @Override
    public void displayDetails() {

        System.out.println("\n----- Contract Employee -----");
        System.out.println("ID         : " + getEmployeId());
        System.out.println("Name       : " + getEmployeName());
        System.out.println("Salary     : " + getEmployeSalary());
        System.out.println("Department : " + getEmployeDepartment());
        System.out.println("Type       : Contract");
    }
}
