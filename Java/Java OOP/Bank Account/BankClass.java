import java.util.Random;

public class BankClass {

    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;

    private static int numberOfAccounts = 0;
    private static double totalMoney = 0;

    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = generateAccountNumber();
        numberOfAccounts++;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        } else {
            System.out.println("Invalid account type.");
            return;
        }
        totalMoney += amount;
    }

    public void withdraw(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in savings account.");
            }
        } else {
            System.out.println("Invalid account type.");
        }
    }

    public double getTotalBalance() {
        return checkingBalance + savingsBalance;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

        private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNumber.append(random.nextInt(10));
        }
        return accountNumber.toString();
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}