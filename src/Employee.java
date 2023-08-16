public class Employee extends Person{
    private int employeeId;
    private double salary;
    private static int employeeCount;

    public Employee(String name, double salary) {
        super(name);
        this.employeeId = ++employeeCount;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }


    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "employeeId=" + employeeId +
                ", salary=" + salary +
                '}';
    }




}
