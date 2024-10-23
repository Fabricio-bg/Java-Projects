public class Capivara extends Animal{
    
        private int peso;
        public Capivara() {
        }
        public Capivara(int peso, String nome, int idade) {
        super(nome, idade);
        this.peso = peso;
        }
        public int getPeso() {
        return peso;
        }
        public void setPeso(int peso) {
        this.peso = peso;
        }
        @Override
        public String imprimir() {
        return super.imprimir()+"\nPeso: "+peso;
        }
        @Override
        public String falar() {
        return "Sons de capivara.....";
        }
}
        


