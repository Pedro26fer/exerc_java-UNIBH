import java.util.Arrays;
import java.util.Scanner;

public class Exerc08 {

    public static int[] montaVetor(Scanner scanner, int lenght){
        int[] array = new int[lenght];
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                System.out.print("Vamos montar um array de numero inteiros de tamnho 5\nQual o 1° elemento deste array?: ");
                array[i] = scanner.nextInt();
            }
            else{
                System.out.printf("Digite o %d ° elemento do array: ",i+1);
                array[i] = scanner.nextInt();
            }
        }
        return array;
    }
    public static int[] mergeVetor(int[] a, int[] b){
        int [] c = new int[a.length + b.length];
        int i = 0;

        for(int j = 0; j < a.length; j++){
            c[i++] = a[j];
        }

        for(int j = 0; j < b.length; j++){
            c[i++] = b[j];
        }

        return c;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5], b = new int[5], c = new int[a.length + b.length];

        a = montaVetor(scanner, a.length);
        b = montaVetor(scanner, b.length);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        c = mergeVetor(a,b);

        System.out.println("A concatenação desses dois arrays é: ");
        System.out.println(Arrays.toString(c));
        scanner.close();


    }
}
