public class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }

    private double calculateTotalSalary() {
        return salary + bonus;
    }
}

