package model;

public class Funcionario implements Relatorio{

    public enum Cargo {
        PRESIDENTE, MEDICO, TECNICO, PREPARADORFISICO, MOTORISTA, COZINHEIRO, ADVOGADO, JOGADOR
    }

    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private double salario;
    private Cargo cargo;

    public Funcionario(String nome, String email, String cpf, String telefone, double salario, int cargo) {

        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        this.cargo = getCargoPorNumero(cargo);
    }

    public Cargo getCargoPorNumero(int cargo) {

        switch(cargo) {
            case 1:
                return Cargo.PRESIDENTE;
            case 2:
                return Cargo.MEDICO;
            case 3:
                return Cargo.TECNICO;
            case 4:
                return Cargo.PREPARADORFISICO;
            case 5:
                return Cargo.MOTORISTA;
            case 6:
                return Cargo.COZINHEIRO;
            case 7:
                return Cargo.ADVOGADO;
            case 8:
            default:
                return Cargo.JOGADOR;
        }
    }

    public void relatorio() {

        //TODO
    }
}
