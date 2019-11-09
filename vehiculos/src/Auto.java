public class Auto extends Vehiculo {
    private enum Combustibles { A, B, C }
    private int cantidadDePuertas;
    private Combustibles tipoDeCombustible;

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public Combustibles getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(Combustibles tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    @Override
    public void despalzar() {
        System.out.println("Método desplazar de la clase Auto");
    }

    @Override
    public int getCantidadDeRuedas() {
        return super.getCantidadDeRuedas() + 2;
    }
}
