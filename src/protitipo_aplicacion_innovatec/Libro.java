package protitipo_aplicacion_innovatec;

public class Libro {

    private String barCode;
    private String nombre;
    private String materia;
    private String descripcion;
    private int grado;

    public Libro() {
    }

    public Libro(String barCode, String nombre, String materia, String descripcion, int grado) {
        this.barCode = barCode;
        this.nombre = nombre;
        this.materia = materia;
        this.descripcion = descripcion;
        this.grado = grado;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Codigo de Barras=" + barCode + ", Titulo del Libro=" + nombre + ", materia=" + materia + ", descripcion=" + descripcion;
    }

}
