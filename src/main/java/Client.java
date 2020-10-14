public class Client {

    private final String idClient;
    private final String firstName;
    private final String lastName;

    public Client(String idClient, String firstName, String lastName) {
        this.idClient = idClient;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return this.firstName; }

    public String getLastName() { return this.lastName; }
}
