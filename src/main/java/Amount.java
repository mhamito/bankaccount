public class Amount {

    private Double currentAmount;

    public Amount() {
        this.currentAmount = 0.0;
    }

    public Amount(Double money) {
        this.currentAmount = money;
    }

    public void add(Amount amount) { this.currentAmount += amount.getCurrentAmount(); }

    public Double getCurrentAmount() { return this.currentAmount; }
}
