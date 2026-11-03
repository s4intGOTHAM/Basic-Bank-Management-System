package bank.utilities;

//Generic type-agnostic class
public class TransactionLogger <T>{

   private T logEntry;

    public TransactionLogger(T logEntry) {
        this.logEntry = logEntry;
    }

    public T getLogEntry() {
        return logEntry;
    }

    public void setLogEntry(T logEntry) {
        this.logEntry = logEntry;
    }

    public <T> void  printLog(){
        IO.println("--- LOG ENTRY ---");
        IO.println(logEntry);

    }
}
