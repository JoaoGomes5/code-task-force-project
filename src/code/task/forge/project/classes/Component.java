package code.task.forge.project.classes;

/**
 * Classe que recebe os dados dos componentes
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
            this.reference = reference;
            this.commercialDesignation = commercialDesignation;
            this.version = version;
            this.quantityNeeded = quantityNeeded;
            this.measureUnit = measureUnit;
            this.alternative = alternative;
        }
}
