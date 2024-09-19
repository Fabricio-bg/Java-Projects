package Exc04;
import java.util.Scanner;
public class FuncionarioMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Funcionario func = new Funcionario();

        System.out.println("Digite seu crachá: ");
        int cracha = scan.nextInt();
        func.setCracha(cracha);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        func.setNome(nome);

        System.out.println("Digite seu vinculo: ");
        String letra = scan.next();
        char vinculo = letra.charAt(0);
        func.setTipoVinculo(vinculo);

        System.out.println("Digite o valor do seu salario: ");
        float salario = scan.nextFloat();
        func.setSalario(salario);

        System.out.println("Digite o valor do desconto: ");
        float desconto = scan.nextFloat();
        func.setValorDesconto(desconto);

        if(vinculo =='H'){
            System.out.println("Digite o quanto ganha por hora: ");
            float valorPorHora = scan.nextFloat();
            func.setValorHora(valorPorHora);
            System.out.println("Agora digite quantas horas trabalhou: ");
            float horasTrabalhadas = scan.nextFloat();
            func.setQuantidadeHora(horasTrabalhadas);

            func.calcularSalario();

            System.out.println("");
            System.out.println("");
            System.out.println("");
            func.imprimir();
        }
        else if(vinculo=='N'){
            func.calcularSalario();

            System.out.println("");
            System.out.println("");
            System.out.println("");
            func.imprimir();
        }
        else{
            System.out.println("Digite um vinculo válido.");
        }

    }
}
