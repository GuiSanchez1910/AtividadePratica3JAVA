package model;

public class Desenvolvedor extends Funcionario {

    private String tecnDom;
    private float bonusDev;
    
    public String getTecnDom() {
        return tecnDom;
    }
    public void setTecnDom(String tecnDom) {
        this.tecnDom = tecnDom;
    }
    public float getBonusDev() {
        return bonusDev;
    }
    public void setBonusDev(float bonusDev) {
        this.bonusDev = bonusDev;
    }
    public Desenvolvedor(String nome, int matricula, float valorHora, float horasTrab, String tecnDom, float bonusDev) {
        super(nome, matricula, valorHora, horasTrab);
        this.tecnDom = tecnDom;
        this.bonusDev = bonusDev;
    }
    public Desenvolvedor() {
    }

    @Override
    public void calcularSal() {
        System.out.println("Salário: " + (valorHora * horasTrab + bonusDev));
    }

    @Override
    public void trabalhar() {
        System.out.println("O desenvolvedor está trabalhando na tela de login do projeto Zeta");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("O processo da tela de login está 90% pronto");
    }

    @Override
    public String toString() {
        return super.toString() + "\nTecnologias dominadas: " + tecnDom + "\nBônus desenvolvedor: " + bonusDev;
    }
}