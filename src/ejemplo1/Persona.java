package ejemplo1;

public class Persona {
    private static int idPersona;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String sexo;

    public Persona(){
        idPersona+=1;
    }

    public Persona(String nombre, String apellido1, String apellido2, String sexo) {
        this();
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.sexo = sexo;
    }

    public static int getIdPersona() {
        return idPersona;
    }

    public static void setIdPersona(int idPersona) {
        Persona.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "\nId persona: " + idPersona + '\n' +
                "Nombre: " + nombre + '\n' +
                "Apellido 1: " + apellido1 + '\n' +
                "Apellido 2: " + apellido2 + '\n' +
                "Sexo=: " + sexo + '\n';
    }
}
