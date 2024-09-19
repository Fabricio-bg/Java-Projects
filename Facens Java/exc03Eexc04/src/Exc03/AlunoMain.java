package Exc03;
import java.util.Scanner;
public class AlunoMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite seu RA: ");
        String ra = scan.next();
        aluno.setRa(ra);
        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        aluno.setNome(nome);
        System.out.println("Digite sua nota da AC1: ");
        float ac1 = scan.nextFloat();
        aluno.setAc1(ac1);
        System.out.println("Digite sua nota da AC2: ");
        float ac2 = scan.nextFloat();
        aluno.setAc2(ac2);
        System.out.println("Digite sua nota da AG: ");
        float ag = scan.nextFloat();
        aluno.setAg(ag);
        System.out.println("Digite sua nota da AF: ");
        float af = scan.nextFloat();
        aluno.setAf(af);

        aluno.imprimir();

    }
}
