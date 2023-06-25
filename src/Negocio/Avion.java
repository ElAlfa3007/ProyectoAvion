package Negocio;

import java.sql.Time;

public class Avion {
    private int avion_id;
    private String compania;
    private String salida;
    private String hora_salida;
    private String destino;
    private String hora_destino;

    public Avion(int avion_id, String compania, String salida, String hora_salida, String destino, String hora_destino) {
        this.avion_id = avion_id;
        this.compania = compania;
        this.salida = salida;
        this.hora_salida = hora_salida;
        this.destino = destino;
        this.hora_destino = hora_destino;
    }

    public int getAvion_id() {
        return avion_id;
    }

    public void setAvion_id(int avion_id) {
        this.avion_id = avion_id;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getHoara_salida() {
        return hora_salida;
    }

    public void setHoara_salida(String hora_salida) {
        this.hoara_salida = hoara_salida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHora_destino() {
        return hora_destino;
    }

    public void setHora_destino(String hora_destino) {
        this.hora_destino = hora_destino;
    }
}
