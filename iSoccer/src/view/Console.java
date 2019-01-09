package view;

public class Console {

    //GERAL
    public static void digiteOpcao() {

        System.out.println("\nDigite a opcao:");
    }

    public static void menuPrincipal() {

        System.out.println("\t\t[Menu Principal]\n");
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

        System.out.println("\t\t[iSoccer]\n");

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
}
