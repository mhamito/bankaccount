public class Main {

    public static void main(String[] arg) {

        PrintStatements printStatements = new PrintStatements();
        Client lionel = new Client("id1", "lionel", "morce");
        Account accountLionel = new Account(lionel);

        Client sarah = new Client("id2", "sarah", "lorce");
        Account accountSarah = new Account(sarah);

        accountLionel.deposit(new Amount(1000));
        accountLionel.deposit(new Amount(2500));
        accountLionel.withdrawal(new Amount(1000));

        accountSarah.deposit(new Amount(400));
        accountSarah.deposit(new Amount(4000));
        accountSarah.withdrawal(new Amount(1200));
        accountSarah.withdrawal(new Amount(400));


        printStatements.print(accountLionel);
        printStatements.print(accountSarah);
    }
}
