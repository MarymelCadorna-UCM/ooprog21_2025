public class Employee {
    private int employeeNumber;
    private double payRate;
    public static final int MAX_EMPLOYEE_NUMBER = 9999;
    public static final double MAX_PAY_RATE = 60.00;
    public static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate) {
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    public double calculateRegularPay(double hoursWorked) {
        double regularHours = Math.min(40, hoursWorked);
        return regularHours * payRate;
    }

    public double calculateOvertimePay(double hoursWorked) {
        double overtimeHours = Math.max(0, hoursWorked - 40);
        return overtimeHours * payRate * OVERTIME_MULTIPLIER;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
}
