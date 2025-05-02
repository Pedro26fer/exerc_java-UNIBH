import java.util.Scanner;

public class Exerc03 {

    public static int contaPares(double[] vetor, int cont){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i]%2 == 0){
                cont++;
            }
        }
        return cont;
    }

    public static double[] montaVetor(Scanner scanner){
        double[] array = new double[20];
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                System.out.print("Vamos montar um array de tamnho 20\n\nQual o 1° elemento deste array?: ");
                array[i] = scanner.nextDouble();
            }
            else{
                System.out.printf("Digite o %d ° elemento do array: ",i+1);
                array[i] = scanner.nextDouble();
            }
        }
        return array;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        double[] vetor = montaVetor(scanner);

        cont = contaPares(vetor,cont);

        System.out.printf("O numero de elementos pares nesse array é %d",cont);
        scanner.close();


    }
}
