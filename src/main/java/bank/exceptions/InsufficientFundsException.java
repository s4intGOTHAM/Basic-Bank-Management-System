package bank.exceptions;

public  class InsufficientFundsException extends RuntimeException{

    String message = "Error! You have insufficient funds to complete this transaction";
    public InsufficientFundsException (String message) {
        super(message);
    }
}
