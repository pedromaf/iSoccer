package model;

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

    public Sociotorcedor(String nome, String email, String cpf, String telefone, String endereco, int tipo) {

        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipo = getTipoPorNumero(tipo);
    }

    public Tipo getTipoPorNumero(int tipo) {

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

    @Override
    public void relatorio() {
        //TODO
    }
}
