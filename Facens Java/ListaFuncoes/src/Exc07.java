import java.util.Scanner;
public class Exc07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do array:");
        int tamanhoArray = scan.nextInt();

        int[] numerosArray = new int[tamanhoArray];

        System.out.println("Digite os números do array:");
        for (int i = 0; i < tamanhoArray; i++) {
            numerosArray[i] = scan.nextInt();
        }
        double media = calculaMedia(numerosArray);

        System.out.println("A média dos números é: " + media);
    }
    public static double calculaMedia(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }

        return (double) soma / array.length;
    }
}
