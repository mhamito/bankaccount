public class AmountValidation {

    private static final String AMOUNT_INCORRECT_MESSAGE = "Your amount is incorrect";
    private static final String AMOUNT_GREATER_THEN_BALANCE_MESSAGE = "Your amount is greater then your balance";

    private static final AmountValidation amountValidation = new AmountValidation();
    public static AmountValidation getInstance() {
        return amountValidation;
    }

    /**
     * check if the amount that i want deposit in my account is negative
     * @param money the amount that i want deposit in my account
     */
    public void checkIfAmountIsNegative(double money) {
        if(money < 0) {
            throw new RuntimeException(AMOUNT_INCORRECT_MESSAGE);
        }
    }

    /**
     * check if the amount that i want withdrawal from my account is greater then my balance
     * @param currentAmount the balance of my account
     * @param money the amount that i want deposit or withdrawal from my account
     */
    public void checkIfBalanceIsSufficient (double currentAmount, double money) {
        if( currentAmount < money ) {
            throw new RuntimeException(AMOUNT_GREATER_THEN_BALANCE_MESSAGE);
        }
    }
}
