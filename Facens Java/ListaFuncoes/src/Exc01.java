import java.util.Scanner;
public class Exc01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("OPERADORES: +, -, *, /");
        System.out.println("Digite o primeiro valor valor: ");
        int valor1 = scan.nextInt();

        System.out.println("Digite o operador que deseja utilizar: ");
        String operacao = scan.next();

        System.out.println("Digite o segundo valor: ");
        int valor2 = scan.nextInt();

        int resultado = calculadora(valor1, valor2, operacao);

        System.out.println("Resultado: " + resultado);

    }
    public static int calculadora(int num1, int num2, String operator){
        int result = 0;
        switch (operator){
            case "+":
                result = num1+num2;

                break;
            case "-":
                result = num1-num2;

                break;
            case "/" :
                result = num1/num2;

                break;
            case "*":
                result = num1*num2;

                break;
            default:
                System.out.println("Operador inválido. Utilize +, -, *, /.");
                return 0;

        }
        return result;
    }
}
