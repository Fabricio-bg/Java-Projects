import java.util.Scanner;
public class Exc05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0, multiplicacao = 1;
        int[] vetor = new int[5];
        for (int i = 0;i<5;i++){
            System.out.println("Digite um valor: ");
            vetor[i] = scan.nextInt();
            soma += vetor[i];
            multiplicacao *= vetor[i];

        }
        System.out.println("Os números digitados foram:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
        System.out.println("A soma é : " + soma);
        System.out.println("A multiplicação é : " + multiplicacao);

    }
}
