package Application;

import entities.Exe1;
 
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner scs = new Scanner(System.in);

        System.out.print("Digite o modelo da lampada: ");
        String modelo = scs.nextLine();
        System.out.print("Digite a marca da lampada: ");
        String marca = scs.nextLine();
        System.out.print("Digite o tipo da lampada: ");
        String tipo= scs.nextLine();
        System.out.print("Digite o estado da lampada: ");
        String estado = scs.nextLine();

        scs.close();

        Exe1 produto = new Exe1(modelo,marca,tipo,estado);

        produto.setMarca(modelo);
        System.out.println("Modelo atualizado: "+produto.getModelo());
        produto.setMarca(marca);
        System.out.println("Marca atualizado: "+produto.getMarca());
        produto.setTipo(tipo);
        System.out.println("Tipo atualizado: "+produto.getTipo());
        produto.setEstado(estado);
        System.out.println("Estado atualizado: "+produto.getEstado());


    }
}
