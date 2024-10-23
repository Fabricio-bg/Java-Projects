public class Gato extends Animal{
    private int alturaSalto;
    public Gato() {
    }
    public Gato(int alturaSalto, String nome, int idade) {
    super(nome, idade);
    this.alturaSalto = alturaSalto;
    }
    public int getAlturaSalto() {
    return alturaSalto;
    }
    public void setAlturaSalto(int alturaSalto) {
    this.alturaSalto = alturaSalto;
    }
    @Override
    public String imprimir() {
    return super.imprimir()+"\nAltura do salto: "+alturaSalto;
    }
    @Override
    public String falar() {
    return "MIAU MIAU MIAU......";
    }
}
    
