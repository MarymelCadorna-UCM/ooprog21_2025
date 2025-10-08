import javax.swing.JOptionPane;

public class Payroll {
    public static void main(String[] args) {
        String hoursInput = JOptionPane.showInputDialog("How many hours did you work this week?");
        double hoursWorked = Double.parseDouble(hoursInput);

        String rateInput = JOptionPane.showInputDialog("What is your regular pay rate?");
        double payRate = Double.parseDouble(rateInput);

        Employee emp = new Employee(1234, payRate);

        double regularPay = emp.calculateRegularPay(hoursWorked);
        double overtimePay = emp.calculateOvertimePay(hoursWorked);

        String message = "Employee Number: " + emp.getEmployeeNumber()
                + "\nRegular pay is " + regularPay
                + "\nOvertime pay is " + overtimePay;

        JOptionPane.showMessageDialog(null, message, "Payroll Summary", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0); 
    }
}
