import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;

public class PrintStatements {

    public PrintStatements(){}

    public void print(Client client, List<AccountStatement> accountStatements) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("account statement of " + client.getFirstName() + " " + client.getLastName());
        System.out.println("Operation |  Date of operation  |  Amount  |  Balance  |");
        Collections.reverse(accountStatements);
        accountStatements.forEach(accountStatement -> {
            System.out.println(accountStatement.getOperationType() + " | " + accountStatement.getDate() + " | " + decimalFormat.format(accountStatement.getAmount().getCurrentAmount()) + " € | " + decimalFormat.format(accountStatement.getBalance().getCurrentAmount()) + " €");
        });
    }
}
