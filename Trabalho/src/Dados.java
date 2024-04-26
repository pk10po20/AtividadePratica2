package AtividadePratica2;
public class Dados extends Artigos {


   private int lados;

// construtor parametrizado usando atributos da super classe


public Dados(String nome, Float preco, int quant, int lados) {
    super(nome, preco, quant);
    this.lados = lados;
}

public int getLados() {
    return lados;
}

public void setLados(int lados) {
    this.lados = lados;
}

@Override
public String toString() {
String txt = super.toString() + "\n Quantidade de lados: " + lados;
return txt;
}
    
    
}
