public class Cachorro extends Animal{
    private int velocidade;
    public Cachorro() {
    }
    public Cachorro(int velocidade, String nome, int idade) {
    super(nome, idade);
    this.velocidade = velocidade;
    }
    public int getVelocidade() {
    return velocidade;
    }
    public void setVelocidade(int velocidade) {
    this.velocidade = velocidade;
    }
    @Override
    public String imprimir() {
    return super.imprimir()+ "\nVelocidade: "+velocidade;
    }
    @Override
    public String falar() {
    return "AU AU AU AU....";
    }
}
    
