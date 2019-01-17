package model;

public class Onibus extends RecursoFisico {

    private String placa;
    private boolean disponivel;

    public Onibus(String identificacao, String placa) {
        super(identificacao);
        this.placa = placa;
        this.disponivel = true;
    }

    public void alterarDisponibilidade() {

        this.disponivel = !this.disponivel;
    }

    public boolean getDisponivel() {

        return this.disponivel;
    }

    @Override
    public void relatorio() {
        //TODO
    }
}
