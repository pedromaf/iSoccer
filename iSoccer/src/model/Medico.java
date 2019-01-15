package model;

public class Medico extends Funcionario {

    String crm;

    public Medico(String nome, String email, String cpf, String telefone, double salario, int cargo, String crm) {
        super(nome,email,cpf,telefone,salario,cargo);
        this.crm = crm;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        //TODO
    }
}
