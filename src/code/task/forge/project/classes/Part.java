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

}
