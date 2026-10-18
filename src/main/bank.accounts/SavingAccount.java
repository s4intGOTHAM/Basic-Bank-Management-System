public class SavingAccount extends Account{

private double interestRate;


//Constructor//
    public SavingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;

    }


//Methods//
    @Override
    public void deposit(double amount) {
if(amount < 0 ){
 System.out.println("Fatal error: Enter a valid amount");
 return;
}
//Logic for adding amount deposited to the balance via setter and getter
setBalance(getBalance()+amount);
System.out.println("Transaction successful!");
System.out.println("Amount deposited: "+getBalance()+"ksh");
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > getBalance() || amount == 0){
        System.out.println("Fatal Error: Insufficient Funds for the Transaction");
        return false;
        }
        setBalance(getBalance()-amount);
        System.out.println("Successfully withdrew "+amount+"ksh");
        return true;
    }

}
