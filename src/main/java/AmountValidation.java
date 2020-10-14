public class AmountValidation {

    public static final String AMOUNT_INCORRECT_MESSAGE = "Your amount is incorrect";
    public static final String AMOUNT_GREATER_THEN_BALANCE_MESSAGE = "Your amount is greater then your balance";

    private static final AmountValidation amountValidation = new AmountValidation();

    public static AmountValidation getInstance() {
        return amountValidation;
    }

    /**
     * check if the amount that i want deposit or withdrawal from my account is negative
     * @param amount the amount that i want deposit in my account
     */
    public void checkIfAmountIsNegative(Amount amount) {
        if(amount.getCurrentAmount() <= 0) {
            throw new RuntimeException(AMOUNT_INCORRECT_MESSAGE);
        }
    }

    /**
     * check if the amount that i want deposit or withdrawal from my account is greater then my balance
     * @param balance the balance of my account
     * @param amount the amount that i want deposit or withdrawal from my account
     */
    public void checkIfBalanceIsSufficient (Amount balance, Amount amount) {
        if( balance.getCurrentAmount() < amount.getCurrentAmount() ) {
            throw new RuntimeException(AMOUNT_GREATER_THEN_BALANCE_MESSAGE);
        }
    }
}
