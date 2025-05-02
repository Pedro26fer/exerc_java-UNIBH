import java.util.*;

public class Exerc01{

    public static int somaElementos(int[] vetor){
        int soma = 0;
        for(int i = 0; i < vetor.length; i++){
            soma = soma + vetor[i];
        }
        return soma;
    }


    public static void main(String[] args){
        int [] array = new int[10];
        int soma = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            System.out.printf("Digite o %d ° do array:  ", i+1);
            array[i] = scanner.nextInt();
        }
        soma = somaElementos(array);
        System.out.printf("A soma dos elementos desse aray é: %d", soma);
        scanner.close();
    }
}