import java.util.Scanner;
public class Exc07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int codigo;
        double precoNormal, precoDesconto, somaPrecosNormais = 0, somaPrecosDesconto = 0, mediaNormais, mediaDesconto;
        int quantidadeProdutos = 0;

        System.out.println("Digite o código do produto ( digite um número negativo para sair):");
        codigo = scan.nextInt();
        while (codigo >= 0) {
            System.out.print("Digite o preço normal: ");
            precoNormal = scan.nextDouble();
            precoDesconto = precoNormal * 1.2;
            somaPrecosNormais += precoNormal;
            somaPrecosDesconto += precoDesconto;

            System.out.println("Código: " + codigo);
            System.out.println("Preço normal: R$" + precoNormal);
            System.out.println("Preço com desconto: R$" + precoDesconto);
            System.out.println();

            quantidadeProdutos++;

            System.out.println("Digite o próximo código do produto ( digite um número negativo para sair):");
            codigo = scan.nextInt();

        }
        if (quantidadeProdutos > 0) {
            mediaNormais = somaPrecosNormais / quantidadeProdutos;
            mediaDesconto = somaPrecosDesconto / quantidadeProdutos;

            System.out.println("\nMédia dos preços antes de aumentar 20% : R$" + mediaNormais);
            System.out.println("Média dos preços depois do aumento de 20%: R$" + mediaDesconto);
        }

    }
}
