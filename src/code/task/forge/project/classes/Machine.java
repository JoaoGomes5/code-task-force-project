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
     * Código da máquina
     */
    private String code;
    
    /**
     * Nome da máquina
     */
    private String name;
    
    /**
     * Horário de trabalho da máquina
     */
    private int [] schedule = new int [7];
    
    /**
     * Estado da máquina (ligada/desligada)
     */
    private boolean state;
}
