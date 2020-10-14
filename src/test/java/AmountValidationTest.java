import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AmountValidationTest {

    private static final String amountIncorrectMessage = AmountValidation.AMOUNT_INCORRECT_MESSAGE;
    private static final String amountGreaterThenBalanceMessage = AmountValidation.AMOUNT_GREATER_THEN_BALANCE_MESSAGE;
    AmountValidation amountValidation = AmountValidation.getInstance();

    @Test
    public void should_throw_exception_when_the_amount_is_negative() {
        String errorMessage = Assertions.assertThrows(RuntimeException.class, () -> amountValidation.checkIfAmountIsNegative(-200)).getMessage();
        Assertions.assertEquals(amountIncorrectMessage, errorMessage);
    }

    @Test
    public void should_throw_exception_when_the_amount_is_equal_to_zero() {
        String errorMessage = Assertions.assertThrows(RuntimeException.class, () -> amountValidation.checkIfAmountIsNegative(0)).getMessage();
        Assertions.assertEquals(amountIncorrectMessage, errorMessage);
    }

    @Test
    public void should_throw_exception_when_the_amount_is_greater_then_balance() {
        String errorMessage = Assertions.assertThrows(RuntimeException.class, () -> amountValidation.checkIfBalanceIsSufficient(300, 500)).getMessage();
        Assertions.assertEquals(amountGreaterThenBalanceMessage, errorMessage);
    }
}
