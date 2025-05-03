import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exerc09 {
    public static int[] montaVetor(Scanner scanner, int lenght){
        int[] array = new int[lenght];
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                System.out.printf("Vamos montar um array de numero inteiros de tamnho %d\nQual o 1° elemento deste array?: ", lenght);
                array[i] = scanner.nextInt();
            }
            else{
                System.out.printf("Digite o %d ° elemento do array: ",i+1);
                array[i] = scanner.nextInt();
            }
        }
        return array;
    }
    public static ArrayList<Integer> commonArray(int[] a, int[] b){
        ArrayList<Integer> c = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    c.add(a[i]);
                }
            }
        }
        return c;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[6], b = new int[6];
        ArrayList<Integer> c;

        a = montaVetor(scanner, 6);
        b = montaVetor(scanner, 6);
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        c = commonArray(a,b);


        System.out.println("O array contendo os elementos em comum dos dois arrays acima é: ");
        System.out.print(c);
        scanner.close();
    }
}
