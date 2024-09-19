import java.util.Scanner;
public class BancoApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Banco contaBanco = new Banco();
        boolean continuar = true;
        while(continuar){
            System.out.println("Selecione uma opção:");
            System.out.println("1. Para ver saldo");
            System.out.println("2. Para depositar um valor");
            System.out.println("3. Para sacar um valor");
            System.out.println("4. Para sair");
            int opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Seu saldo é de: " + contaBanco.getSaldo());
                    break;
                case 2:
                    contaBanco.depositar(0);
                    break;
                case 3:
                    contaBanco.sacar(0);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Voçê saiu.");
                    break;
                default:
                    System.out.println("Opção inválida, digite uma opção válida!");
            }
        }


    }
}