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
     * Método construtor vazio
     */
    public Part() {

    }

    /**
     * Método construtor que permite criar uma peça
     *
     * @param reference referencia
     * @param designation designação
     * @param commercialDesignation designação comercial
     * @param batchSize quantidade Lote
     * @param unit unidade
     * @param version versão
     * @param status estado
     * @param operations operações
     *
     */
    public Part(
            String reference,
            String designation,
            String commercialDesignation,
            int batchSize,
            String unit,
            String version,
            boolean status,
            ArrayList<Operation> operations,

    ) {

        this.reference = reference;
        this.designation = designation;
        this.commercialDesignation = commercialDesignation;
        this.batchSize = batchSize;
        this.unit = unit;
        this.version = version;
        this.status = status;
        this.operations = operations;
    }







    /**
     * Método que premite obter a referência
     * @return Retorna a referência
     */
    public String getReference() {
        return reference;
    }

    /**
     * Método que premite definir a referência
     * @param reference Referência
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Método que premite obter a designação
     * @return Retorna a designação
     */
    public String getDesignation() {
        return designation;
    }

    /**
     *  Método que premite definir a designação
     * @param designation Designação
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * Método que premite obter a designação comercial
     * @return Retorna a designação comercial
     */
    public String getCommercialDesignation() {
        return commercialDesignation;
    }

    /**
     * Método que premite definir a designação comercial
     * @param commercialDesignation Designação comercial
     */
    public void setCommercialDesignation(String commercialDesignation) {
        this.commercialDesignation = commercialDesignation;
    }

    /**
     * Método que premite obter a quantidade lote
     * @return Retorna a quantidade lote
     */
    public int getBatchSize() {
        return batchSize;
    }

    /**
     * Método que premite definir a quantidade lote
     * @param batchSize the batchSize to set
     */
    public void setBatchSize(int batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * Método que premite obter a unidade
     * @return Retorna a unidade
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Método que premite definir a unidade
     * @param unit unidade
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Método que premite obter a versão
     * @return Retorna a versão
     */
    public String getVersion() {
        return version;
    }

    /**
     * Método que premite definir a versão
     * @param version versão
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Método que premite obter o estado
     * @return Retorna o estado
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Método que premite definir o estado
     * @param status Estado
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Método que premite obter as operacões
     * @return Retorna as operações
     */
    public ArrayList<Operation> getOperations() {
        return operations;
    }

    /**
     * Método que premite definir as operações
     * @param operations Operações
     */
    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }



}
