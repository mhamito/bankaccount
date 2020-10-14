public enum OperationType {
    DEPOSIT("depot"), WITHDRAWAL("retrait");

    private final String operationType;

    OperationType(String operationType) { this.operationType = operationType; }

    public String getOperationType() { return this.operationType; }
}
