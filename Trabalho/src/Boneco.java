package AtividadePratica2;
public class Boneco extends Artigos {

    private String classe;

    //construtor parametrizado usando atributos da super classe

    public Boneco(String nome, Float preco, int quant, String classe) {
        super(nome, preco, quant);
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
    String txt = super.toString() + "\nClasse do boneco: " + classe;
    return txt;
    }
    
    
    
}
