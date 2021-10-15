package application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramListas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scs= new Scanner(System.in);

        List<Funcionario>list = new ArrayList<>();

             System.out.println("Quantos funcionarios vão ser registrados ?");
             int registro = sc.nextInt();

             for (int i = 0; i<registro; i++){
                System.out.print(" id: ");
                Integer id = sc.nextInt();

                while(existeID(list,id)){
                    System.out.println("Este id já existe ! Tente outro novamente: ");
                    id = sc.nextInt();
                }

                System.out.print(" Nome: ");
                String nome = scs.nextLine();
                System.out.print(" Salario: ");
                Double salario = sc.nextDouble();

                 list.add( new Funcionario(id,nome,salario));

             }
        System.out.println("Digite o id do funcionario que ira receber reajuste no salário: ");
        int id_func = sc.nextInt();
        Funcionario func = list.stream().filter(x-> x.getId() == id_func).findFirst().orElse(null);

        if (func == null) {

            System.out.println("Este id de funcionário não existe");
        }else{
            System.out.println("Digite a porcentagem do reajuste: ");
            double reajuste = sc.nextDouble();
            func.Reajuste(reajuste);
        }

        System.out.println();
        System.out.println("** Lista de funcionários: ** ");

        for (Funcionario lista : list){
            System.out.println("id: " + lista);
        }
    }

    public static boolean existeID(List<Funcionario>list, int id_func){
        Funcionario func = list.stream().filter(x-> x.getId() == id_func).findFirst().orElse(null);
        return func !=null;

    }
}
