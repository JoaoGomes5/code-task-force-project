package code.task.forge.project.Models;
import java.util.*;

public class Part extends Article {

   

    /**
     * Designação
     */
    private String designation;

    

    /**
     * Quantidade Lote
     */
    private int batchSize;

    /**
     * Unidade
     */
    private String unit;

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
     * @param designation designação
     * @param batchSize quantidade Lote
     * @param unit unidade
     * @param status estado
     * @param operations operações
     *
     */
    public Part(
            String reference,
            String commercialDesignation,
            String version,
            String designation,
            int batchSize,
            String unit,
            boolean status,
            ArrayList<Operation> operations
    ) {
        super(reference, commercialDesignation, version);
        this.designation = designation;
        this.batchSize = batchSize;
        this.unit = unit;
        this.status = status;
        this.operations = operations;
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
