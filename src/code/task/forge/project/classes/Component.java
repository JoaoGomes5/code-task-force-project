package code.task.forge.project.classes;

/**
 * Classe que recebe os dados dos componentes
 *
 */
public class Component {
    private String reference;
    private String commercialDesignation;
    private String version;
    private float quantityNeeded;
    private String measureUnit;
    private Component alternative;

    /**
     * Recebe os dados dos Componentes
     *
     * @param reference - Referência do componente
     * @param commercialDesignation - Designação Comercial do componente
     * @param version - Versão do componente
     * @param quantityNeeded - Quantidade do componente necessária p/construir a peça
     * @param measureUnit - Unidade de medida do componente
     * @param alternative - Componente alternativo em caso de rutura de stock
     */

        public Component(String reference, String commercialDesignation, String version, float quantityNeeded, String measureUnit, Component alternative){
            this.setReference(reference);
            this.setCommercialDesignation(commercialDesignation);
            this.setVersion(version);
            this.setQuantityNeeded(quantityNeeded);
            this.setMeasureUnit(measureUnit);
            this.setAlternative(alternative);
        }

        public Component()
        {}

    /**
     * O get devolve a Referência do Componente
     *
     * @return - Referência do Componente
     */
    public String getReference() {
        return reference;
    }

    /**
     * Define a Referência do Componente
     *
     * @param reference - Referência do Componente
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * O get devolve a Designação Comercial do Componente
     *
     * @return - Designação Comercial do Componente
     */
    public String getCommercialDesignation() {
        return commercialDesignation;
    }

    /**
     * Define a Designação Comercial do Componente
     *
     * @param commercialDesignation - Designação Comercial do Componente
     */
    public void setCommercialDesignation(String commercialDesignation) {
        this.commercialDesignation = commercialDesignation;
    }

    /**
     * O get devolve a Versão do Componente
     *
     * @return - Versão do Componente
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define a versão do Componente
     *
     * @param version - Versão do Componente
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * O get devolve a Quantidade Necessária do Componente
     *
     * @return - Quantidade do Componente
     */
    public float getQuantityNeeded() {
        return quantityNeeded;
    }

    /**
     * Define a Quantidade Necessária do Componente
     * @param quantityNeeded - Quantidade necessária do Componente para produzir a Peça
     */
    public void setQuantityNeeded(float quantityNeeded) {
        this.quantityNeeded = quantityNeeded;
    }

    /**
     * O get devolve a Unidade de Medida do Componente
     *
     * @return - Unidade de Medida do Componente
     */
    public String getMeasureUnit() {
        return measureUnit;
    }

    /**
     * Define a Unidade de Medida do Componente
     *
     * @param measureUnit - Unidade de Medida do Componente
     */
    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    /**
     * O get devolve Componente Alternativo para produzir peça caso o componente recomendado esteja esgotado
     *
     * @return - Componente Alternativo
     */
    public Component getAlternative() {
        return alternative;
    }

    /**
     * Define um Componente Alternativo ao Componente que constitui a peça
     *
     * @param alternative - Componente Alternativo para produzir a peça
     */
    public void setAlternative(Component alternative) {
        this.alternative = alternative;
    }
}
