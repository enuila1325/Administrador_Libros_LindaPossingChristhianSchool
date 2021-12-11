package protitipo_aplicacion_innovatec;

import java.util.Date;

public class Prestamo {

    private int idSolictante;
    private String codBarrasLibroPrestado;
    private Date fechaDevolucionMaxima;
    private Date fechaDevolucion;
    private int idEntrega;
    private String tipoSolicitante;

    public Prestamo() {
    }

    public Prestamo(int idSolictante, String codBarrasLibroPrestado, Date fechaDevolucionMaxima, Date fechaDevolucion, int idEntrega, String tipoSolicitante) {
        this.idSolictante = idSolictante;
        this.codBarrasLibroPrestado = codBarrasLibroPrestado;
        this.fechaDevolucionMaxima = fechaDevolucionMaxima;
        this.fechaDevolucion = fechaDevolucion;
        this.idEntrega = idEntrega;
        this.tipoSolicitante = tipoSolicitante;
    }

    public int getIdSolictante() {
        return idSolictante;
    }

    public void setIdSolictante(int idSolictante) {
        this.idSolictante = idSolictante;
    }

    public String getCodBarrasLibroPrestado() {
        return codBarrasLibroPrestado;
    }

    public void setCodBarrasLibroPrestado(String codBarrasLibroPrestado) {
        this.codBarrasLibroPrestado = codBarrasLibroPrestado;
    }

    public Date getFechaDevolucionMaxima() {
        return fechaDevolucionMaxima;
    }

    public void setFechaDevolucionMaxima(Date fechaDevolucionMaxima) {
        this.fechaDevolucionMaxima = fechaDevolucionMaxima;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }

    public String getTipoSolicitante() {
        return tipoSolicitante;
    }

    public void setTipoSolicitante(String tipoSolicitante) {
        this.tipoSolicitante = tipoSolicitante;
    }

}
