import java.util.Scanner;
public class Exc08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[1000];
        double[] alturas = new double[1000];
        int[] sexos = new int[1000];
        double mediaIdade = 0;
        double mediaAlturaMulheres = 0;
        double mediaIdadeHomens = 0;
        double percentual18a35 = 0;

        for (int i = 0; i < 1000; i++) {
            System.out.println("Pessoa " + (i + 1));
            System.out.print("Sexo (0-feminino, 1-masculino): ");
            sexos[i] = scan.nextInt();
            System.out.print("Idade: ");
            idades[i] = scan.nextInt();
            System.out.print("Altura: ");
            alturas[i] = scan.nextDouble();
        }

        double somaIdades = 0, somaAlturaMulheres = 0, somaIdadeHomens = 0;
        int contMulheres = 0, contHomens = 0, cont18a35 = 0;

        for (int i = 0; i < 1000; i++) {
            somaIdades += idades[i];
            if (sexos[i] == 0) {
                somaAlturaMulheres += alturas[i];
                contMulheres++;
            } else {
                somaIdadeHomens += idades[i];
                contHomens++;
            }
            if (idades[i] >= 18 && idades[i] <= 35) {
                cont18a35++;
            }
        }

        mediaIdade = somaIdades / 1000;
        mediaAlturaMulheres = contMulheres == 0 ? 0 : somaAlturaMulheres / contMulheres;
        mediaIdadeHomens = contHomens == 0 ? 0 : somaIdadeHomens / contHomens;
        percentual18a35 = (double) cont18a35 / 1000 * 100;

        System.out.println("\nResultados:");
        System.out.println("Média da idade do grupo: " + mediaIdade);
        System.out.println("Média da altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Média da idade dos homens: " + mediaIdadeHomens);
        System.out.println("Percentual de pessoas entre 18 e 35 anos: " + percentual18a35 + "%");
    }
}
