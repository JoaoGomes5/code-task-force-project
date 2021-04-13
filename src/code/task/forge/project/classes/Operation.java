
package code.task.forge.project.classes;

import java.util.*;


public class Operation {
   /**
    * Ordem
    */
    private int order;
    /**
     * Nome
     */
    private String name;
    /**
     * Máquina
     */
    private Machine machine;
    /**
     * Mão de obra
     */
    private int operatorsNeeded;
    /**
     * Tempo (em segundos)
     */
    private int executionTime;
    /**
     * Quantidade Hora
     */
    private int quantityPerHour;
    /**
     * Instruções técnicas
     */
    private String instructions;
    /**
     * Componentes
     */
    private ArrayList<Component> components;
    
    /**
     * Método construtor vazio
     */
    public Operation(){
        
    }
    
    
    /**
     * 
     * @param order Ordem   
     * @param name Nome
     * @param operatorsNeeded Mão de obra       
     * @param executionTime Tempo (em segundos)
     * @param quantityPerHour Quantidade Hora
     * @param instructions Instruções técnicas
     */
    public Operation(int order,String name, int operatorsNeeded, int executionTime,int quantityPerHour,String instructions){
        order=this.order;
        name=this.name;
        operatorsNeeded=this.operatorsNeeded;
        executionTime=this.executionTime;
        quantityPerHour=this.quantityPerHour;
        instructions=this.instructions;
        
    }

    /**
     *Método que premite obter a Ordem
     * @return Retorna a Ordem
     */
    public int getOrder() {
        return order;
    }

    /**
     *Método que premite definir a Ordem
     * @param order Ordem
     */
    public void setOrder(int order) {
        this.order = order;
    }

    /**
     Método que premite obter o nome
     * @return Retorna o nome
     */
    public String getName() {
        return name;
    }

    /**
     *Método que premite definir o nome
     * @param name Nome
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     Método que premite obter a mão de obra
     * @return Retorna a mão de obra
     */
    public int getOperatorsNeeded() {
        return operatorsNeeded;
    }

    /**
     *Método que premite definir a mão de obra
     * @param operatorsNeeded Mão de Obra
     */
    public void setOperatorsNeeded(int operatorsNeeded) {
        this.operatorsNeeded = operatorsNeeded;
    }

    /**
   Método que premite obter o Tempo(em segundos)
     * @return Retorna o Tempo(em segundos)
     */
    public int getExecutionTime() {
        return executionTime;
    }

    /**
     *Método que premite definir o Tempo(em segundos)
     * @param executionTime Tempo(em segundos)
     */
    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    /**
     Método que premite obter a quantidade hora
     * @return Retorna a qauntidade hora
     */
    public int getQuantityPerHour() {
        return quantityPerHour;
    }

    /**
    *Método que premite definir a quantidade hora
     * @param quantityPerHour Quantidade Hora
     */
    public void setQuantityPerHour(int quantityPerHour) {
        this.quantityPerHour = quantityPerHour;
    }

    /**
     Método que premite obter as instruções técnicas
     * @return Retorna as instruções técnicas
     */
    public String getInstructions() {
        return instructions;
    }

    /**
    *Método que premite definir as instruções técnicas
     * @param instructions Instruções técnicas
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    
}
