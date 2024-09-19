import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Animal animal01 = new Animal();
        Animal animal02 = new Animal();
        System.out.println(" INFORME OS DADOS DO ANIMAL 1: ");
        System.out.println("Nome: ");
        String nome1 = scan.next();
        animal01.setNome(nome1);
        System.out.println("Tipo: ");
        String tipo1 = scan.next();
        animal01.setTipo(tipo1);
        System.out.println("Idade: ");
        int idade1 = scan.nextInt();
        animal01.setIdade(idade1);
        System.out.println(" ");
        scan.nextLine();
        System.out.println(" INFORME OS DADOS DO ANIMAL 2: ");
        System.out.println("Nome: ");
        String nome2 = scan.next();
        animal02.setNome(nome2);
        System.out.println("Tipo: ");
        String tipo2 = scan.next();
        animal02.setTipo(tipo2);
        System.out.println("Idade: ");
        int idade2 = scan.nextInt();
        animal02.setIdade(idade2);
        int energia1 = 100;
        animal01.setEnergia(energia1);
        int energia2 = 100;
        animal02.setEnergia(energia2);
        int felicidade1 = 100;
        animal01.setFelicidade(felicidade1);
        int felicidade2 = 100;
        animal02.setFelicidade(felicidade2);
        System.out.println(" ");
        boolean start = true;
        while(start){
            System.out.println(" Selecione as interações: ");
            System.out.println("Digite 1 para alimentar um dos animais.");
            System.out.println("Digite 2 para eles brinacarem um com o outro.");
            System.out.println("Digite 3 para fazer um deles dormir. ");
            System.out.println("Digite 4 para mostrar o status de um deles.");
            System.out.println("Digite 5 para parar.");
            System.out.print("Digite aqui: ");
            int opcao = scan.nextInt();
            switch(opcao){
                case 1->{
                    System.out.println("Qual animal deseja alimentar ?");
                    int selectAnimal = scan.nextInt();
                    if(selectAnimal == 1){
                        System.out.println( animal01.getNome()+" foi alimentado!");
                        animal01.alimentar();
                    }
                    else if(selectAnimal == 2){
                        System.out.println( animal02.getNome()+" foi alimentado!");
                        animal02.alimentar();
                    }
                    else{
                        System.out.println("Selecione um animal válido!");
                    }
                }
                case 2->{
                    System.out.println("Os animais estão brincando e estão felizes!!");
                    animal01.brincar();
                    animal02.brincar();
                }
                case 3->{
                    System.out.println("Qual animal vai dormir ?");
                    int selectAnimal = scan.nextInt();
                    if(selectAnimal == 1){
                        System.out.println( animal01.getNome()+" está dormindo!");
                        animal01.alimentar();
                    }
                    else if(selectAnimal == 2){
                        System.out.println( animal02.getNome()+" esta dormindo!");
                        animal02.alimentar();
                    }
                    else{
                        System.out.println("Selecione um animal válido!");
                    }
                }
                case 4->{
                    System.out.println("Status de qual animal ?");
                    int selectAnimal = scan.nextInt();
                    if(selectAnimal == 1){
                        System.out.println("Status do animal 1. ");
                        animal01.mostrarStatus();
                    }
                    else if(selectAnimal == 2){
                        System.out.println("Status do animal 2. ");
                        animal02.mostrarStatus();
                    }
                    else{
                        System.out.println("Selecione um animal válido!");
                    }
                }
                case 5->{
                    System.out.println("");
                    start = false;
                }
                default ->{
                    System.out.println("Opção inválida!!");
                    System.out.println("");
                }
            }
        }
    }
    }
