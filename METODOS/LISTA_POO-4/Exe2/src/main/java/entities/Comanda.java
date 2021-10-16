package entities;

public class Comanda {

    private Integer qtd_pessoa;
    private Double valor_comanda;

    public Comanda(Integer qtd_pessoa, Double valor_comanda) {

        this.qtd_pessoa = qtd_pessoa;
        this.valor_comanda =valor_comanda;

    }

    public Double getValor_comanda(double porc) {

        return valor_comanda;
    }

    public void setValor_comanda(Double valor_comanda) {

        this.valor_comanda = valor_comanda;
    }

    public Integer getQtd_pessoa() {

        return qtd_pessoa;
    }

    public void setQtd_pessoa(Integer qtd_pessoa) {

        this.qtd_pessoa = qtd_pessoa;
    }

    public Double racharConta(double conta) {

       return  conta = valor_comanda/qtd_pessoa ;
    }

    public double porcGorjeta(double porc){

        porc = valor_comanda += valor_comanda *0.1;
        return  racharConta(porc);
    }

}


