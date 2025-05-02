import java.util.Scanner;

public class Exerc05 {

    public static int[] montaVVetor(Scanner scanner){
        int[] nums = new int[12];
        for(int i = 0; i< nums.length; i++){
            System.out.print("Digite um numero: ");
            nums[i] = scanner.nextInt();
        }
        return nums;
    }
    public static double media(int[] vector){
        int soma = 0;
        int media;
        for(int i = 0;  i < vector.length; i++){
            soma += vector[i];
        }
        media = soma/ vector.length;
        return  media;
    }

    public static  void  main(String[]  args){
        Scanner scanner = new Scanner(System.in);
        int[] nums =  new int[12];
        int cont = 0;

        nums = montaVVetor(scanner);
        double media = media(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > media){
                cont += 1;
            }
        }

        System.out.printf("Dos numeros digitados existem %d numeros maiores que a média entre eles que é %.2f", cont, media);

        scanner.close();

    }
}
