package AtividadePratica2;
public class Artigos {
    
    private String nome;
    private Float preco;
    private int quant;
    
    public Artigos () {
    
    }

    //construtor parametrizado

    public Artigos(String nome, Float preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }
    //getters e setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Float getPreco() {
        return preco;
    }
    public void setPreco(Float preco) {
        this.preco = preco;
    }
    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        
        String txt = "\n Nome do produto: " + nome + "\n Preço do produto: " + preco + "\n Quantidade do produto: " + quant;

        return txt;
    }

}
