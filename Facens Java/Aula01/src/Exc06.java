import java.util.Scanner;
public class Exc06
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] numPares = new int[10];
        int[] numImpares = new int[10];
        int contadorPares = 0, contadorImpares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = scan.nextInt();
        }
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numPares[contadorPares] = numero;
                contadorPares++;
            }
            else {
                numImpares[contadorImpares] = numero;
                contadorImpares++;
            }
        }
        System.out.println("Vetor original:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\nVetor de pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(numPares[i] + " ");
        }
        System.out.println("\nVetor de ímpares:");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(numImpares[i] + " ");
        }
    }
}
