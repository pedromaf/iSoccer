package model;

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
        //TODO
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
