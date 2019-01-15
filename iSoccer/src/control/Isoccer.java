package control;

import model.*;
import view.*;

import java.util.ArrayList;

public class Isoccer {

    private static Isoccer instance;

    private Login admin;
    private ArrayList<Funcionario> listaFuncionarios;

    private Isoccer() {
        this.admin = Login.getInstance();
        this.listaFuncionarios = new ArrayList<>();
    }

    public static Isoccer getInstance() {

        if(instance == null) {
            instance = new Isoccer();
        }

        return instance;
    }

    public void entrar() {

        String usuario;
        String senha;

        Console.solicitarUsuario();
        usuario = Input.lerString();

        Console.solicitarSenha();
        senha = Input.lerString();

        if(admin.autenticarUsuario(usuario)) {
            if(admin.autenticarSenha(senha)) {
                menuPrincipal();
            } else {
                Erro.senhaInvalida();
            }
        } else {
            Erro.usuarioInvalido();
        }
    }

    private void menuPrincipal() {

        int opcao;
        boolean voltar = false;

        do {
            Console.menuPrincipal();
            try {
                opcao = Input.validarOpcao(1,6);

                switch(opcao) {
                    case 1:
                        adicionarFuncionario();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                    default:
                        voltar = true;
                }
            } catch(NumberFormatException exception) {
                Erro.entradaInvalida();
            }

        }while(!voltar);
    }

    private void adicionarFuncionario() {

        int cargo = 0;
        boolean entradaValida = false;
        boolean solicitarDados = true;

        do {
            Console.menuAdicionarFuncionario();
            try {
                cargo = Input.validarOpcao(1,9);
                if(cargo == 9) { //VOLTAR
                    solicitarDados = false;
                }
                entradaValida = true;
            } catch(NumberFormatException exception) {
                Erro.entradaInvalida();
            }
        }while(!entradaValida);

        entradaValida = false;

        if(solicitarDados) {

            String nome;
            String email;
            String cpf;
            String telefone;
            double salario = 0;

            Console.solicitarNome();
            nome = Input.lerString();

            Console.solicitarEmail();
            email = Input.lerString();

            Console.solicitarCpf();
            cpf = Input.lerString();

            Console.solicitarTelefone();
            telefone = Input.lerString();

            do {
                Console.solicitarSalario();
                try {
                    salario = Input.lerDouble();
                    entradaValida = true;
                } catch(NumberFormatException exception) {
                    Erro.entradaInvalida();
                }
            } while(!entradaValida);

            if(cargo == 2) { //MEDICO
                Console.solicitarCrm();
                String crm = Input.lerString();
                this.listaFuncionarios.add(new Medico(nome,email,cpf,telefone,salario,cargo, crm));
            } else if(cargo == 5) { //MOTORISTA
                Console.solicitarNumeroHabilitacao();
                String habilitacao = Input.lerString();
                this.listaFuncionarios.add(new Motorista(nome,email,cpf,telefone,salario,cargo,habilitacao));
            } else if(cargo == 8) { //JOGADOR
                entradaValida = false;
                int tipo = 0;
                do {
                    Console.solicitarTipoJogador();
                    try {
                        tipo = Input.validarOpcao(1,7);
                        entradaValida = true;
                    } catch(NumberFormatException exception) {
                        Erro.entradaInvalida();
                    }
                }while(!entradaValida);
                this.listaFuncionarios.add(new Jogador(nome,email,cpf,telefone,salario,cargo,tipo));
            } else {
                this.listaFuncionarios.add(new Funcionario(nome,email,cpf,telefone,salario,cargo));
            }

            Console.funcionarioAdicionado();
        }
    }
}















