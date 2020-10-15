import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class BankAccountStepDef {

    private Account account;
    private Amount balance;
    private String errorMessage;

    @Before
    public void setUp() {
        Client client = new Client("client1", "Thomas", "Durand");
        account = new Account(client);
    }

    @Given("I deposit {float} euro in account")
    public void iDepositEuroInMyAccount(float depositAmount) {
        account.deposit(new Amount(depositAmount));
    }

    @When("I ask the account balance")
    public void iAskTheStatementBalance() {
        balance = account.getBalance();
    }

    @Then("My balance should be {float} euro")
    public void myBalanceShouldBeEuro(float expectedAmount) {
        Assertions.assertEquals(balance.getCurrentAmount(), expectedAmount);
    }

    @Given("I withdrawal {float} euro from account")
    public void iWithdrawalEuroFromAccountThatHaveEuro(float withdrawalAmount) {
        account.withdrawal(new Amount(withdrawalAmount));
    }

    @When("I try to deposit {float} euro in account")
    public void iTryToDepositEuroInAccount(float depositAmount) {
        errorMessage = Assertions.assertThrows(RuntimeException.class, () -> account.deposit(new Amount(depositAmount))).getMessage();
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String errorMessage) {
        Assertions.assertEquals(errorMessage, this.errorMessage);
    }

    @When("I try to withdrawal {float} euro from account")
    public void iTryToWithdrawalEuroFromAccount(float withdrawalAmount) {
        errorMessage = Assertions.assertThrows(RuntimeException.class, () -> account.withdrawal(new Amount(withdrawalAmount))).getMessage();
    }
}
