import java.util.Scanner;
public class Exc05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = scan.nextInt();

        int resultado = calcularFatorial(valor);

        System.out.println("O fatorial desse valor" + " é " + resultado);
    }
    public static int calcularFatorial(int num) {
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}
