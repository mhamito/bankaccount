public class Main {

    public static void main(String[] arg) {

        Account account = new Account();
        PrintStatements printStatements = new PrintStatements();


        account.deposit(new Amount(1000));
        account.deposit(new Amount(2500));
        account.withdrawal(new Amount(1000.0));


        printStatements.print(account.getAccountStatements());
    }
}
