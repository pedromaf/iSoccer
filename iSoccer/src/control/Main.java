package control;

import view.*;

public class Main {

    public static void main(String[] args) {

        Isoccer iSoccer = Isoccer.getInstance();

        boolean sair = false;

        do {
            Console.menuLogin();
            try {
                if(Input.validarOperacaoBinaria()) {
                    iSoccer.entrar();
                } else {
                    sair = true;
                }
            } catch(NumberFormatException exception) {
                Erro.entradaInvalida();
            }
        } while(!sair);
    }
}
