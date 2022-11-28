package ejemplo1;

public class Cliente extends Persona{
    private static String tipoPersona="Cliente";
    private String fechaAlta;

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Cliente(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Cliente(String nombre, String apellido1, String apellido2, String sexo, String fechaAlta) {
        super(nombre, apellido1, apellido2, sexo);
        this.fechaAlta = fechaAlta;
    }

    public Cliente(){

    }

    @Override
    public String toString() {
        return super.toString()+ "Tipo de rol: " + tipoPersona + '\n' +
                "Fecha de compra:" + fechaAlta + '\n' +'\n';
    }
}
