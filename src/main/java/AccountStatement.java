import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccountStatement {
    private final OperationType operationType;
    private final LocalDateTime operationDate;
    private final Amount amount;
    private final Amount balance;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public AccountStatement(OperationType operationType, LocalDateTime date, Amount amount, Amount balance){
        this.operationType = operationType;
        this.operationDate = date;
        this.amount = amount;
        this.balance = balance;
    }

    public String getOperationType() { return operationType.getOperationType(); }

    public String getDate() { return formatter.format(this.operationDate); }

    public Amount getAmount() { return this.amount; }

    public Amount getBalance() { return this.balance; }
}
