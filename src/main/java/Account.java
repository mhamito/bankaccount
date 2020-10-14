import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private final Client client;
    private final List<AccountStatement> accountStatements;
    private final Amount balance;
    private final AmountValidation amountValidation = AmountValidation.getInstance();

    public Account(Client client) {
        this.client = client;
        this.accountStatements = new ArrayList<>();
        this.balance = new Amount();
    }

    /**
     * deposit an amount in my account
     * @param amount the amount that i want deposit
     */
    public void deposit(Amount amount) {
        amountValidation.checkIfAmountIsNegative(amount.getCurrentAmount());
        OperationType operationType = OperationType.DEPOSIT;
        this.balance.add(amount);
        accountStatements.add(new AccountStatement(operationType, LocalDateTime.now(), amount.getCurrentAmount(), this.balance.getCurrentAmount()));
    }

    /**
     * withdrawal an amount from my account
     * @param amount the amount that i want withdrawal
     */
    public void withdrawal(Amount amount) {
        amountValidation.checkIfAmountIsNegative(amount.getCurrentAmount());
        amountValidation.checkIfBalanceIsSufficient(balance.getCurrentAmount(), amount.getCurrentAmount());
        OperationType operationType = OperationType.WITHDRAWAL;
        this.balance.subtract(amount);
        accountStatements.add(new AccountStatement(operationType, LocalDateTime.now(), amount.getCurrentAmount(), this.balance.getCurrentAmount()));
    }

    public Double getBalance() {
        return this.balance.getCurrentAmount() ;
    }

    public List<AccountStatement> getAccountStatements() { return this.accountStatements; }

    public Client getClient() { return this.client; }
}
