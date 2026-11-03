public class BankApp {
    static void main() {
//Instanciating a current account
    bank.accounts.CurrentAccount currentAcc1 = new bank.accounts.CurrentAccount("101", "James Mwangi", 0.0, 500.0);

//        Depositing an amount
        currentAcc1.deposit(1000);

        //    Withdrawing some amount
currentAcc1.withdraw(500);

currentAcc1.withdraw(1000);
currentAcc1.displayAccountInfo();
        currentAcc1.withdraw(200);



    }

}
