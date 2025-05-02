import java.util.Arrays;
import java.util.Scanner;

public class Exerc06 {

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

    public static void main(String[] args){
        int[] vetor = new int[10];
        int[] vetorSemNum = new int[9];
        int num, aux_cont = 0;
        Integer aux_num = null;

        Scanner scanner = new Scanner(System.in);
        vetor = montaVetor(scanner);

        System.out.println(Arrays.toString(vetor));
        System.out.print("\nDado o array acima, digite um numero para ser removido: \n");
        num = scanner.nextInt();

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == num && aux_num == null){
                aux_num = vetor[i];
            }else{
                vetorSemNum[aux_cont] = vetor[i];
                aux_cont++;
            }
        }

        System.out.println(Arrays.toString(vetorSemNum));

    }
}
