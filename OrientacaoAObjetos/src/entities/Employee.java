package entities;

public class Employee {
    private String employeeName;
    private double grossSalary;
    private double tax;

    public Employee (String employeeName, double grossSalary, double tax){
        this.employeeName = employeeName;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public double netSalary(){
        return getGrossSalary()-getTax();
    }

    public void increaseSalary(double percentage){
        setGrossSalary(getGrossSalary() + (getGrossSalary()*percentage/100));
    }

    public String toString(){
        return String.format("\nEmployee's name: %s\nNet salary: $%.2f\n", getEmployeeName(),netSalary());
    }
}
