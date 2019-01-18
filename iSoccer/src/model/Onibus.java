package model;

import view.Console;

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
        super.relatorio();
        Console.mostrar("Placa: " + this.placa);
        if(this.disponivel) {
            Console.mostrar("Onibus disponivel para uso.");
        } else {
            Console.mostrar("Onibus indisponivel para uso.");
        }
    }
}
