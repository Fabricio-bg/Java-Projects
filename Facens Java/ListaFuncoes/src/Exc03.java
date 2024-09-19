import java.util.Scanner;
public class Exc03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String texto = scan.nextLine();

        System.out.println("Digite a letra que quer contar: ");
        char letra = scan.next().charAt(0);

        int contador = contarLetras(texto, letra);
        System.out.println("A letra " + letra + " aparece " + contador + " vezes na frase.");
    }
    public static int contarLetras(String string, char character) {
        int contagem = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                contagem++;
            }
        }

        return contagem;
    }

}
