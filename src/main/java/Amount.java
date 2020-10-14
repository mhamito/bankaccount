public class Amount {

    private double currentAmount;

    public Amount() {
        this.currentAmount = 0.0;
    }

    public Amount(double money) {
        this.currentAmount = money;
    }

    public void add(Amount amount) { this.currentAmount += amount.getCurrentAmount(); }

    public void subtract(Amount amount) { this.currentAmount -= amount.getCurrentAmount(); }

    public Double getCurrentAmount() { return this.currentAmount; }

    public String toString() {
        return String.valueOf(this.currentAmount);
    }
}
