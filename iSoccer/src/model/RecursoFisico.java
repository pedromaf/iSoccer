package model;

import view.Console;

public class RecursoFisico implements Relatorio {

    private String identificacao;

    RecursoFisico(String identificacao) {

        this.identificacao = identificacao;
    }

    public String getIdentificacao() {

        return this.identificacao;
    }

    @Override
    public void relatorio() {
        Console.mostrar("Identificacao: " + this.identificacao);
    }
}
