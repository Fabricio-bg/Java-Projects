import java.util.Scanner;
public class Exc06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é primo: ");
        int numero = scan.nextInt();

        boolean resultado = ehPrimo(numero);
        System.out.println(resultado);
    }
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
