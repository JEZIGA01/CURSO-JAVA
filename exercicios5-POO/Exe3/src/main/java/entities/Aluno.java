package entities;

public class Aluno {

    public String nome;
    public double nota_a;
    public double nota_b;
    public double nota_c;
     public double resultado;

    public String nomeDoAluno() {

        return this.nome;

    }
     public double notaDoAluno() {

         resultado = nota_a+nota_b+nota_c;
        return  resultado;

    }
     
public double pontosQueFaltaram() {
    
    if( notaDoAluno() < 60.0) {
        return 60.0 - notaDoAluno();
}
       else{
        
        return 0.0;
    }

}
}