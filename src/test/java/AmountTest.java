import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AmountTest {

    Amount amount;

    @Test
    public void should_have_five_hundred_in_current_amount_when_i_add_one_hundred_then_four_hundred() {
        amount = new Amount();
        amount.add(new Amount(100.0));
        amount.add(new Amount(400.0));
        Assertions.assertEquals(500, amount.getCurrentAmount());
    }

    @Test void should_have_tree_hundred_in_current_amount_when_i_have_an_account_with_balance_equal_to_five_hundred_and_withdrawal_two_hundred () {
        amount = new Amount(500);
        amount.subtract(new Amount(200));
        Assertions.assertEquals(300, amount.getCurrentAmount());
    }
}
