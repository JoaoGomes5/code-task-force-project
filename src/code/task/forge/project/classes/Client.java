package code.task.forge.project.classes;

import java.util.ArrayList;

/**
 * Class Cliente
 */
public class Client{

    /**
     *NIF do cliente
     */
    private String nif;

    /**
     *Nome do cliente
     */
    private String name;

    /**
     *morada do cliente
     */
    private ArrayList<Address> address;


    /**
     *contacto do cliente
     */
    private ArrayList<Contact> contact;

    /**
     *Nota do cliente
     */
    private String annotation;

    /**
     *Método construtor vazio
     */
    public Client() {

    }


    public Client(String nif, String name, ArrayList<Address> address, ArrayList <Contact> contact, String annotation){
        this.nif = nif;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.contact = contact;
        this.annotation = annotation;
    }
    

    /**
     * Devolve o nif do cliente
     *
     * @return nif do cliente
     */
    public String getNif() {
        return nif;
    }

    /**
     * define o nif do cliente
     *
     * @param nif nif do cliente
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * devolve nome do cliente
     *
     * @return nome do cliente
     */
    public String getName() {
        return name;
    }

    /**
     * define o nome do cliente
     *
     * @param name nome do cliente
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * devolve o array morada do cliente
     *
     * @return devolve a morada
     */
    public ArrayList<Address> getAddress() {
        return this.address;
    }

    /**
     * define o array morada do cliente
     *
     * @param address morada do cliente
     */
    public void setAddress(ArrayList address) {
        this.address = address;
    }


    /**
     * devolve Array contacto
     *
     * @return contacto
     */
    public ArrayList<Contact> getPostalCode() {
        return this.contact;
    }

    /**
     * define Array contacto
     *
     * @param contact contacto
     */
    public void setContact(ArrayList contact) {
        this.contact = contact;
    }

    /**
     * devolve nota de cliente
     *
     * @return nota de cliente
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * define nota de cliente
     *
     * @param annotation nota de cliente
     */
    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }
}
