import java.util.Scanner;
public class Exc02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int votoCandidato1 = 0, votocandidato2 = 0, votocandidato3 = 0, votoCandidato4 = 0;
        int votoNulo = 0, votoEmBranco = 0;
        int voto = 1;

        while(voto > 0){
            System.out.println(" // Para votar no cadidato 1 digite 1 // " +
                    " // Para votar no candidato 2 digite 2 // " +
                    " //Para votar no candidato 3 digite 3 // " +
                    " //Para votar no candidato 4 digite 4 //");
            System.out.println("// Para vota nulo digite 5 // " +
                    "// Para votar em branco digite 6 //");
            System.out.println("Digite aqui seu voto : ");
            voto = scan.nextInt();
            if(voto == 1){
                votoCandidato1++;
            }
            else if(voto == 2){
                votocandidato2++;
            }
            else if(voto ==3){
                votocandidato3++;
            }
            else if(voto ==4){
                votoCandidato4++;
            }
            else if(voto == 5) {
                votoNulo++;
            }
            else if(voto == 6){
                votoEmBranco++;
            }
        }
        System.out.println("O número de votos do candidato 1 foi de : " + votoCandidato1);
        System.out.println("O número de votos do candidato 2 foi de : " + votocandidato2);
        System.out.println("O número de votos do candidato 3 foi de : " + votocandidato3);
        System.out.println("O número de votos do candidato 4 foi de : " + votoCandidato4);
        System.out.println("O número de votos nulos foi de : " + votoNulo);
        System.out.println("O número de votos em branco foi de : " + votoEmBranco);
    }
}
