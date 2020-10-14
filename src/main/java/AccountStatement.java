import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccountStatement {
    private final OperationType operationType;
    private final LocalDateTime operationDate;
    private final double amount;
    private final double balance;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public AccountStatement(OperationType operationType, LocalDateTime date, Double amount, Double balance){
        this.operationType = operationType;
        this.operationDate = date;
        this.amount = amount;
        this.balance = balance;
    }

    public String getOperationType() { return operationType.getOperationType(); }

    public String getDate() { return formatter.format(this.operationDate); }

    public Double getAmount() { return this.amount; }

    public Double getBalance() { return this.balance; }
}
