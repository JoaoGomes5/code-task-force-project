package code.task.forge.project.Models;

public class ManufacturingOrder {

    private String reference;

    private Operation operation;


    public ManufacturingOrder(String reference, Operation operation) {
        this.reference = reference;
        this.operation = operation;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
