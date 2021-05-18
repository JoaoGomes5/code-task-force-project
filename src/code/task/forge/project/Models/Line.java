package code.task.forge.project.Models;

/**
 * @author Gustavo
 */
public class Line {

    /**
     * Linha de Referência do Produto
     */
    private String reference;

    /**
     * Linha de Descrição do Produto
     */
    private String description;

    /**
     * Linha de Versão do Produto
     */
    private String version;

    /**
     * Linha de Quantidade do Produto
     */
    private int quantity;

    /**
     * Linha de Unidade do Produto
     */
    private String unit;

    /**
     * Linha de Preço Unitário do Produto
     */
    private String unitPrice;

    /**
     * Linha de Valor Total
     */
    private String valorTotal;

    /**
     * Método Construtor Vazio
     */
    public Line(){
    }

    /**
     *
     * Método que permite criar Linha
     *
     * @param reference Linha de Referência do Produto
     * @param description Linha de Descrição do Produto
     * @param version Linha de Versão do Produto
     * @param quantity Linha de Quantidade do Produto
     * @param unit Linha de Unidade do Produto
     * @param unitPrice Linha de Preço Unitário do Produto
     * @param valorTotal Linha de Valor Total
     */
    public Line (String reference, String description, String version, int quantity, String unit, String unitPrice, String valorTotal) {
        this.setReference(reference);
        this.setDescription(description);
        this.setVersion(version);
        this.setQuantity(quantity);
        this.setUnit(unit);
        this.setUnitPrice(unitPrice);
        this.setValorTotal(valorTotal);
    }

    @Override
    public String toString(){
        return "Referência "+getReference() + "\n" +
                "Descrição " + getDescription() + "\n" +
                "Versão" + getVersion() + "\n" +
                "Quantidade " +getQuantity() + "\n" +
                "Unidade" + getUnit() + "\n" +
                "Preço Unitário" + getUnitPrice() + "\n" +
                "Valor Total" + getValorTotal() + "\n";
    }

    /**
     * Método que permite obter a Linha de Referência do Produto
     * @return Retorna a Linha de Referência do Produto
     */
    public String getReference() {
        return reference;
    }

    /**
     * Método que permite definir a Linha de Referência do Produto
     * @param reference Linha de Referência do Produto
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Método que permite obter a Linha de Descrição do Produto
     * @return Retorna a Linha de Descrição do Produto
     */
    public String getDescription() {
        return description;
    }

    /**
     * Método que permite definir a Linha de Referência do Produto
     * @param description Linha de Descrição do Produto
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Método que permite obter a Linha de Versão do Produto
     * @return Retorna a Linha de Versão do Produto
     */
    public String getVersion() {
        return version;
    }

    /**
     * Método que permite definir a Linha de Versão do Produto
     * @param version Linha de Versão do Produto
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Método que permite obter a Linha de Quantidade do Produto
     * @return Retorna a Linha de Quantidade do Produto
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Método que permite definir a Linha de Quantidade do Produto
     * @param quantity Linha de Quantidade do Produto
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Método que permite obter a Linha de Unidade do Produto
     * @return Retorna a Linha de Unidade do Produto
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Método que permite definir a Linha de Unidade do Produto
     * @param unit Linha de Unidade do Produto
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Método que permite obter a Linha de Preço Unitário do Produto
     * @return Retorna a Linha de Preço Unitário do Produto
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Método que permite definir a Linha de Preço Unitário do Produto
     * @param unitPrice Linha de Preço Unitário do Produto
     */
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Método que permite obter a Linha de Valor Total
     * @return Retorna a Linha de Valor Total
     */
    public String getValorTotal() {
        return valorTotal;
    }

    /**
     * Método que permite definir a Linha de Valor Total
     * @param valorTotal Linha de Valor Total
     */
    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }
}
