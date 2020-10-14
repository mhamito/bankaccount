import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;

public class PrintStatements {

    public PrintStatements(){}

    public void print(Account account) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("account statement of " + account.getClient().getFirstName() + " " + account.getClient().getLastName());
        System.out.println("Operation |  Date of operation  |  Amount  |  Balance  |");
        List<AccountStatement> accountStatements = account.getAccountStatements();
        Collections.reverse(accountStatements);
        accountStatements.forEach(accountStatement -> {
            System.out.println(accountStatement.getOperationType() + " | " + accountStatement.getDate() + " | " + decimalFormat.format(Double.valueOf(accountStatement.getAmount().toString())) + " € | " + decimalFormat.format(Double.valueOf(accountStatement.getBalance().toString())) + " €");
        });
    }
}
