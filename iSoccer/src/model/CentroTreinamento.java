package model;

public class CentroTreinamento extends RecursoFisico {

    private int numeroDormitorios;

    public CentroTreinamento(String identificacao, int numeroDormitorios) {
        super(identificacao);
        this.numeroDormitorios = numeroDormitorios;
    }



    @Override
    public void relatorio() {

        //TODO
    }

    public int getNumeroDormitorios() {
        return numeroDormitorios;
    }
}
