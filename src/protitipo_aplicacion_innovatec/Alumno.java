package protitipo_aplicacion_innovatec;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private String id;
    private int grado;
    private ArrayList<Libro> librosEnPrestamo = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(String nombre, String id, int grado) {
        this.nombre = nombre;
        this.id = id;
        this.grado = grado;
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

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public ArrayList<Libro> getLibrosEnPrestamo() {
        return librosEnPrestamo;
    }

    public void setLibrosEnPrestamo(ArrayList<Libro> librosEnPrestamo) {
        this.librosEnPrestamo = librosEnPrestamo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", id: " + id + ", grado: " + grado;
    }

}
