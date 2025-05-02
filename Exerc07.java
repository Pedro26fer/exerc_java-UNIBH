import java.util.Arrays;
import java.util.Scanner;

public class Exerc07 {

    public static int[] montaVetor(Scanner scanner){
        int[] array = new int[15];
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                System.out.print("Vamos montar um array de numero inteiros de tamnho 15\nQual o 1° elemento deste array?: ");
                array[i] = scanner.nextInt();
            }
            else{
                System.out.printf("Digite o %d ° elemento do array: ",i+1);
                array[i] = scanner.nextInt();
            }
        }
        return array;
    }
    public static int contaOcorrencia(int[] nums, int num){
        int cont = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == num){
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args){
        int[] array;
        int num, cont;
        Scanner scanner = new Scanner(System.in);
        array = montaVetor(scanner);

        System.out.print("Digite um numero para ser verificado quantas vezes ele aparece no array montado: ");
        num = scanner.nextInt();
        cont = contaOcorrencia(array, num);
        System.out.print(Arrays.toString(array));

        System.out.printf("\nO numero %d apareceu %d vezes no array", num, cont);


    }
}
