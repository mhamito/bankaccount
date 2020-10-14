import java.time.LocalDateTime;
import java.util.ArrayList;

public class Account {

    private Amount balance;
    private final AmountValidation amountValidation = AmountValidation.getInstance();

    public Account() {
        this.balance = new Amount();
    }

    /**
     * deposit an amount in my account
     * @param amount the amount that i want deposit
     */
    public void deposit(Amount amount) {
        amountValidation.checkIfAmountIsNegativeOrNull(amount);
        this.balance.add(amount);
    }

    public Double getBalance() {
        return this.balance.getCurrentAmount() ;
    }
}
