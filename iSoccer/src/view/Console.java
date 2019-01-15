package view;

public class Console {

    //GERAL
    public static void digiteOpcao() {

        System.out.println("\nDigite a opcao:");
    }

    public static void menuPrincipal() {

        System.out.println("\n\t\t[Menu Principal]\n");
        System.out.println("[1] Adicionar funcionario");
        System.out.println("[2] Adicionar socio-torcedor");
        System.out.println("[3] Alterar valores de contribuicao");
        System.out.println("[4] Gerenciar recursos");
        System.out.println("[5] Solicitar relatorio");
        System.out.println("[6] Sair");

        digiteOpcao();
    }


    //LOGIN
    public static void menuLogin() {

        System.out.println("\n\t\t[iSoccer]\n");

        System.out.println("[1] Entrar");
        System.out.println("[2] Fechar");

        digiteOpcao();
    }

    public static void solicitarUsuario() {

        System.out.println("Digite o usuario:");
    }

    public static void solicitarSenha() {

        System.out.println("Digite a senha:");
    }


    //ADD FUNCIONARIO
    public static void menuAdicionarFuncionario() {

        System.out.println("\n\t\t[Adicionar Funcionario]\n");
        System.out.println("[1] Presidente");
        System.out.println("[2] Medico");
        System.out.println("[3] Tecnico");
        System.out.println("[4] Preparador fisico");
        System.out.println("[5] Motorista");
        System.out.println("[6] Cozinheiro");
        System.out.println("[7] Advogado");
        System.out.println("[8] Joagador");
        System.out.println("[9] Voltar");

        digiteOpcao();
    }

    public static void solicitarNome() {

        System.out.println("Digite o nome completo do funcionario:");
    }

    public static void solicitarEmail() {

        System.out.println("Digite o email do funcionario:");
    }

    public static void solicitarCpf() {

        System.out.println("Digite o CPF do funcionario:");
    }

    public static void solicitarTelefone() {

        System.out.println("Digite o telefone do funcionario:");
    }

    public static void solicitarSalario() {

        System.out.println("Digite o salario do funcionario:");
    }

    public static void solicitarCrm() {

        System.out.println("Digite o CRM do funcionario:");
    }

    public static void solicitarNumeroHabilitacao() {

        System.out.println("Digite o numero da habilitacao do funcionario:");
    }

    public static void solicitarTipoJogador() {

        System.out.println("Qual o tipo do jogador?");
        System.out.println("[1] Volante");
        System.out.println("[2] Zagueiro");
        System.out.println("[3] Meia");
        System.out.println("[4] Goleiro");
        System.out.println("[5] Atacante");
        System.out.println("[6] Lateral esquerdo");
        System.out.println("[7] Lateral direito");

        digiteOpcao();
    }

    public static void funcionarioAdicionado() {

        System.out.println("Funcionario adicionado!");
    }
}
