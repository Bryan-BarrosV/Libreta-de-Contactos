package ec.edu.ups.poo.clases;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Familiar extends Persona {
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;


    public Familiar(String cedula, String nombre, String apellido, String direccion, String parentesco, String tipoDeSangre, GregorianCalendar fechaDeNacimiento) {
        super(cedula, nombre, apellido, direccion);
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public double calcularEdad(){
        Calendar actual=new GregorianCalendar();
        //Obtener año,mes y dia actuales
        int añoA=actual.get(Calendar.YEAR);
        int mesA = actual.get(Calendar.MONTH);
        int diaA=actual.get(Calendar.DAY_OF_MONTH);
        // Obtener año y mes de nacimiento
        int añoNacimiento = fechaDeNacimiento.get(Calendar.YEAR);
        int mesNacimiento = fechaDeNacimiento.get(Calendar.MONTH);
        int diaNacimiento = fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);
        // Calcular edad
        int edad = añoA - añoNacimiento;
        //Ajuste de datos
        if (mesA < mesNacimiento ||
                (mesA == mesNacimiento && diaA < diaNacimiento)) {
            edad--;
        }
        return edad;
}
    @Override
    public String toString() {
        String personaInfo = super.toString();
        return personaInfo +
                "\n\t Parentesco: " + parentesco +
                ",\n\t Tipo de Sangre: " + tipoDeSangre +
                ",\n\t Edad: " + calcularEdad(); //
    }
}
