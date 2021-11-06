package PROVAS;

import java.util.Arrays;

/*
ter a função Arr. pegar o conjunto de números armazenados em arr e retornar a string verdadeira se qualquer combinação de números no conjunto (excluindo o maior número)
puder ser somada até igualar o maior número no conjunto, caso contrário retornar a string falsa.
Por exemplo: se arr contém [4,6,23,10,1,3] a saída deve retornar verdadeira, porque 4 + 6 + 10 + 3 = 23. o array não estará vazio, não conterá todos os mesmos elementos, e pode conter números negativos.
* */
public class TESTE1 {

    public static void main(String[] args) {

        int arr[] = new int[]{5, 7, 16, 1, 2};
        Arrays.sort(arr);
        int lastposition = arr[arr.length - 1];
        int soma = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            soma += arr[i];
            System.out.println(arr[i]);
        }
        if (soma >= lastposition){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

