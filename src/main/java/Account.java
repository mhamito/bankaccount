import java.time.LocalDateTime;
import java.util.ArrayList;

public class Account {

    private Amount balance;

    public Account() {
        this.balance = new Amount();
    }

    /**
     * deposit an amount in my account
     * @param amount the amount that i want deposit
     */
    public void deposit(Amount amount) {
        this.balance.depositAmount(amount);
    }

    public Double getBalance() {
        return this.balance.getBalance();
    }
}
