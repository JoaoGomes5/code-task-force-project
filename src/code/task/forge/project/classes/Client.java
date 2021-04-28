package code.task.forge.project.classes;

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
    private String address;

    /**
     *Codigo postal do cliente
     */
    private String postalCode;

    /**
     *localidade do cliente
     */
    private String locality;

    /**
     *País do cliente
     */
    private String country;

    /**
     *contacto do cliente
     */
    private String contact;

    /**
     *observação do cliente
     */
    private String observation;
    /**
     *Nota do cliente
     */
    private String annotation;

    /**
     *Método construtor vazio
     */
    public Client() {

    }


    public Client(String nif, String name, String address, String postalCode, String locality,
                  String country, String contact, String observation, String annotation){
        this.nif = nif;
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.locality = locality;
        this.country = country;
        this.contact = contact;
        this.observation = observation;
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
     * devolve a morada do cliente
     *
     * @return devolve a morada
     */
    public String getAddress() {
        return address;
    }

    /**
     * define a morada do cliente
     *
     * @param address morada do cliente
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * devolve codigo postal
     *
     * @return codigo postal
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * define o codigo postal
     *
     * @param postalCode codigo postal
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * devolve a localidade
     *
     * @return localidade
     */
    public String getLocality() {
        return locality;
    }

    /**
     * define localidade
     *
     * @param locality localidade
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     * devolve o país
     *
     * @return país
     */
    public String getCountry() {
        return country;
    }

    /**
     * define o país
     *
     * @param country país
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * devolve contacto
     *
     * @return contacto
     */
    public String getContact() {
        return contact;
    }

    /**
     * define contacto
     *
     * @param contact contacto
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * devolve observação
     *
     * @return observação
     */
    public String getObservation() {
        return observation;
    }

    /**
     * define observação
     *
     * @param observation observação
     */
    public void setObservation(String observation) {
        this.observation = observation;
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
