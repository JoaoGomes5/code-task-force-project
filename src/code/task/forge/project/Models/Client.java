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
    private Contact mainContact;

    /**
     *contacto do cliente
     */
    private ArrayList<Contact> secondaryContacts;

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


    public Client(String nif, String name, ArrayList<Address> addresses, Contact contact, ArrayList<Contact> contacts, String annotation) {
        this.nif = nif;
        this.name = name;
        this.addresses = addresses;
        this.mainContact = contact;
        this.secondaryContacts= contacts;
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
     * devolve o contacto principal
     *
     * @return contactos
     */
    public Contact getMainContact() {
        return mainContact;
    }

    /**
     * define o contacto principal
     *
     * @param contact
     * @param contact mainContact
     */
    public void setMainContact(Contact contact) {
        this.mainContact = contact;
    }


    public ArrayList<Contact> getSecondaryContacts() {
        return secondaryContacts;
    }

    /**
     * define o contacto principal
     *
     * @param contacts
     * @param
     */
    public void setSecondaryContacts(ArrayList<Contact> contacts) {
        this.secondaryContacts = contacts;
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
