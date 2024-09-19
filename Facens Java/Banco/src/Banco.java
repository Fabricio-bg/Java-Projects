import java.util.Scanner;
public class Banco {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double depositar(double valor){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor que quer depositar: ");
        valor = scan.nextDouble();
        return saldo+=valor;

    }
    public double sacar(double valor){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor que quer sacar: ");
        valor = scan.nextDouble();
        if(valor<saldo){
            System.out.println("Saque realizado com sucesso!!");
            return saldo-=valor;
        }
        else{
            System.out.println("Saldo insuficienete!!");
        }
        return valor;
    }
}
