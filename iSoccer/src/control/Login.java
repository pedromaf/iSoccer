package control;

public class Login {

    private static Login instance;

    private String usuario;
    private String senha;

    private Login() {

        this.usuario = "isoccer";
        this.senha = "123";
    }

    public static Login getInstance() {

        if(instance == null) {
            instance = new Login();
        }

        return instance;
    }

    public boolean autenticarUsuario(String usuario) {

        return this.usuario.equals(usuario);
    }

    public boolean autenticarSenha(String senha) {

        return this.senha.equals(senha);
    }

}
