package controller;
import java.util.ArrayList;
import java.util.List;

import model.Funcionario;

public class ListaFunc{

    private static List <Funcionario> listaFuncionarios = new ArrayList<>();

    public static void adicionar(Funcionario fun) {
        listaFuncionarios.add(fun);
    }

    public static boolean procurarMatricula(int matricula) {

        for (Funcionario temp : listaFuncionarios) {
            if(temp.getMatricula() == matricula) {
                return true;
            }
        }
        return false;
    }

    public static boolean excluir(int matricula) {

        for (Funcionario temp : listaFuncionarios) {
            if(procurarMatricula(matricula)){
                listaFuncionarios.remove(temp);
                return true;
            }
        }
        return false;
    }

    public static boolean buscar(int matricula) {

        for (Funcionario temp : listaFuncionarios) {
            
            if(procurarMatricula(matricula)) {
                System.out.println(temp);
                return true;
            }
        }
        return false;
    }

    public static List<Funcionario> getFuncionarios() {
        return listaFuncionarios;
    }
    
    public static boolean listaVazia() {

        if(ListaFunc.getFuncionarios().isEmpty()) {
            System.out.println("\nNão há funcionários cadastrados");
            return true;
        }
        return false;
    }

    public static Funcionario matriculaDuplicada(int matricula) {

        for (Funcionario temp : listaFuncionarios) {
            
            if(temp.getMatricula() == matricula){
                return temp;
            }
        }
        return null;
    }

}