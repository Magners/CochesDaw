/**
 * Created by usu26 on 19/09/2016.
 */

public class Persona {

    private String DNI;
    private String SS;
    private String Nombre;
    private String Apellido;
    private int Edad;

    public Persona(String DNI, String SS, String nombre, String apellido, int edad) {
        this.DNI = DNI;
        this.SS = SS;
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSS() {
        return SS;
    }

    public void setSS(String SS) {
        this.SS = SS;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (Edad != persona.Edad) return false;
        if (!DNI.equals(persona.DNI)) return false;
        if (!SS.equals(persona.SS)) return false;
        if (Nombre != null ? !Nombre.equals(persona.Nombre) : persona.Nombre != null) return false;
        return Apellido != null ? Apellido.equals(persona.Apellido) : persona.Apellido == null;

    }

    @Override
    public int hashCode() {
        int result = DNI.hashCode();
        result = 31 * result + SS.hashCode();
        result = 31 * result + (Nombre != null ? Nombre.hashCode() : 0);
        result = 31 * result + (Apellido != null ? Apellido.hashCode() : 0);
        result = 31 * result + Edad;
        return result;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", SS='" + SS + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Edad=" + Edad +
                '}';
    }

}