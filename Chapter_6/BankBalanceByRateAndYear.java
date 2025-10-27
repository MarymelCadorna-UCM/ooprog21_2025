import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double initialBalance;
        
        System.out.print("Enter initial bank balance > ");
        initialBalance = input.nextDouble();

        for (double rate = 0.02; rate <= 0.05; rate += 0.01) {
            double balance = initialBalance;
            System.out.printf("\nWith an initial balance of $%.1f at an interest rate of %.2f\n", initialBalance, rate);

            for (int year = 1; year <= 4; year++) {
                balance = balance + (balance * rate);
                System.out.printf("After year %d balance is %.4f\n", year, balance);
            }
        }
        input.close();
    }
}
