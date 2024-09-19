import java.util.Scanner;
public class Exc02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = scan.nextInt();

        System.out.println(verificaPar(valor));
    }
    public static boolean verificaPar(int num){
        if(num % 2 == 0 ){
            return true;
        }
        else{
            return false;
        }
    }
}
