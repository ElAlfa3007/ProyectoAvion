package Negocio;

public class Asiento {
    private int asiento_id;
    private String estado;
    private String clase;
    private String avion_id;

    public Asiento(int asiento_id, String estado, String clase, String avion_id) {
        this.asiento_id = asiento_id;
        this.estado = estado;
        this.clase = clase;
        this.avion_id = avion_id;
    }
    // CREATE Table asiento(
    // Asiento_id INT(3),
    // Estado BOOLEAN,
    // Clase VARCHAR(3),
    // Avion_id INT(10),
    // PRIMARY KEY(Asiento_id),
    // CONSTRAINT FOREIGN KEY(Avion_id) REFERENCES avion(Avion_id) ON UPDATE CASCADE
    // )   

    public int getAsiento_id() {
        return asiento_id;
    }

    public void setAsiento_id(int asiento_id) {
        this.asiento_id = asiento_id;
    }

    public String isEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getAvion_id() {
        return avion_id;
    }

    public void setAvion_id(String avion_id) {
        this.avion_id = avion_id;
    }
}
