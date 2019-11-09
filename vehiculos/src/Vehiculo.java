public class Vehiculo {
    private enum Motors { A, B }
    private enum Colors { ROJO, VERDE }
    private int cantidadDeRuedas = 2;
    private int cantidadDeAsientos;
    private Motors motorizacion;
    private Colors color;

    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }

    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public Motors getMotorizacion() {
        return motorizacion;
    }

    public void setMotorizacion(Motors motorizacion) {
        this.motorizacion = motorizacion;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public void despalzar() {
        System.out.println("Método desplazar de la clase Vehículo");
    }

    @Override
    public String toString() {
        return String.valueOf(this.cantidadDeRuedas);
    }
}
