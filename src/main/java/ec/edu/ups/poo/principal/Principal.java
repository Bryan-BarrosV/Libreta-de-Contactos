package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar # de personas a ingresar
        System.out.print("¿Cuántas personas desea ingresar? ");
        int numPersonas = scanner.nextInt();
        scanner.nextLine();

        // Ingresar # de familiares a ingresar

        System.out.print("¿Cuántos familiares desea ingresar? ");
        int numFamiliares = scanner.nextInt();
        scanner.nextLine();

        // Ingresar personas

        for (int i = 0; i < numPersonas; i++) {
            System.out.println("\nIngrese los datos de la persona #" + (i + 1));
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();

            Persona persona = new Persona(cedula, nombre, apellido, direccion);

            // Mostrar información

            System.out.println("\nInformación de la Persona #" + (i + 1) + ":");
            System.out.println(persona.toString());
        }

        // Ingresar familiares

        for (int i = 0; i < numFamiliares; i++) {
            System.out.println("\nIngrese los datos del familiar #" + (i + 1));
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Parentesco: ");
            String parentesco = scanner.nextLine();
            System.out.print("Tipo de sangre: ");
            String tipoDeSangre = scanner.nextLine();
            System.out.print("Fecha de nacimiento (Año-Mes-Día): ");
            String fechaNacimiento = scanner.nextLine();
            String[] fechaArray = fechaNacimiento.split("-");
            int año = Integer.parseInt(fechaArray[0]);
            int mes = Integer.parseInt(fechaArray[1]);
            int dia = Integer.parseInt(fechaArray[2]);
            // usar (-) " año-mes-dia "
            GregorianCalendar fechaDeNacimiento = new GregorianCalendar(año, mes, dia);
            Familiar familiar = new Familiar(cedula, nombre, apellido, direccion, parentesco, tipoDeSangre, fechaDeNacimiento);

            // Mostrar información del familiar

            System.out.println("\nInformación del Familiar #" + (i + 1) + ":");
            System.out.println(familiar.toString());
        }

        scanner.close();
    }
}
