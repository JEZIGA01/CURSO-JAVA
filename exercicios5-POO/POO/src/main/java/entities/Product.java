package entities;

public class Product {
    public String nome;
    public double preco;
    public int quantidade;

    public Product(String nome, double preco ,int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
        public double valorTotalNoEstoque() {

            return preco * quantidade;
        }
        public void addProdutos( int quantidade){

            this.quantidade += quantidade;
        }
        public void removeProdutos(int quantidade){

            this.quantidade -= quantidade;

        }
        public String toString(){

            return nome + ", quantidade: " + quantidade + "," + "Total: "+valorTotalNoEstoque();
        }
    }


