public class CurrentAccount extends Account {

    private double overdraftLimit;

    //  Constructor  //
    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }


    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Fatal error: Enter a valid amount");
            return;
        }
//Logic for adding amount deposited to the balance via setter and getter
        setBalance(getBalance() + amount);
        System.out.println("Transaction successful!");
        System.out.println("Amount deposited: " + getBalance() + "ksh");

    }

    @Override
    public boolean withdraw(double amount) {
        if (amount < 0) {
            IO.println("Fatal error: Amount must be a valid number!");

            return false;
        }

        if (amount > (getBalance() + overdraftLimit)) {
            IO.println("Fatal Error: Insufficient funds to complete the transaction");
            return false;
        }
        setBalance(getBalance() - amount);
        IO.println("Successfully withdrew " + amount + "ksh");
        return true;
    }


}



