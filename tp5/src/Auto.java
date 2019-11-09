import java.time.LocalDateTime;
import java.util.Calendar;

public class Auto {
    private String auto;
    private String marca;
    private int modelo;
    private String patente;
    private float km;
    private float ultCambioDeAceite;

    public Auto(String auto, String marca, String patente) {
        this.auto = auto;
        this.marca = marca;
        this.patente = patente;

        this.modelo = Calendar.getInstance().get(Calendar.YEAR);
        this.patente = patente;
        this.km = km;
    }

    public Auto(String auto, String marca, int modelo, String patente, float km, float ultCambioDeAceite) {
        this.auto = auto;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.km = km;
        this.ultCambioDeAceite = ultCambioDeAceite;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public float getUltCambioDeAceite() {
        return ultCambioDeAceite;
    }

    public void setUltCambioDeAceite(float ultCambioDeAceite) {
        this.ultCambioDeAceite = ultCambioDeAceite;
    }

    public boolean cambioAceite() {
        return ultCambioDeAceite < km - 5000;
    }
}
