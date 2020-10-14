import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class BankAccountStepDef {

    private Account account;

    @Given("I have some money in my account")
    public void iHaveSomeMoneyInMyAccount() {
        account = new Account();
        account.deposit(new Amount(1000.0));
    }

    @When("I deposit an amount in my account")
    public void iDepositAnAmountInMyAccount() {
        account.deposit(new Amount(500.0));
    }

    @Then("My balance must increase by the amount deposited")
    public void myBalanceMustIncreaseByTheAmountDeposited() {
        Assertions.assertEquals(1500.00, account.getBalance());
    }
}
