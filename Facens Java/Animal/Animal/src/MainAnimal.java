import java.util.ArrayList;
import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList <Animal> lstAnimais = new ArrayList<>();

        int opcao;
        do{
            System.out.println("");
            System.out.println("////////////////// MENU /////////////////");
            System.out.println("Digite 1 para cadastrar um animal.");
            System.out.println("Digite 2 para mostar animais.");
            System.out.println("Digite 3 para fazer os animais falarem.");
            System.out.println("Digite 4 para parar.");
            System.out.println("");
            System.out.print("Digite aqui a sua opção: ");
            opcao = scan.nextInt();
            System.out.println("");

            switch (opcao) {
                case 1 :
                    System.out.println("Que tipo de animal deseja cadastrar? ");
                    System.out.println("1 - Cachorro.");
                    System.out.println("2 - Gato.");
                    System.out.println("3 - Capivara.");
                    System.out.println("");
                    System.out.print("Digite aqui o número do animal desejado: ");
                    int opcaoAnimal = scan.nextInt();

                    switch (opcaoAnimal){
                        case 1:
                        System.out.println("Digite o nome do cachorro: ");
                        String nomeCachorro = scan.next();
                        System.out.println("Digite a idade do cachorro: ");
                        int idadeCachorro = scan.nextInt();
                        System.out.println("Digite a velocidae do cachorro em KM: ");
                        int velocidadeCachorro = scan.nextInt();
                        lstAnimais.add(new Cachorro(velocidadeCachorro, nomeCachorro, idadeCachorro));
                        break;

                        case 2:
                        System.out.println("Digite o nome do gato: ");
                        String nomeGato = scan.next();
                        System.out.println("Digite a idade do gato: ");
                        int idadeGato = scan.nextInt();
                        System.out.println("Digite a altura do salto do gato em M: : ");
                        int saltoGato = scan.nextInt();
                        lstAnimais.add(new Gato(saltoGato, nomeGato, idadeGato));
                        break;

                        case 3:
                        System.out.println("Digite o nome da capivara: ");
                        String nomeCapivara = scan.next();
                        System.out.println("Digite a idade da capivara: ");
                        int idadeCapivara = scan.nextInt();
                        System.out.println("Digite o peso da capivara em kg: ");
                        int pesoCapivara = scan.nextInt();
                        lstAnimais.add(new Capivara(pesoCapivara, nomeCapivara, idadeCapivara));
                        break;
                    }
                break;
                case 2:
                    for (Animal animal : lstAnimais){
                        System.out.println(animal.imprimir());
                    }
                    break;
                case 3:
                    for (Animal animal : lstAnimais) {
                        System.out.println(animal.falar());
                    }
                    break;    
            }   
        } while (opcao!=4);
        
    }
}