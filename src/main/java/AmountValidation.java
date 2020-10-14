public class AmountValidation {

    private static final AmountValidation amountValidation = new AmountValidation();
    private static final String AMOUNT_INCORRECT_MESSAGE = "Your amount is incorrect";

    public static AmountValidation getInstance() {
        return amountValidation;
    }

    /**
     * check if the amount that i want deposit in my account is negative
     * @param amount the amount that i want deposit in my account
     */
    public void checkIfAmountIsNegative(Amount amount) {
        if(amount.getCurrentAmount() < 0) {
            throw new RuntimeException(AMOUNT_INCORRECT_MESSAGE);
        }
    }
}
