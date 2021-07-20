package modeloBeans;

public class ClassProduto {

    private int CodigoProduto;
    private String Descricao;
    private double Valor;
    private int QtdEstoque;
    
    public int getQtdEstoque() {
        return QtdEstoque;
    }

  
    public void setQtdEstoque(int QtdEstoque) {
        this.QtdEstoque = QtdEstoque<0 ? 0 :QtdEstoque;
    }

    public int getCodigoProduto() {
        return CodigoProduto;
    }

    public void setCodigoProduto(int Codigo) {
        this.CodigoProduto = Codigo<0 ? 0 :Codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao.toUpperCase().trim();
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor<0 ? 0 :(Valor * 1.00);
    }

    public ClassProduto(int CodigoProduto, String Descricao, double Valor, int QtdEstoque) {
        this.CodigoProduto = CodigoProduto;
        this.Descricao = Descricao.toUpperCase().trim();
        this.Valor = Valor;
        this.QtdEstoque = QtdEstoque;
    }

    

}
