package Examples;

public class Exe4 {
    public static void main(String[] args) {

        String[] vetor = new String [] {"Jessica ", "Aquiles ","Github", " // "};

        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]);
        }

        // For each : para cada obj "nomes" contigo em vetor, faça:
        for (String nomes : vetor){
            System.out.print(nomes);
        }
    }
}
