public class Animal {
    private String nome;
    private String tipo;
    private int idade;
    private int energia;
    private int felicidade;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public int getFelicidade() {
        return felicidade;
    }
    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }
    public void alimentar(){
        energia+=10;
    }
    public void brincar(){
        felicidade+=10;
        energia-=5;
    }
    public void dormir(){
        energia=100;
    }
    public void mostrarStatus(){
        System.out.println(" STATUS DO ANIMAL:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Tipo: " + tipo);
        System.out.println("Energia: " + energia);
        System.out.println("Felicidade: " + felicidade);

    }
}
