package model;

import view.Console;

public class CentroTreinamento extends RecursoFisico {

    private int numeroDormitorios;

    public CentroTreinamento(String identificacao, int numeroDormitorios) {
        super(identificacao);
        this.numeroDormitorios = numeroDormitorios;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        Console.mostrar("Numero de dormitorios: " + this.numeroDormitorios);
    }

    public int getNumeroDormitorios() {
        return numeroDormitorios;
    }
}
