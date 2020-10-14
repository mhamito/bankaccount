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
}
