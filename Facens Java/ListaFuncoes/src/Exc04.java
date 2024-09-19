import java.util.Scanner;
public class Exc04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma temperatura em celsius: ");
        int temperatura = scan.nextInt();

        double resultado = conversao(temperatura);

        System.out.println( "Valor dessa temperatura em fahrenheit: " + resultado + "F");
    }
    public static double conversao(int tempC){
        double tempF =  tempC * 9/5 + 32;
        return tempF;
    }
}
