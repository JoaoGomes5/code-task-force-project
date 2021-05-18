package code.task.forge.project.Models;

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
    private ArrayList<Address> addresses ;


    /**
     *contacto do cliente
     */
    private ArrayList<Contact> contacts;

    /**
     *Nota do cliente
     */
    private String annotation;

    /**
     *Método construtor vazio
     * 
     */

    public Client() {

    }


    public Client(String nif, String name, ArrayList<Address> addresses , ArrayList<Contact> contacts, String annotation){
        this.nif = nif;
        this.name = name;
        this.addresses  = addresses ;
        this.contacts = contacts;
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
    public ArrayList<Address> getAddresses () {
        return this.addresses ;
    }

    /**
     * define o array morada do cliente
     *
     * @param addresses  morada do cliente
     */
    public void setAddresses (ArrayList<Address> addresses) {
        this.addresses  = addresses ;
    }


    /**
     * devolve Array contacto
     *
     * @return contactos
     */
    public ArrayList<Contact> getContacts() {
        return this.contacts;
    }

    /**
     * define Array contactos
     *
     * @param contacts
     * @param contacts contactos
     */
    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
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
