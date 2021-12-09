package protitipo_aplicacion_innovatec;

public class Prestamo {

    private String idSolictante;
    private String codBarrasLibroPrestado;
    private String fechaDevolucionMaxima;
    private String fechaDevolucion;
    private String idEntrega;

    public Prestamo() {
    }

    public Prestamo(String idSolictante, String codBarrasLibroPrestado, String fechaDevolucionMaxima, String fechaDevolucion, String idEntrega) {
        this.idSolictante = idSolictante;
        this.codBarrasLibroPrestado = codBarrasLibroPrestado;
        this.fechaDevolucionMaxima = fechaDevolucionMaxima;
        this.fechaDevolucion = fechaDevolucion;
        this.idEntrega = idEntrega;
    }

    public String getIdSolictante() {
        return idSolictante;
    }

    public void setIdSolictante(String idSolictante) {
        this.idSolictante = idSolictante;
    }

    public String getCodBarrasLibroPrestado() {
        return codBarrasLibroPrestado;
    }

    public void setCodBarrasLibroPrestado(String codBarrasLibroPrestado) {
        this.codBarrasLibroPrestado = codBarrasLibroPrestado;
    }

    public String getFechaDevolucionMaxima() {
        return fechaDevolucionMaxima;
    }

    public void setFechaDevolucionMaxima(String fechaDevolucionMaxima) {
        this.fechaDevolucionMaxima = fechaDevolucionMaxima;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(String idEntrega) {
        this.idEntrega = idEntrega;
    }

}
