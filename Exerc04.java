import java.util.*;

public class Exerc04 {

    public static double[] inverteVetor(double[] vetor){
        double[] vetorInvertido = new double[vetor.length];
        for(int i = 0 ; i < vetor.length; i++){
            vetorInvertido[vetor.length - 1 - i] = vetor[i];
        }
        return vetorInvertido;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[8], vetorInvertido = new double[vetor.length];


        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Digite o %d ° do array: ", i + 1);
            vetor[i] = scanner.nextDouble();
        }

        vetorInvertido = inverteVetor(vetor);

        for(int i = 0; i< vetorInvertido.length; i++){
            if(i == 0){
                System.out.printf("[%.1f, ", vetorInvertido[i]);
            } else if (i == vetor.length -1) {
                System.out.printf("%.1f]", vetorInvertido[i]);
            }else {
                System.out.printf("%.1f, ", vetorInvertido[i]);
            }
        }

        scanner.close();
    }
}
