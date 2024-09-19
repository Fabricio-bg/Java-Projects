import java.util.Scanner;
public class Exc03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigo = 1, contadorNotas = 0;
        double nota = 0, SomaDasNotas = 0, media = 0;

        while(true){
            if(codigo == 0 ){
                break;
            }
            System.out.println("Digite seu código do aluno: ");
            codigo = scan.nextInt();
            System.out.println("Digite sua nota 1 : ");
            nota = scan.nextInt();
            System.out.println("Digite sua nota 2 : ");
            nota = scan.nextInt();
            System.out.println("Digite sua nota 3 : ");
            nota = scan.nextInt();

            SomaDasNotas += nota;
            contadorNotas++;

        }
        media = SomaDasNotas / contadorNotas;
        System.out.println("A média da classe foi de : " + media);

    }
}
