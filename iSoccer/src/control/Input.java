package control;

import view.Console;
import view.Erro;

import java.util.Scanner;

public class Input {

    private static Scanner input = new Scanner(System.in);

    //VALIDAR ENTRADAS
    public static int validarOpcao(int limite1, int limite2) {

        int operacao;

        do {
            operacao = lerInt();

            if(operacao < limite1 || operacao > limite2) {
               Erro.opcaoInvalida(limite1, limite2);
               Console.digiteOpcao();
            }

        }while(operacao < limite1 || operacao > limite2);

        return operacao;
    }

    public static boolean validarOperacaoBinaria() {

        return (validarOpcao(1,2) == 1);

    }


    //LER TIPO DE DADO ESPECIFICO
    public static String lerString() {

        return input.nextLine();
    }

    public static double lerDouble() {

        return Double.parseDouble(input.nextLine());
    }

    public static int lerInt() {

        return Integer.parseInt(input.nextLine());
    }
}