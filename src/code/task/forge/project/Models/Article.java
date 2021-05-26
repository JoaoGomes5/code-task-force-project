package code.task.forge.project.Models;

/**
 * @author Gustavo
 *
 */

public class Article {

    /**
     * Referência do Artigo
     */
    private String reference;

    /**
     * Designação Comercial do Artigo
     */
    private String commercialDesignation;

    /**
     * Versão do Artigo
     */
    private String version;

    /**
     * Método Construtor Vazio
     */
    public Article () {
    }

    /**
     * Método que permite criar um Artigo
     *
     * @param reference Referência do Artigo
     * @param commercialDesignation Designação Comercial do Artigo
     * @param version Versão do Artigo
     */
        public Article (String reference, String commercialDesignation, String version)
    {
        this.setReference(reference);
        this.setCommercialDesignation(commercialDesignation);
        this.setVersion(version);
    }

    @Override
    public String toString() {
        return "Este artigo tem a referência " + getReference() + ", a designação comercial " + getCommercialDesignation() + "e a sua versão é " + getVersion();
    }

    /**
     * Método que permite obter a Referência do Artigo
     * @return Retorna a Referência do Artigo
     */
    public String getReference() {
        return reference;
    }

    /**
     * Método que permite definir a Referência do Artigo
     * @param reference Referência do Artigo
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Método que permite obter a Designação Comercial do Artigo
     * @return Retorna a Designação Comercial do Artigo
     */
    public String getCommercialDesignation() {
        return commercialDesignation;
    }

    /**
     * Método que permite definir a Designação Comercial do Artigo
     * @param commercialDesignation Designação Comercial do Artigo
     */
    public void setCommercialDesignation(String commercialDesignation) {
        this.commercialDesignation = commercialDesignation;
    }

    /**
     * Método que permite obter a Versão do Artigo
     * @return Retorna a Versão do Artigo
     */
    public String getVersion() {
        return version;
    }

    /**
     * Método que permite definir a Versão do Artigo
     * @param version Versão do Artigo
     */
    public void setVersion(String version) {
        this.version = version;
    }
}
