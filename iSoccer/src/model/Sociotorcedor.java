package model;

import view.Console;

public class Sociotorcedor implements Relatorio{

    public enum Tipo {
        JUNIOR, SENIOR, ELITE
    }

    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String endereco;
    private Tipo tipo;
    private boolean inadimplente;

    public Sociotorcedor(String nome, String email, String cpf, String telefone, String endereco, int tipo) {

        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipo = getTipoPorNumero(tipo);
        this.inadimplente = false;
    }

    public boolean getInadimplente() {

        return this.inadimplente;
    }

    public void alterarInadimplencia() {

        this.inadimplente = !this.inadimplente;
    }

    public String getCpf() {

        return cpf;
    }

    private Tipo getTipoPorNumero(int tipo) {

        switch(tipo) {
            case 1:
                return Tipo.JUNIOR;
            case 2:
                return Tipo.SENIOR;
            case 3:
            default:
                return Tipo.ELITE;
        }
    }

    private String getTipoString() {

        switch(tipo) {
            case JUNIOR:
                return "Junior";
            case SENIOR:
                return "Senior";
            case ELITE:
            default:
                return "Elite";
        }
    }

    @Override
    public void relatorio() {
        Console.mostrar("Nome: " + this.nome);
        Console.mostrar("Email: " + this.email);
        Console.mostrar("CPF: " + this.cpf);
        Console.mostrar("Telefone: " + this.telefone);
        Console.mostrar("Endereco: " + this.endereco);
        Console.mostrar("Tipo: " + getTipoString());
        if(this.inadimplente) {
            Console.mostrar("Estado de pagamento: inadimplente");
        } else {
            Console.mostrar("Estado de pagamento: adimplente");
        }
    }
}
