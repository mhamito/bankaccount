public class Amount {

    private Double currentAmount = 0.0;

    public Amount() {}

    public Amount(Double money) {
        this.currentAmount = money;
    }

    public void depositAmount(Amount amount) { this.currentAmount += amount.getBalance(); }

    public Double getBalance() { return this.currentAmount; }
}
