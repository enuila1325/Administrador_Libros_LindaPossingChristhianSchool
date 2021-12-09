package protitipo_aplicacion_innovatec;

import java.util.ArrayList;

public class Maestro {

    private String nombre;
    private String id;
    private String cargo;
    private ArrayList<Libro> librosEnPrestamo = new ArrayList<>();

    public Maestro() {
    }

    public Maestro(String nombre, String id, String cargo) {
        this.nombre = nombre;
        this.id = id;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", id: " + id;
    }

}
