public class SavingAccount extends Account{

private double interestRate;

    public SavingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public String getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public boolean withdraw(double amount) {
        return false;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
    }
}
