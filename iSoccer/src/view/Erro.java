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
}
