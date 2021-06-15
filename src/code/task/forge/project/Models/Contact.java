package code.task.forge.project.Models;


public class Contact {

    /**
     * contacto
     */
    private String contact;

    /**
     * tipo de contacto (email, telefone, telemovel, ect...)
     */
    private String contactType;

    /**
     * observações
     */
    private String observation;


     private String importanceType;


    /**
     * Contrutor de contacto
     *
     * @param contact contacto
     * @param contactType tipo de contacto
     * @param observation observações
     * @param importanceType 
     */
    public Contact(String contact, String contactType, String observation, String importanceType){

        this.contact = contact;
        this.contactType = contactType;
        this.observation = observation;
        this.importanceType = importanceType;
    }

    /**
     * devolve um contacto
     *
     * @return contacto
     */
    public String getContact() {
        return contact;
    }

    /**
     * define um contacto
     *
     * @param contact contacto
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * devolve um tipo de contacto
     *
     * @return tipo de contacto
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * define um tipo de contacto
     *
     * @param contactType tipo de contacto
     */
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    /**
     * devolve uma observação
     *
     * @return observação
     */
    public String getObservation() {
        return observation;
    }

    /**
     * define uma nova observação
     *
     * @param observation observações
     */
    public void setObservation(String observation) {
        this.observation = observation;
    }

     /**
     * devolve uma observação
     *
     * @return observação
     */
    public String getImportanceType() {
        return observation;
    }

    /**
     * define uma nova observação
     *
     * @param observation observações
     */
    public void setObservation(String observation) {
        this.observation = observation;
    }
}
