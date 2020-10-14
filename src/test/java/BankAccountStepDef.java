import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class BankAccountStepDef {

    private Account account;
    private String errorMessage;

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

    @When("I try to deposit a negative amount in my account")
    public void iTryToDepositANegativeAmountInMyAccount() {
        errorMessage = Assertions.assertThrows(RuntimeException.class, () -> account.deposit(new Amount(-500.0))).getMessage();
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String arg0) {
        Assertions.assertEquals(errorMessage, this.errorMessage);
    }

    @When("I withdrawal an amount from my account")
    public void iWithdrawalAnAmountFromMyAccount() {
        account.withdrawal(new Amount(300.0));
    }

    @Then("My balance must decrease by the amount deposited")
    public void myBalanceMustDecreaseByTheAmountDeposited() {
        Assertions.assertEquals(700.0, account.getBalance());
    }

    @When("I try withdrawal a negative amount from my account")
    public void iTryWithdrawalANegativeAmountFromMyAccount() {
        errorMessage = Assertions.assertThrows(RuntimeException.class, () -> account.withdrawal(new Amount(-500.0))).getMessage();
    }


    @When("I try withdrawal an amount greater then my balance from my account")
    public void iTryWithdrawalAnAmountGreaterThenMyBalanceFromMyAccount() {
        errorMessage = Assertions.assertThrows(RuntimeException.class, () -> account.withdrawal(new Amount(1500.0))).getMessage();
    }
}
