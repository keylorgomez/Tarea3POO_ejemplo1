package ejemplo1;

import java.util.Scanner;

/**
 * Debe crear un ejemplo de herencia
 * programa principal
 */

public class Main {
    /**
     * Se crea un sistema para registrar personas y dependiendo del usuario
     * se le asignan más datos. Cada una de las clases Cliente, Empleado, Usuario
     * heredan de la clase persona. Y por esto se heredan sus atributos, los cuales son requeridos para llenar los constructores
     * correspondinete a cada clase hija.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        String mensajeOpciones = "Seleccione la acción que desea realizar: \n" +
                "1) Registrar Empleado\n" +
                "2) Registrar Usuario\n" +
                "3) Registrar Cliente\n" +
                "4) Listar Personas\n" +
                "5) salir";

        do {
            System.out.println(mensajeOpciones);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Empleado();
                    break;
                case 2:
                    Usuario();
                    break;
                case 3:
                    Cliente();
                    break;
                case 4:
                    Listar();
                    break;
                case 5:
                    System.out.println("Hasta pronto!");
                    System.exit(0);
                default: System.out.println("Opción no válida");
            }
        }while (opcion!=5);

    }

    public static void Empleado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su primer apellido: ");
        String apellido1= scanner.nextLine();
        System.out.println("Ingrese su segundo apellido: ");
        String apellido2= scanner.nextLine();
        System.out.println("Ingrese su tipo de sexo: ");
        String sexo= scanner.nextLine();
        System.out.println("Ingrese el monto de su salario: ");
        double salario= scanner.nextDouble();
        String resultado=Controlador.registrarEmpleado(nombre,apellido1,apellido2,sexo,salario);
        System.out.println(resultado);
    }
    public static void Usuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su primer apellido: ");
        String apellido1= scanner.nextLine();
        System.out.println("Ingrese su segundo apellido: ");
        String apellido2= scanner.nextLine();
        System.out.println("Ingrese su tipo de sexo: ");
        String sexo= scanner.nextLine();
        System.out.println("Ingrese su nombre de usuario: ");
        String user= scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String password= scanner.nextLine();
        String resultado=Controlador.registrarUsuario(nombre,apellido1,apellido2,sexo,user,password);
        System.out.println(resultado);
    }
    public static void Cliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su primer apellido: ");
        String apellido1= scanner.nextLine();
        System.out.println("Ingrese su segundo apellido: ");
        String apellido2= scanner.nextLine();
        System.out.println("Ingrese su tipo de sexo: ");
        String sexo= scanner.nextLine();
        System.out.println("Ingrese la fecha de compra: ");
        String fecha= scanner.nextLine();
        String resultado=Controlador.registrarCliente(nombre,apellido1,apellido2,sexo,fecha);
        System.out.println(resultado);
    }
    public static void Listar(){
        String resultado=Controlador.listarTodos();
        System.out.println(resultado);
    }

}