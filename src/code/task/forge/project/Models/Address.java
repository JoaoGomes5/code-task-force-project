package code.task.forge.project.Models;


public class Address {

    /**
     * morada
     */
    private String address;




    /**
     * codigo postal
     */
    private String postalCode;
    /**
     * localidade
     */
    private String locality;

    /**
     * país
     */
    private String country;


    private String importance_type;




    /**
     * construtor da class morada
     *
     * @param address morada cliente
     * @param postalCode codigo postal cliente
     * @param locality localidade cliente
     * @param country país cliente
     * @param importance_type importancia
     */
    public Address(String address, String postalCode, String locality, String country, String importance_type) {
        this.address = address;
        this.postalCode = postalCode;
        this.locality = locality;
        this.country = country;
        this.importance_type = importance_type;
    }


    /**
     * devolve morada
     *
     * @return morada
     */
    public String getAddress() {
        return address;
    }

    /**
     * define morada
     *
     * @param address morada
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
     * define codigo postal
     *
     * @param postalCode codigo postal
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * devolve localidade
     *
     * @return localidade
     */
    public String getLocality() {
        return locality;
    }

    /**
     *  define localidade
     *
     * @param locality localidade
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     * devolve país da morada
     *
     * @return país
     */
    public String getCountry() {
        return country;
    }

    /**
     * define país da morada
     *
     * @param country país
     */
    public void setCountry(String country) {
        this.country = country;
    }


    public String getImportance_type() {
        return importance_type;
    }

    public void setImportance_type(String importance_type) {
        this.importance_type = importance_type;
    }
}
