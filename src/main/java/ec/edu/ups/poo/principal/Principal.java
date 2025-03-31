package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[10];
        Familiar[] familiares = new Familiar[10];
        int contPersonas = 0;
        int contFamiliares = 0;
        
        while (true) {
            System.out.println("\n-------Menú de Opciones-------");
            System.out.println("1. Agregar una persona ");
            System.out.println("2. Agregar un familiar ");
            System.out.println("3. Mostrar todas las personas y familiares ");
            System.out.println("4. Salir ");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (contPersonas < personas.length) {
                        System.out.println("\nIngrese los datos de la persona:");
                        System.out.print("Cédula: ");
                        String cedulaP = scanner.nextLine();
                        System.out.print("Nombre: ");
                        String nombreP = scanner.nextLine();
                        System.out.print("Apellido: ");
                        String apellidoP = scanner.nextLine();
                        System.out.print("Dirección: ");
                        String direccionP = scanner.nextLine();
                        personas[contPersonas] = new Persona(cedulaP, nombreP, apellidoP, direccionP);
                        contPersonas++;
                        System.out.println("Persona agregada exitosamente.");
                    } else {
                        System.out.println("No se pueden agregar más personas.");
                    }
                    break;
                
                case 2:
                    if (contFamiliares < familiares.length) {
                        System.out.println("\nIngrese los datos del familiar:");
                        System.out.print("Cédula: ");
                        String cedulaF = scanner.nextLine();
                        System.out.print("Nombre: ");
                        String nombreF = scanner.nextLine();
                        System.out.print("Apellido: ");
                        String apellidoF = scanner.nextLine();
                        System.out.print("Dirección: ");
                        String direccionF = scanner.nextLine();
                        System.out.print("Parentesco: ");
                        String parentesco = scanner.nextLine();
                        System.out.print("Tipo de sangre: ");
                        String tipoDeSangre = scanner.nextLine();
                        System.out.print("Fecha de nacimiento (Año-Mes-Día): ");
                        String fechaNacimiento = scanner.nextLine();
                        String[] fechaArray = fechaNacimiento.split("-");
                        int año = Integer.parseInt(fechaArray[0]);
                        int mes = Integer.parseInt(fechaArray[1]) - 1;
                        int dia = Integer.parseInt(fechaArray[2]);
                        familiares[contFamiliares] = new Familiar(cedulaF, nombreF, apellidoF, direccionF, parentesco, tipoDeSangre, new GregorianCalendar(año, mes, dia));
                        contFamiliares++;
                        System.out.println("Familiar agregado exitosamente.");
                    } else {
                        System.out.println("No se pueden agregar más familiares.");
                    }
                    break;
                
                case 3:
                    System.out.println("\nLista de Personas:");
                    for (int i = 0; i < contPersonas; i++) {
                        System.out.println(personas[i]);
                    }
                    System.out.println("\nLista de Familiares:");
                    for (int i = 0; i < contFamiliares; i++) {
                        System.out.println(familiares[i]);
                    }
                    break;
                
                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
