package ejemplo1;

public class Usuario extends Persona{
    private static String tipoPersona="Usuario";
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getTipoPersona() {
        return tipoPersona;
    }

    public static void setTipoPersona(String tipoUsuario) {
        Usuario.tipoPersona = tipoUsuario;
    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Usuario(String nombre, String apellido1, String apellido2, String sexo, String username, String password) {
        super(nombre, apellido1, apellido2, sexo);
        this.username = username;
        this.password = password;
    }

    public Usuario(){

    }

    @Override
    public String toString() {
        return super.toString()+ "Tipo de rol: " + tipoPersona + '\n' +
                "Nombre usuario: " + username + '\n' +
                "Contraseña: " + password + '\n' +'\n';
    }
}
