import java.util.Scanner;
public class Exc04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, contador = 0, soma = 0;
        double media = 0;
        while(true){
            System.out.println("Digite um numero: ");
            num = scan.nextInt();
            if(num == 0){
                break;
            }
            contador++;
            if(num % 2 == 0){
                soma += num;
            }
        }
        media = soma / contador;
        System.out.println("A média é : " + media);

    }
}
