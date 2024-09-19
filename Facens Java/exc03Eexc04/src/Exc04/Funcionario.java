package Exc04;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float quantidadeHora;
    private float salario;
    private float valorDesconto;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQuantidadeHora() {
        return quantidadeHora;
    }

    public void setQuantidadeHora(float quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    public float calcularSalario(){
        if(tipoVinculo =='H'){
        return salario += (valorHora*quantidadeHora);
        }
        else{
            return salario;
        }
    }
    public float calcularValorReceber(){
        return salario-valorDesconto;
    }
    public void imprimir(){
        System.out.println("Cracha: " + cracha);
        System.out.println("Nome; " + nome);
        System.out.println("Tipo de vinculo: " + tipoVinculo);
        System.out.println("Salario: " + salario);
        System.out.println("Desconto: " + valorDesconto);
        System.out.println("Valor a receber: " + calcularValorReceber());
    }
}
