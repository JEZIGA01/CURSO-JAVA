package entities;

public class Funcionario {

    private Double salario;
    private String nome;
    private Integer id;

    public Funcionario(){

    }

    public Funcionario( Integer id, String nome,Double salario) {

        this.nome=nome;
        this.salario=salario;
        this.id=id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void Reajuste(double reajuste){

        salario += salario * reajuste/100;
    }
    public String toString() {
        return id + "  Nome: " + nome + ", Salário:  " + String.format("%.2f", salario," \n");
    }
}
