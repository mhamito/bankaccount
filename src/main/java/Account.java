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
        amountValidation.checkIfAmountIsNegative(amount);
        this.balance.add(amount);
    }

    /**
     * withdrawal an amount from my account
     * @param amount the amount that i want withdrawal
     */
    public void withdrawal(Amount amount) {
        amountValidation.checkIfAmountIsNegative(amount);
        this.balance.subtract(amount);
    }

    public Double getBalance() {
        return this.balance.getCurrentAmount() ;
    }
}
