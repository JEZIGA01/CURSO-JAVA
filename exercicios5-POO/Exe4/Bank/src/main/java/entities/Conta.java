package entities;

public class Conta {

    private String titular;
    private int num_conta;
    private double saldo;

    public Conta(double deposito_inicial, int num_conta, String titular) {
        this.num_conta=num_conta;
        this.titular=titular;
        Deposito(deposito_inicial);
    }

    public Conta(int num_conta, String titular) {
        this.num_conta=num_conta;
        this.titular=titular;
    }

    public double getDeposito() {
        return saldo;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void Saque(double quantia){
        saldo -= quantia + 5.0;
    }
    public void Deposito(double quantia){
        saldo += quantia;
    }


    public String toString(){

        return "Num. da conta: "
                +num_conta
                +",titular: "
                + titular
                + ",Saldo: $"
                + String.format("%.2f ",saldo);
    }
}