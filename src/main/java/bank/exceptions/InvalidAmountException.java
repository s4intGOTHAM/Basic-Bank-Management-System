package bank.exceptions;

public class InvalidAmountException extends Exception {
    String message = "Error! Invalid amount entered";
    public InvalidAmountException (String message) {
        super(message);
    }
}
