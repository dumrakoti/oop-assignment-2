public class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructors
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Method to raise salary by a given percentage
    public void raiseSalary(double percent) {
        double raiseAmount = salary * (percent / 100);
        salary += raiseAmount;
    }

    public static void main(String[] args) {
        // Test the Employee class
        Employee employee1 = new Employee(1, "John Doe", 50000.0);
        System.out.println("Employee 1: ID = " + employee1.getId() + ", Name = " + employee1.getName() + ", Salary = $" + employee1.getSalary());

        employee1.raiseSalary(10); // Raise salary by 10%
        System.out.println("After raise, Employee 1 salary: $" + employee1.getSalary());
    }
}
