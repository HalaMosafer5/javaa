public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        System.out.println("Account 1 - Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Account 1 - Savings Balance: " + account1.getSavingsBalance());
        System.out.println("Account 1 - Account Number: " + account1.getAccountNumber());
        
        System.out.println("Account 2 - Checking Balance: " + account2.getCheckingBalance());
        System.out.println("Account 2 - Savings Balance: " + account2.getSavingsBalance());
        System.out.println("Account 2 - Account Number: " + account2.getAccountNumber());

        account1.deposit(500, "checking");
        account1.deposit(300, "savings");

        account2.deposit(1000, "checking");
        account2.deposit(1500, "savings");

        System.out.println("Account 1 - Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Account 1 - Savings Balance: " + account1.getSavingsBalance());
        System.out.println("Account 1 - Total Balance: " + account1.getTotalBalance());
        
        System.out.println("Account 2 - Checking Balance: " + account2.getCheckingBalance());
        System.out.println("Account 2 - Savings Balance: " + account2.getSavingsBalance());
        System.out.println("Account 2 - Total Balance: " + account2.getTotalBalance());

        account1.withdraw(200, "checking");
        account1.withdraw(400, "savings");

        account2.withdraw(1200, "checking");
        account2.withdraw(500, "savings");

        System.out.println("Account 1 - Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Account 1 - Savings Balance: " + account1.getSavingsBalance());
        System.out.println("Account 1 - Total Balance: " + account1.getTotalBalance());
        
        System.out.println("Account 2 - Checking Balance: " + account2.getCheckingBalance());
        System.out.println("Account 2 - Savings Balance: " + account2.getSavingsBalance());
        System.out.println("Account 2 - Total Balance: " + account2.getTotalBalance());

        System.out.println("Total Number of Accounts: " + BankAccount.getNumberOfAccounts());
        System.out.println("Total Money in All Accounts: " + BankAccount.getTotalMoney());
    }
}