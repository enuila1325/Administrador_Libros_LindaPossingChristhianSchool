package protitipo_aplicacion_innovatec;

import java.util.ArrayList;

public class Maestro {

    private String nombre;
    private int id;
    private String cargo;
    private String correo;
    private String horario;
    private String contacto1;
    private String contacto2;
    private ArrayList<Libro> librosEnPrestamo = new ArrayList<>();

    public Maestro() {
    }

    public Maestro(String nombre, int id, String cargo) {
        this.nombre = nombre;
        this.id = id;
        this.cargo = cargo;
    }

    public Maestro(String nombre, int id, String cargo, String correo, String horario, String contacto1, String contacto2) {
        this.nombre = nombre;
        this.id = id;
        this.cargo = cargo;
        this.correo = correo;
        this.horario = horario;
        this.contacto1 = contacto1;
        this.contacto2 = contacto2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Libro> getLibrosEnPrestamo() {
        return librosEnPrestamo;
    }

    public void setLibrosEnPrestamo(ArrayList<Libro> librosEnPrestamo) {
        this.librosEnPrestamo = librosEnPrestamo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getContacto1() {
        return contacto1;
    }

    public void setContacto1(String contacto1) {
        this.contacto1 = contacto1;
    }

    public String getContacto2() {
        return contacto2;
    }

    public void setContacto2(String contacto2) {
        this.contacto2 = contacto2;
    }
    
    

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", id: " + id;
    }

}
