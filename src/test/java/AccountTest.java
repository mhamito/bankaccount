import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    private Account account;
    private static String amountIncorrectMessage = AmountValidation.AMOUNT_INCORRECT_MESSAGE;
    private static String amountGreaterThenBalanceMessage = AmountValidation.AMOUNT_GREATER_THEN_BALANCE_MESSAGE;

    @Test
    public void should_have_five_hundred_in_my_amount_when_deposit_three_hundred_and_two_hundred() {
        account = new Account();
        account.deposit(new Amount(300.0));
        account.deposit(new Amount(200.0));
        Assertions.assertEquals(500.0, account.getBalance());
    }

    @Test
    public void should_throw_exception_when_deposit_negative_amount(){
        account = new Account();
        String errorMessage = Assertions.assertThrows(RuntimeException.class, () -> account.deposit(new Amount(-300.0))).getMessage();
        Assertions.assertEquals(amountIncorrectMessage, errorMessage);
    }

    @Test
    public void should_have_one_thousand_when_deposit_tow_thousand_and_withdrawal_four_hundred_then_six_hundred() {
        account = new Account();
        account.deposit(new Amount(2000.0));
        account.withdrawal(new Amount(400.0));
        account.withdrawal(new Amount(600.0));
        Assertions.assertEquals(1000.00, account.getBalance());
    }

    @Test
    public void should_throw_exception_when_withdrawal_negative_amount(){
        account = new Account();
        String errorMessage = Assertions.assertThrows(RuntimeException.class, () -> account.withdrawal(new Amount(-300.0))).getMessage();
        Assertions.assertEquals(amountIncorrectMessage, errorMessage);
    }

    @Test
    public void should_throw_exception_when_deposit_tow_hundred_and_withdrawal_three_hundred(){
        account = new Account();
        account.deposit(new Amount(200.0));
        String errorMessage = Assertions.assertThrows(RuntimeException.class, () -> account.withdrawal(new Amount(300.0))).getMessage();
        Assertions.assertEquals(amountGreaterThenBalanceMessage, errorMessage);
    }

    @Test
    public void should_throw_exception_when_deposit_an_amount_with_sum_equal_to_zero(){
        account = new Account();
        String errorMessage = Assertions.assertThrows(RuntimeException.class, () -> account.deposit(new Amount(0.0))).getMessage();
        Assertions.assertEquals(amountIncorrectMessage, errorMessage);
    }

    @Test
    public void should_throw_exception_when_withdrawal_an_amount_with_sum_equal_to_zero(){
        account = new Account();
        String errorMessage = Assertions.assertThrows(RuntimeException.class, () -> account.withdrawal(new Amount(0.0))).getMessage();
        Assertions.assertEquals(amountIncorrectMessage, errorMessage);
    }

    @Test
    public void should_save_all_account_statements () {
        account = new Account();
        account.deposit(new Amount(4000.0));
        account.withdrawal(new Amount(1200.0));
        account.deposit(new Amount(400.0));
        account.withdrawal(new Amount(500.0));

        Assertions.assertEquals(account.getAccountStatements().size(), 4);
        Assertions.assertEquals(account.getAccountStatements().get(0).getBalance(), 4000.00);
        Assertions.assertEquals(account.getAccountStatements().get(1).getBalance(), 2800.00);
        Assertions.assertEquals(account.getAccountStatements().get(2).getBalance(), 3200.00);
        Assertions.assertEquals(account.getAccountStatements().get(3).getBalance(), 2700.00);
    }

}
