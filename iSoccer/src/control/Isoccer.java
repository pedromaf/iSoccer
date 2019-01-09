package control;

import view.*;

public class Isoccer {

    private static Isoccer instance;

    private Login admin = Login.getInstance();

    private Isoccer() {}

    public static Isoccer getInstance() {

        if(instance == null) {
            instance = new Isoccer();
        }

        return instance;
    }

    public void entrar() {

        String usuario;
        String senha;

        Console.solicitarUsuario();
        usuario = Input.lerString();

        Console.solicitarSenha();
        senha = Input.lerString();

        if(admin.autenticarUsuario(usuario)) {
            if(admin.autenticarSenha(senha)) {
                menuPrincipal();
            } else {
                Erro.senhaInvalida();
            }
        } else {
            Erro.usuarioInvalido();
        }
    }

    private void menuPrincipal() {

        Console.menuPrincipal();
    }
}
