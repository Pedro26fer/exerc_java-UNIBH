import java.util.Scanner;

public class Exerc02 {

    public static int[] montaVetor(Scanner scanner){
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                System.out.print("Vamos montar um array de numero inteiros de tamnho 10\n\nQual o 1° elemento deste array?: ");
                array[i] = scanner.nextInt();
            }
            else{
                System.out.printf("Digite o %d ° elemento do array: ",i+1);
                array[i] = scanner.nextInt();
            }
        }
        return array;
    }

    public static int encontraMaior(int[] vetor){
        int maior = vetor[0];
        for(int i = 1; i < vetor.length; i++){
            if(vetor[i] > maior ){
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] vetor;
        int  maior;

        vetor = montaVetor(scanner);
        maior = encontraMaior(vetor);
        System.out.printf("O maior elemento desse array é: %d", maior);
    }
}
