package code.task.forge.project.Models;

/**
 * Classe que recebe os dados dos componentes
 *
 */
public class Component extends Article {
    private float stockQuantity;
    private String measureUnit;
    private String alternative;

    /**
     * Recebe os dados dos Componentes
     *
     * @param reference - Referência do componente
     * @param commercialDesignation - Designação Comercial do componente
     * @param version - Versão do componente
     * @param stockQuantity - Quantidade do componente necessária p/construir a peça
     * @param measureUnit - Unidade de medida do componente
     * @param alternative - Componente alternativo em caso de rutura de stock
     */

        public Component(String reference, String commercialDesignation, String version, float stockQuantity, String measureUnit, String alternative){
            super(reference, commercialDesignation, version);
            this.setStockQuantity(stockQuantity);
            this.setMeasureUnit(measureUnit);
            this.setAlternative(alternative);
        }

        public Component()
        {}

    /**
     * O get devolve a Quantidade em Stock do Componente
     *
     * @return - Quantidade em Stock do Componente
     */
    public float getStockQuantity() {
        return stockQuantity;
    }

    /**
     * Define a Quantidade em stock do Componente
     * @param stockQuantity - Quantidade em stock do Componente
     */
    public void setStockQuantity(float stockQuantity) {
        this.stockQuantity = stockQuantity;
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
    public String getAlternative() {
        return alternative;
    }

    /**
     * Define um Componente Alternativo ao Componente que constitui a peça
     *
     * @param alternative - Componente Alternativo para produzir a peça
     */
    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }
}
