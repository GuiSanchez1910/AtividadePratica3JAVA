package model;

public class Estagiario extends Funcionario {
    
    private String supervisor;
    private float axlEst;
    
    public String getSupervisor() {
        return supervisor;
    }
    
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    
    public float getAxlEst() {
        return axlEst;
    }
    
    public void setAxlEst(float axlEst) {
        this.axlEst = axlEst;
    }
    
    public Estagiario(String nome, int matricula, float valorHora, float horasTrab, String supervisor, float axlEst) {
        super(nome, matricula, valorHora, horasTrab);
        this.supervisor = supervisor;
        this.axlEst = axlEst;
    }
    
    public Estagiario() {}

    @Override
    public void calcularSal() {
        System.out.println("Salário: " + (valorHora * horasTrab + axlEst));
    }

    @Override
    public void trabalhar() {
        System.out.println("O estagiário está ajudando seu supervisor no projeto Zeta");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("O estagiário está tendo ótimos resultados");
    }

    @Override
    public String toString() {
        return super.toString() + "\nSupervisor: " + supervisor + "\nAuxilio estudante: " + axlEst;
    }
}
