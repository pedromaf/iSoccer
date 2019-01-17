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
        System.out.println("[4] Alterar estado de pagamento de socio-torcedor");
        System.out.println("[5] Gerenciar recursos");
        System.out.println("[6] Solicitar relatorio");
        System.out.println("[7] Sair");

        digiteOpcao();
    }

    public static void mostrar(String informacao) {

        System.out.println(informacao);
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


    //SOLICITAR DADOS PESSOAIS
    public static void solicitarNome() {

        System.out.println("Digite o nome completo:");
    }

    public static void solicitarEmail() {

        System.out.println("Digite o email:");
    }

    public static void solicitarCpf() {

        System.out.println("Digite o CPF:");
    }

    public static void solicitarTelefone() {

        System.out.println("Digite o telefone:");
    }

    public static void solicitarEndereco() {

        System.out.println("Digite o endereco:");
    }

    public static void solicitarCrm() {

        System.out.println("Digite o CRM:");
    }

    public static void solicitarNumeroHabilitacao() {

        System.out.println("Digite o numero da habilitacao:");
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

    public static void solicitarSalario() {

        System.out.println("Digite o salario do funcionario:");
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


    //ADD SOCIOTORCEDOR
    public static void solicitarTipoSocio() {

        System.out.println("Qual o tipo de sociotorcedor?");
        System.out.println("[1] Junior");
        System.out.println("[2] Senior");
        System.out.println("[3] Elite");

        digiteOpcao();
    }

    public static void sociotorcedorAdicionado() {

        System.out.println("Sociotorcedor adicionado!");
    }


    //SOCIOSTORCEDORES
    public static void menuAlterarValorContribuicao() {

        System.out.println("\n\t\t[Alterar Contribuicao]\n");
        System.out.println("[1] Junior");
        System.out.println("[2] Senior");
        System.out.println("[3] Elite");
        System.out.println("[4] Voltar");

        digiteOpcao();
    }

    public static void solicitarNovoValorContribuicao() {

        System.out.println("Digite o novo valor de contribuicao:");
    }

    public static void valorContribuicaoAlterado(int opcao) {

        String tipoSocio;
        if(opcao == 1) {
            tipoSocio = "Junior";
        } else if(opcao == 2) {
            tipoSocio = "Senior";
        } else {
            tipoSocio = "Elite";
        }

        System.out.println("Valor de contribuicao " + tipoSocio + " alterado!");
    }

    public static void estadoDePagamentoAlterado() {

        System.out.println("Estado de pagamento alterado!");
    }


    //GERENCIAR RECURSOS
    public static void menuGerenciarRecursos() {

        System.out.println("\n\t\t[Recursos Fisicos]\n");
        System.out.println("[1] Onibus");
        System.out.println("[2] Estadio");
        System.out.println("[3] Centro de treinamento");
        System.out.println("[4] Voltar");

        digiteOpcao();
    }

    public static void onibusDisponiveis(int size) {

        if(size == 0) {
            System.out.println("Nao ha onibus disponivel.");
        }else if(size == 1) {
            System.out.println("Ha " + size + " onibus disponivel.");
        } else {
            System.out.println("Ha " + size + " onibus disponiveis.");
        }
    }

    public static void menuOnibus() {

        System.out.println("\n\t\t[Onibus]\n");
        System.out.println("[1] Adicionar onibus");
        System.out.println("[2] Alterar disponibilidade");
        System.out.println("[3] Voltar");

        digiteOpcao();
    }

    public static void solicitarIdentificacaoAdicionar() {

        System.out.println("Digite uma identificacao para este recurso:");
    }

    public static void solicitarPlaca() {

        System.out.println("Digite a placa do onibus:");
    }

    public static void onibusAdicionado() {

        System.out.println("Onibus adicionado!");
    }

    public static void solicitarIdentificacaoBuscar() {

        System.out.println("Digite a identificacao do recurso desejado");
    }

    public static void disponibilidadeAlterada() {

        System.out.println("Disponibilidade alterada!");
    }

    public static void menuEstadioIndisponivel() {

        System.out.println("\n\t\t[Estadio]\n");
        System.out.println("Estadio indisponivel.\n");
        System.out.println("[1] Adicionar estadio");
        System.out.println("[2] Voltar");

        digiteOpcao();
    }

    public static void menuEstadioDisponivel(int torcedores, int banheiros, int lanchonetes) {

        System.out.println("\n\t\t[Estadio]\n");
        System.out.println("Capacidade de torcedores: " + torcedores + ".");
        System.out.println("Quantidade de banheiros: " + banheiros + ".");
        System.out.println("Quantidade de lanchonetes: " + lanchonetes + ".\n");
        System.out.println("[1] Alterar capacidade de torcedores");
        System.out.println("[2] Alterar quantidade de banheiros");
        System.out.println("[3] Alterar quantidade de lanchonetes");
        System.out.println("[4] Voltar");


        digiteOpcao();
    }

    public static void solicitarNovoValor() {

        System.out.println("Digite o novo valor:");
    }

    public static void solicitarNumeroTorcedores() {

        System.out.println("Digite o numero de torcedores suportados:");
    }

    public static void solicitarNumeroBanheiros() {

        System.out.println("Digite o numero de banheiros:");
    }

    public static void solicitarNumeroLanchonetes() {

        System.out.println("Digite o numero de lanchonetes:");
    }

    public static void estadioAdicionado() {

        System.out.println("Estadio adicionado!");
    }

    public static void informacoesCentroTreinamento(int numeroDormitorios) {

        System.out.println("\n\t\t[Centro de Treinamento]\n");
        System.out.println("Numero de dormitorios: " + numeroDormitorios + ".");
    }

    public static void menuCentroTreinamento() {

        System.out.println("\n\t\t[Centro de Treinamento]\n");
        System.out.println("Centro de treinamento indisponivel.\n");
        System.out.println("[1] Adicionar centro de treinamento");
        System.out.println("[2] Voltar");

        digiteOpcao();
    }

    public static void solicitarNumeroDormitorios() {

        System.out.println("Digite o numero de dormitorios:");
    }

    public static void centroTreinamentoAdicionado() {

        System.out.println("Centro de treinamento adicionado!");
    }
}
