public class Employee {
    private int id;
    private String name;
    private Salary salary;
    public Employee(int id, String name, Salary salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalaryAmount() {
        return salary.getAmount();
    }
    public void setSalaryAmount(double amount) {
        salary.setAmount(amount);
    }
    public double calculateTax() {
        return salary.getAmount() * 0.24;
    }
}
