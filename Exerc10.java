import java.util.Arrays;
import java.util.Scanner;

public class Exerc10 {

    public static void bubbleSort(int[] array){
        boolean trocou;

        for(int i = 0; i < array.length - 1; i++){
            trocou = false;
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    trocou = true;
                }
            }

            if(!trocou){
                break;
            }
        }
    }
    public static int[] montaVetor(Scanner scanner, int lenght){
        int[] array = new int[lenght];
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                System.out.printf("Vamos montar um array de numero inteiros de tamanho %d\nQual o 1° elemento deste array?: ", lenght);
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
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        array = montaVetor(scanner, array.length);
        System.out.println(Arrays.toString(array));

        bubbleSort(array);

        System.out.println("\nO array ordenado é: ");
        System.out.println(Arrays.toString(array));

    }
}
