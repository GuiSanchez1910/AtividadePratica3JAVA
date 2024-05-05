package model;

public abstract class Funcionario{
    
    private String nome;
    private int matricula;
    protected float valorHora;
    protected float horasTrab;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    public float getHorasTrab() {
        return horasTrab;
    }
    public void setHorasTrab(float horasTrab) {
        this.horasTrab = horasTrab;
    }
    
    public Funcionario(String nome, int matricula, float valorHora, float horasTrab) {
        this.nome = nome;
        this.matricula = matricula;
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
    }

    public Funcionario() {}

    public abstract void calcularSal();

    @Override
    public String toString() {
        return "Nome: " + nome + "\nMatrílula: " + matricula + "\nHoras trabalhadas: " + horasTrab + "\nValor da hora trabalhada: " + horasTrab;
    }
}
