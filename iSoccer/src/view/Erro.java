package view;

public class Erro {

    //GERAL
    public static void opcaoInvalida(int limite1, int limite2) {

        System.out.println("Opcao invalida! Digite valores entre " + limite1 + " e " + limite2 + ".");
    }

    public static void entradaInvalida() {

        System.out.println("Entrada invalida! Tente novamente.");
    }


    //LOGIN
    public static void usuarioInvalido() {

        System.out.println("Usuario invalido!");
    }

    public static void senhaInvalida() {

        System.out.println("Senha invalida!");
    }


    //SOCIOTORCEDOR
    public static void socioNaoEncontrado() {

        System.out.println("Nenhum socio-torcedor encontrado com este CPF!");
    }

    public static void naoHaSociosCadastrados() {

        System.out.println("Nao ha socios-torcedores cadastrados!");
    }

    public static void identificacaoInvalida() {

        System.out.println("Identificacao invalida!");
    }


    //JOGADOR
    public static void jogadorNaoEncontrado() {

        System.out.println("Jogador nao encontrado!");
    }
}
