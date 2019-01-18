package model;

import view.Console;

public class Estadio extends RecursoFisico {

    private int numeroTorcedores;
    private int numeroBanheiros;
    private int numeroLanchonetes;

    public Estadio(String identificacao, int numeroTorcedores, int numeroBanheiros, int numeroLanchonetes) {
        super(identificacao);
        this.numeroTorcedores = numeroTorcedores;
        this.numeroBanheiros = numeroBanheiros;
        this.numeroLanchonetes = numeroLanchonetes;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        Console.mostrar("Capacidade de torcedores: " + this.numeroTorcedores);
        Console.mostrar("Numero de banheiros: " + this.numeroBanheiros);
        Console.mostrar("Numero de lanchonetes: " + this.numeroLanchonetes);

    }

    public void setNumeroTorcedores(int numeroTorcedores) {

        this.numeroTorcedores = numeroTorcedores;
    }

    public void setNumeroBanheiros(int numeroBanheiros) {

        this.numeroBanheiros = numeroBanheiros;
    }

    public void setNumeroLanchonetes(int numeroLanchonetes) {

        this.numeroLanchonetes = numeroLanchonetes;
    }

    public int getNumeroTorcedores() {

        return this.numeroTorcedores;
    }

    public int getNumeroBanheiros() {

        return numeroBanheiros;
    }

    public int getNumeroLanchonetes() {

        return numeroLanchonetes;
    }
}
