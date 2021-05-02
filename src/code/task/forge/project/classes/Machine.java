/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.classes;

/**
 *
 * @author Gustavo
 */
public class Machine {


    /**
     * Código da Máquina
     */
    private String code;
    
    /**
     * Nome da Máquina
     */
    private String name;
    
    /**
     * Horário de Trabalho da Máquina
     */
    private String [][] schedule = new String [2][5];
    
    /**
     * Estado da Máquina (ligada/desligada)
     */
    private boolean state;
    
    /**
     * Método construtor vazio
     */
    public Machine() {
}
      /**
     *
     * Método que permite criar uma Máquina
     *
     * @param code Código da Máquina
     * @param name Nome da Máquina
     * @param schedule Horário de Trabalho da Máquina
     * @param state Estado da Máquina (Ligada/Desligada)
     */
    
    public Machine(String code, String name, String [][] schedule, boolean state) {
        this.code = code;
        this.name = name;
        this.schedule = schedule;
        this.state = state;
    }

    private String printBoolean(){
        if(this.state==true){
            return "ativo";
        }else{
            return "inativo";
        }
    }

    private String printArray(){
        String print=null;
        for(int i=0;i<this.schedule.length;i++){
            print = print.concat("\nNa "+ this.schedule[i][i]+ "a máquina trabalhou "+ this.schedule[i+1][i] + " horas;");
        }
        return print;
    }

    @Override
    public String toString(){
        return "Esta Máquina tem o código "+getCode()+ "e o nome " + getName() + "e o seu estado é " + printBoolean() + "e o registo de horas de trabalho foi "+printArray();
    }
    
    /**
     * Método que permite obter o Código da Máquina
     * @return Retorna o Código da Máquina
     */
    public String getCode() {
        return code;
    }
    
    /**
     * Método que permite definir o Código da Máquina
     * @param code Código da Vacina
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * Método que permite obter o Nome da Máquina
     * @return Retorna o Nome da máquina
     */
    public String getName() {
        return name;
    }
    
    /**
     * Método que permite definir o Nome da Máquina
     * @param name Nome da Máquina
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método que permite obter o Horário de Trabalho da Máquina
     * @return Retorna o Horário de Trabalho da Máquina
     */
    public String[][] getSchedule() {
        return schedule;
    }

    /**
     * Método que permite definir o Horário de Trabalho da Máquina
     * @param schedule Horário de Trabalho da Máquina
     */
    
    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    /**
     * Método que permite obter o Estado da Máquina (Ligada/Desligada)
     * @return Retorna o Estado da Máquina (Ligada/Desligada) 
     */
    public boolean isState() {
        return state;
    }

    /**
     * Método que permite definir o Estado da Máquina (Ligada/Desligada)
     * @param state Retorna o Estado da Máquina (Ligada/Desligada)
     */
    public void setState(boolean state) {
        this.state = state;
    }
    
   

    
}

