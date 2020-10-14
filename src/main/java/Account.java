import java.time.LocalDateTime;
import java.util.ArrayList;

public class Account {

    private Double balance = 0.0;

    public Account() {
    }

    /**
     * deposit an amount in my account
     * @param amount the amount that i want deposit
     */
    public void deposit(Double amount) {
        this.balance += amount;
    }

    public Double getBalance() {
        return this.balance;
    }
}
