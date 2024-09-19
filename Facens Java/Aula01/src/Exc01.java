import java.util.Scanner;

public class Exc01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor = 0;
        int contagem = 0;
        int soma = 0;
        double media;
        System.out.println("Digite quantos valores quiser, para parar digite um valor negativo");
        while (valor >= 0) {
            valor = scan.nextInt();
            if (valor >= 0) {
                soma += valor;
                contagem++;

            }
        }
        media = soma / contagem;
        System.out.println("O valor da média desses valores é de : " + media);

    }
}
