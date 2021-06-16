package code.task.forge.project.Models;

/**
 * Class Operador
 */
public class Operator {

    /**
     *Codigo do operador
     */
    private String code;

    /**
     *Nome do operador
     */
    private String name;

    /**
     *Array do Horario
     */
    private String[][] schedule = new String [4][5];

    /**
     *Estado do operador Ativo ou Inativo
     */
    private boolean state;

    /**
     *Método construtor vazio
     */
    public Operator() {

    }

    /**
     * Método que premite criar um operador
     *
     * @param code código do Operador
     * @param name Nome do Operador
     * @param schedule Horario de trabalho do operador
     * @param state Estado do Operador (Ativo/Inativo)
     */
    public Operator(String code, String name, String[][] schedule, boolean state){
        this.code = code;
        this.name = name;
        this.schedule = schedule;
        this.state = state;
    }

    /**
     *Método que permite obter o Código do Operador
     * @return Retorna o código do operador
     */
    public String getCode() {
        return code;
    }

    /**
     *Método que permite definir o Código do Operador
     * @param code codigo do operador
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *Método que permite obter o Nome do Operador
     * @return Retorna o nome do operador
     */
    public String getName() {
        return name;
    }

    /**
     *Método que permite Definir o Nome do Operador
     * @param name Nome do Operador
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método que permite obter o Horario do Operador
     * @return Retorna o Horário de trabalho do operador
     */
    public String[][] getSchedule() {
        return schedule;
    }

    /**
     *Método que permite Definir o Horario do Operador
     * @param schedule Horario Do Operador
     */
    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    /**
     *Método que permite obter o estado do Operador
     * @return Retorna o estado do operador
     */
    public boolean isState() {
        return state;
    }

    /**
     *Método que permite Definir o estado do Operador
     * @param state Estado do operador (Ativo/Inativo)
     */
    public void setState(boolean state) {
        this.state = state;
    }
}
