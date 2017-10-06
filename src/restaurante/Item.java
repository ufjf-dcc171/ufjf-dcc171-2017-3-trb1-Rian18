package restaurante;

/**
 * @author Rian Alves
 */
public class Item {
    private int codigo;
    private String descricao;
    private Double preco;
    private Double somaT;

    public Item() {
    }

    @Override
    public String toString() {
        return codigo + "......" + descricao + "......" + preco ;
    }
    
    

    public Item(int codigo, String descricao, Double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the preco
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    /**
     * @return the somaT
     */
    public Double getSomaT() {
        return somaT;
    }

    /**
     * @param somaT the somaT to set
     */
    public void setSomaT(Double somaT) {
        this.somaT = somaT;
    }
    
    
}
