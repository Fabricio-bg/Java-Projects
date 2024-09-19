import java.util.Scanner;
public class Exc09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] idades = new int[7];
        double[] pesos = new double[7];

        int contPessoasComMaisDe90Kg = 0;
        double somaIdades = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Pessoa " + (i + 1));
            System.out.print("Idade: ");
            idades[i] = scan.nextInt();
            System.out.print("Peso: ");
            pesos[i] = scan.nextDouble();

            if (pesos[i] > 90) {
                contPessoasComMaisDe90Kg++;
            }

            somaIdades += idades[i];
        }

        double mediaIdades = somaIdades / 7;

        System.out.println("\nResultados:");
        System.out.println("Quantidade de pessoas com mais de 90kg: " + contPessoasComMaisDe90Kg);
        System.out.println("Média das idades: " + mediaIdades);
    }
}
