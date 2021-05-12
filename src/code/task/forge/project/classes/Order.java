package code.task.forge.project.classes;

import java.util.ArrayList;
import java.util.Date;

/**
 * Class Encomenda
 */
public class Order {

    /**
     *Nif do cliente
     */
    private String nif;

    /**
     *Morada de faturação
     */
    private String purchaseAddress;

    /**
     *Morada de entrega
     */
    private String deliveryAddress;

    /**
     *Nº de documento
     */
    private int documentNumber;

    /**
     *Data de documento
     */
    private Date date;

    /**
     *Estado da encomenda
     */
    private String state;

    /**
     *Desconto(em % e/ou valor)
     */
    private String descount;

    /**
     *Valor Total da encomenda
     */
    private int total;

    /**
     *Array do Horario
     */
    private ArrayList<Lines> lines;

    /**
     *Método construtor vazio
     */
    public Order() {

    }

    /**
     * Metodo que premite criar uma encomenda
     *
     * @param nif nif do cliente
     * @param purchaseAddress morada de faturação
     * @param deliveryAddress morada de entraga
     * @param documentNumber n de documento
     * @param date data de documentação
     * @param state estado de encomenda
     * @param descount desconto
     * @param total valor total
     * @param lines linhas
     */
    public Order(String nif, String purchaseAddress, String deliveryAddress, int documentNumber,
                 Date date, String state, String descount, int total, ArrayList<Lines> lines){
        this.nif = nif;
        this.purchaseAddress = purchaseAddress;
        this.deliveryAddress = deliveryAddress;
        this.documentNumber = documentNumber;
        this.date = date;
        this.state = state;
        this.descount = descount;
        this.total = total;
        this.lines = lines;
    }

    /**
     * Método que permite obter o Horario do Operador
     * @return Retorna o Horário de trabalho do operador
     */

    /**
     *Método que permite Definir o Horario do Operador
     * @param schedule Horario Do Operador
     */

    /**
     * Metodo que premite obter o Nif do cliente
     *
     * @return Retorna o nif do cliente
     */
    public String getNif() {
        return nif;
    }

    /**
     * Metodo que premite definir o nif do cliente
     *
     * @param nif Nif do cliente
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Metodo que premite obter a morada de faturação
     *
     * @return devolve a morada de faturação
     */
    public String getPurchaseAddress() {
        return purchaseAddress;
    }

    /**
     * Metodo que premite definir a morada de faturação
     *
     * @param purchaseAddress morada de faturação
     */
    public void setPurchaseAddress(String purchaseAddress) {
        this.purchaseAddress = purchaseAddress;
    }

    /**
     *Metodo que premite obter a morada de entrega
     *
     * @return devolve a morada de entrega
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     *Metodo que premite definir o nif do cliente
     *
     * @param deliveryAddress morada de entrega
     */
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    /**
     *Metodo que premite obter o numero de documentação
     *
     * @return devolve o numero de documentação
     */
    public int getDocumentNumber() {
        return documentNumber;
    }

    /**
     *Metodo que premite definir o numero de documento
     *
     * @param documentNumber
     */
    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    /**
     * Metodo que premite obter a data da encomenda
     *
     * @return devolve a data
     */
    public Date getDate() {
        return date;
    }

    /**
     *Metodo que premite definir a data
     *
     * @param date data
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *Metodo que premite obter o estado
     *
     * @return estado da encomenda
     */
    public String getState() {
        return state;
    }

    /**
     *Metodo que premite definir o estado
     *
     * @param state estado da encomenda
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *Metodo que premite obter o desconto
     *
     * @return devolve o desconto
     */
    public String getDescount() {
        return descount;
    }

    /**
     *Metodo que premite definir o desconto
     *
     * @param descount desconto
     */
    public void setDescount(String descount) {
        this.descount = descount;
    }

    /**
     *Metodo que premite obter o total
     *
     * @return devolve o total
     */
    public int getTotal() {
        return total;
    }

    /**
     *Metodo que premite definir o total
     *
     * @param total total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     *Metodo que premite obter as linhas
     *
     * @return devolve as linhas
     */
    public ArrayList<Lines> getLines() {
        return lines;
    }

    /**
     *Metodo que premite definir as linhas
     *
     * @param lines linhas
     */
    public void setLines(ArrayList<Lines> lines) {
        this.lines = lines;
    }
}
