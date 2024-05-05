import controller.*;
import model.*;

public class Sistema {
 
    public static void executar() {

        int op;

        do {
            
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);
    }

    private static void exibirMenu() {
        
        System.out.println("\nSELECIONE");
        System.out.println("1) Adicionar Funcionário");
        System.out.println("2) Excluir Funcionario");
        System.out.println("3) Listar Funcionários");
        System.out.println("4) Buscar funcionário");
        System.out.println("0) Sair");
        System.out.print("Selecione: ");
    }

    private static void verificarOpcao(int op) {

        switch (op) {
            case 1:
                cadastrarFuncionario();
            break;

            case 2:
                excluirFuncionarios();
            break;

            case 3:
                listarFuncionarios();
            break;

            case 4:
                buscarFuncionario();
            break;

            case 0:
                System.out.println("\nSistema encerrado...");
            break;
        
            default:
                System.out.println("\nOpção inválida...");
            break;
        }
    }

    private static void excluirFuncionarios() {
        
        if(ListaFunc.listaVazia()) {
        }

        else{
            System.out.println("\nEXCLUIR FUNCIONÁRIO");
            System.out.print("Digite a matrícula do funcionário que deseja excluir: ");
            int matricula = Console.lerInt();

            if(ListaFunc.excluir(matricula)) {
                System.out.println("\nFuncionário " + matricula + " excluido...");
            }
            else{
                System.out.println("\nFuncionário " + matricula + " não econtrado...");
            }
        }
    }

    private static void listarFuncionarios() {
        
        if(ListaFunc.listaVazia()) {
        }    

        else{
            System.out.println("\nFUNCIONÁRIOS CADASTRADOS\n");
            for (Funcionario temp : ListaFunc.getFuncionarios()) {
                System.out.println(temp);
                temp.calcularSal();
                temp.trabalhar();
                temp.relatarProgresso();
                System.out.println("");
            }
        }
    }

    private static void cadastrarFuncionario() {

        String nome;
        int matricula;
        float valorHora;
        float horasTrab;
        float axlEst;
        String supervisor;
        int i;

        do{
            System.out.println("\nTIPO DE FUNCIONÁRIO");
            System.out.println("1) Gerente");
            System.out.println("2) Desenvolvedor");
            System.out.println("3) Estagiário");
            System.out.println("0) Sair");
            System.out.print("Selecione: ");
            i = Console.lerInt();
                    

        if(i == 1){
            System.out.println("\nCADASTRAR GERENTE");
            System.out.print("Nome: ");    
            nome = Console.lerString();

            while(true) {

                System.out.print("Matrícula: ");
                matricula = Console.lerInt();
    
                if(ListaFunc.matriculaDuplicada(matricula) != null) {
                    System.out.println("\nFuncionário " + matricula + " já esta cadastrado o sistema\n");
                } 
                
                else{
                    break;
                }
            }

            System.out.print("Valor da hora trabalhada: ");
            valorHora = Console.lerFloat();
            System.out.print("Horas trabalhadas: ");
            horasTrab = Console.lerFloat();
            System.out.print("Bonus do gerente: ");
            float bonusGer = Console.lerFloat();
            System.out.print("Equipe: ");
            String equipe = Console.lerString();

            Gerente g = new Gerente(nome, matricula, valorHora, horasTrab, equipe, bonusGer);

            ListaFunc.adicionar(g);

            System.out.println("\nGerente cadastrado com sucesso...\n");

            break;
        }

        else if(i == 2){
                System.out.println("\nCADASTRAR DESENVOLVEDOR");
                System.out.print("Nome: ");    
                nome = Console.lerString();

                while(true) {

                    System.out.print("Matrícula: ");
                    matricula = Console.lerInt();
        
                    if(ListaFunc.matriculaDuplicada(matricula) != null) {
                        System.out.println("\nFuncionário " + matricula + " já esta cadastrado o sistema\n");
                    } 
                    
                    else{
                        break;
                    }
                }

                System.out.print("Valor da hora trabalhada: ");
                valorHora = Console.lerFloat();
                System.out.print("Horas trabalhadas: ");
                horasTrab = Console.lerFloat();
                System.out.print("Bônus de desevolvedor: ");
                float bonusDev = Console.lerFloat();
                System.out.print("Tecnologia dominante: ");
                String tecnDom = Console.lerString();

                Desenvolvedor d = new Desenvolvedor(nome, matricula, valorHora, horasTrab, tecnDom, bonusDev);

                ListaFunc.adicionar(d);

                System.out.println("\nDesenvolvedor cadastrado com sucesso...\n");

                break;
        }

        else if(i == 3){
                System.out.println("\nCADASTRAR ESTAGIÁRIO");
                System.out.print("Nome: ");    
                nome = Console.lerString();
                
                while(true) {

                    System.out.print("Matrícula: ");
                    matricula = Console.lerInt();
        
                    if(ListaFunc.matriculaDuplicada(matricula) != null) {
                        System.out.println("\nFuncionário " + matricula + " já esta cadastrado o sistema\n");
                    } 
                    
                    else{
                        break;
                    }
                }

                System.out.print("Valor da hora trabalhada: ");
                valorHora = Console.lerFloat();
                System.out.print("Horas trabalhadas: ");
                horasTrab = Console.lerFloat();
                System.out.print("Auxílio estudante: ");
                axlEst = Console.lerFloat();
                System.out.print("Supervisor: ");
                supervisor = Console.lerString();
                
            
                Estagiario e = new Estagiario(nome, matricula, valorHora, horasTrab, supervisor, axlEst);

                ListaFunc.adicionar(e);

                System.out.println("\nEstagiário cadastrado com sucesso...\n");
                
                break;
            }
        
        else if((i < 1 && i != 0) || i > 3) {
            System.out.println("\nDigite uma opção válida...");
        }
        }while(i != 0);
    }

    private static void buscarFuncionario() {

        if(ListaFunc.listaVazia()) {
        }
        else{
            System.out.println("\nBUSCAR FUNCIONÁRIO");
            System.out.print("Digite o número da matrícula do funcionário: ");
            int matricula = Console.lerInt();

            if(ListaFunc.buscar(matricula)) {
                System.out.println("\nFuncionário encontrado com sucesso");
            }
            else{
                System.out.println("\nFuncionário " + matricula + " não cadastrado");
            }
        }
    }        
}
