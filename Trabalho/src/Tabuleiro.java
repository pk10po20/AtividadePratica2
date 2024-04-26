package AtividadePratica2;
public class Tabuleiro extends Artigos {

    private int casaV;
    private int casaH;
    
    //construtor parametrizado usando atributos da super classe

    public Tabuleiro(String nome, Float preco, int quant, int casaV, int casaH) {
        super(nome, preco, quant);
        this.casaV = casaV;
        this.casaH = casaH;
    }

    public int getCasaV() {
        return casaV;
    }

    public void setCasaV(int casaV) {
        this.casaV = casaV;
    }

    public int getCasaH() {
        return casaH;
    }

    public void setCasaH(int casaH) {
        this.casaH = casaH;
    }

    @Override
    public String toString() {
    String txt = super.toString() + "\nTamanho da horizontal do tabuleiro: " + casaH + "\nTamanho da vertical do tabuleiro" + casaV;

    return txt;
    }

    

    

    


    
}
