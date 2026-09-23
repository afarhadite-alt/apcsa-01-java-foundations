public class InterestCode {

    // Prints the calculated compound interest for a given principal, number of years, and annual interest rate.
    public static void main(String[] args) {
        System.out.println(calculateInterest(1000, 5, 0.05));
    }

    // Apply formula for compound interest: A = P(1 + r)^t
    private static double calculateInterest(int principal, int years, double annualRate) {
        double balance = principal;
        for (int year = 0; year < years; year++) {
            balance = balance + (balance * annualRate);
        }
        return balance - principal;
    }
}       