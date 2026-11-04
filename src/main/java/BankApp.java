import bank.accounts.CurrentAccount;
import bank.accounts.SavingAccount;

public class BankApp {
    static void main() {
//Instantiating a current account
        bank.accounts.CurrentAccount currentAcc1 = new bank.accounts.CurrentAccount("101", "James Mwangi", 0.0, 500.0);

//
        CurrentAccount c1 = new CurrentAccount("101", "James Chepkwony", 0.0, 5000);
        c1.withdraw(345);
        c1.displayAccountInfo();
        c1.generateAuditTrail();
        IO.println(c1.generateAuditTrail()
        );


        //        Creating a new savings account
        SavingAccount savingsAcc1 = new SavingAccount("102", "Mary Cheptoo", 0.0);
        savingsAcc1.deposit(200000);
        savingsAcc1.generateAuditTrail();
        IO.println(savingsAcc1.generateAuditTrail());


    }

}
