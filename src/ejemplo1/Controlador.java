package ejemplo1;

import java.util.ArrayList;

public class Controlador {
    static ArrayList<Persona> listaPersonas=new ArrayList<>();

    public static String  registrarEmpleado(String nombre,String apellido1,String apellido2,String sexo, double salario){
        Empleado e1=new Empleado(nombre,apellido1,apellido2,sexo,salario);
        listaPersonas.add(e1);
        return "Empleado registrado correctamente:)";
    }
    public static String registrarUsuario(String nombre,String apellido1,String apellido2,String sexo, String user, String password){
        Usuario u1=new Usuario(nombre,apellido1,apellido2,sexo,user,password);
        listaPersonas.add(u1);
        return "Usuario registrado correctamente:)";
    }
    public static String registrarCliente(String nombre,String apellido1,String apellido2,String sexo, String fecha){
        Cliente c1=new Cliente(nombre,apellido1,apellido2,sexo,fecha);
        listaPersonas.add(c1);
        return "Cliente registrado correctamente:)";
    }
    public static String listarTodos(){
        String ListaPersonas="";
        for (int i=0;i<listaPersonas.size();i++){
            ListaPersonas+=listaPersonas.get(i);
        }
        return ListaPersonas;
    }


}
