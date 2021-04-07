package code.task.forge.project.classes;
import java.util.*;

public class Part {

    /**
     * Referencia
     */
    private String reference;

    /**
     * Designação
     */
    private String designation;

    /**
     * Designação comercial
     */
    private String commercialDesignation;

    /**
     * Quantidade Lote
     */
    private int batchSize;

    /**
     * Unidade
     */
    private String unit;

    /**
     * Versão
     */
    private String version;

    /**
     * Estado
     */
    private boolean status;

    /**
     * Operações
     */
    private ArrayList<Operation> operations;

    /**
     * Componentes
     */
    private ArrayList<Component> components;

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the commercialDesignation
     */
    public String getCommercialDesignation() {
        return commercialDesignation;
    }

    /**
     * @param commercialDesignation the commercialDesignation to set
     */
    public void setCommercialDesignation(String commercialDesignation) {
        this.commercialDesignation = commercialDesignation;
    }

    /**
     * @return the batchSize
     */
    public int getBatchSize() {
        return batchSize;
    }

    /**
     * @param batchSize the batchSize to set
     */
    public void setBatchSize(int batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the operations
     */
    public ArrayList<Operation> getOperations() {
        return operations;
    }

    /**
     * @param operations the operations to set
     */
    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }

    /**
     * @return the components
     */
    public ArrayList<Component> getComponents() {
        return components;
    }

    /**
     * @param components the components to set
     */
    public void setComponents(ArrayList<Component> components) {
        this.components = components;
    }

}
