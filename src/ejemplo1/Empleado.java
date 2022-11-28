package ejemplo1;

public class Empleado extends Persona {
    private  static String tipoPersona="Empleado";
    private double sueldo;

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(String tipoPersona, double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, String apellido1, String apellido2, String sexo, double sueldo) {
        super(nombre, apellido1, apellido2, sexo);
        this.sueldo = sueldo;
    }

    public Empleado(){
    }

    @Override
    public String toString() {
        return super.toString()+ "Tipo de rol: " + tipoPersona + '\n' +
                "Sueldo:" + sueldo +'\n';
    }
}
