abstract class Employe {

    private int employeId;
    private String employeName;
    private double employeSalary;
    private String employeDepartment;

    public Employe() {
    }

    public Employe(int employeId, String employeName, double employeSalary, String employeDepartment) {
        this.employeId = employeId;
        this.employeName = employeName;
        this.employeSalary = employeSalary;
        this.employeDepartment = employeDepartment;
    }

    public int getEmployeId() {
            return employeId;
    }
    public void setEmployeId(int employeId) {

        this.employeId = employeId;
    }

    public String getEmployeName() {

        return employeName;
    }

    public void  setEmployeName(String employeName) {

        this.employeName = employeName;
    }

    public double getEmployeSalary() {
        return employeSalary;
    }

    public void setEmployeSalary(double employeSalary) {

        this.employeSalary = employeSalary;
    }

    public String getEmployeDepartment() {

        return employeDepartment;
    }
    public void setEmployeDepartment(String employeDepartment) {

        this.employeDepartment = employeDepartment;
    }

    public abstract void displayDetails();
}
