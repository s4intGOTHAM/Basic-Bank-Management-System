//This is the abstract class, from which other proceeding accounts possess
//similar properties etc

public abstract class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;


//Constructor
    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


//    Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


//    Methods
    public abstract void deposit(double amount);

    public abstract boolean withdraw(double amount);

    public void displayAccountInfo(){
        System.out.println("Bank Account no.: "+accountNumber+"\nHolder's Name:"+accountHolderName+"\nCurrent Balance: "+balance);
    }

}
