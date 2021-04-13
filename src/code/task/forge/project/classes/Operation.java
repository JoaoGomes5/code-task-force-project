
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
     * @param machine Máquina,
     * @param operatorsNeeded Mão de obra       
     * @param executionTime Tempo (em segundos)
     * @param quantityPerHour Quantidade Hora
     * @param instructions Instruções técnicas
     * @param components Componentes
     */
    public Operation(int order,String name,Machine machine, int operatorsNeeded, int executionTime,int quantityPerHour,String instructions, ArrayList<Component> components){
        this.order=order;
        this.name=name;
        this.machine=machine;
        this.operatorsNeeded=operatorsNeeded;
        this.executionTime=executionTime;
        this.quantityPerHour=quantityPerHour;
        this.instructions=instructions;
        this.components=components;
        
    }

    /**
     * Método que permite obter a Ordem
     * @return Retorna a Ordem
     */
    public int getOrder() {
        return order;
    }

    /**
     * Método que permite definir a Ordem
     * @param order Ordem
     */
    public void setOrder(int order) {
        this.order = order;
    }

    /**
     * Método que permite obter o nome
     * @return Retorna o nome
     */
    public String getName() {
        return name;
    }

    /**
     *Método que permite definir o nome
     * @param name Nome
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método que permite obter a máquina
     * @return Retorna a máquina
     */
    public Machine getMachine() {
        return machine;
    }

    /**
     *Método que permite definir a máquina
     * @param machine Máquina
     */
    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    /**
     Método que permite obter a mão de obra
     * @return Retorna a mão de obra
     */
    public int getOperatorsNeeded() {
        return operatorsNeeded;
    }

    /**
     *Método que permite definir a mão de obra
     * @param operatorsNeeded Mão de Obra
     */
    public void setOperatorsNeeded(int operatorsNeeded) {
        this.operatorsNeeded = operatorsNeeded;
    }

    /**
   Método que permite obter o Tempo(em segundos)
     * @return Retorna o Tempo(em segundos)
     */
    public int getExecutionTime() {
        return executionTime;
    }

    /**
     *Método que permite definir o Tempo(em segundos)
     * @param executionTime Tempo(em segundos)
     */
    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    /**
     Método que permite obter a quantidade hora
     * @return Retorna a qauntidade hora
     */
    public int getQuantityPerHour() {
        return quantityPerHour;
    }

    /**
    *Método que permite definir a quantidade hora
     * @param quantityPerHour Quantidade Hora
     */
    public void setQuantityPerHour(int quantityPerHour) {
        this.quantityPerHour = quantityPerHour;
    }

    /**
     Método que permite obter as instruções técnicas
     * @return Retorna as instruções técnicas
     */
    public String getInstructions() {
        return instructions;
    }

    /**
    *Método que permite definir as instruções técnicas
     * @param instructions Instruções técnicas
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }



    /**
     Método que permite obter os componentes
     * @return Retorna os componentes
     */
    public ArrayList<Component> getComponents() {
        return components;
    }

    /**
     *Método que permite definir os componentes
     * @param components Componentes
     */
    public void setComponents(ArrayList<Component> components) {
        this.components = components;
    }
}
