package model;

public class Gerente extends Funcionario {

    private String equipe;
    private float bonusGer;
    
    public String getEquipe() {
        return equipe;
    }
    
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
    
    public float getBonusGer() {
        return bonusGer;
    }
    
    public void setBonus(float bonusGer) {
        this.bonusGer = bonusGer;
    }
    

    
    public Gerente(String nome, int matricula, float valorHora, float horasTrab, String equipe, float bonusGer) {
        super(nome, matricula, valorHora, horasTrab);
        this.equipe = equipe;
        this.bonusGer = bonusGer;
    }
    
    public Gerente() {}

    @Override
    public void calcularSal() {
        System.out.println("Salário: " +( valorHora * horasTrab + bonusGer));
    }

    @Override
    public void trabalhar() {
        System.out.println("O gerente está gerenciando a sua equipe no projeto Zeta");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("O projeto Zeta está 75% pronto");
    }

    @Override
    public String toString() {
        return super.toString() + "\nBônus anual: " + bonusGer + "\nEquipe sob gerencia: " + equipe;
    }
    
}
