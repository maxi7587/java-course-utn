public class Racional {
    private  int numerador;
    private int denominador;

    public Racional() {
        numerador = 0;
        denominador = 1;
    }

    public Racional(int p, int q) {
        numerador = p;
        denominador = q;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void show() {
        System.out.println(numerador + "/" + denominador);
    }

    public void invert() {
        int pivot = numerador;
        numerador = denominador;
        denominador = pivot;
    }

    public double toDouble() {
        return numerador/denominador;
    }

    public Racional sum(Racional racional) {
        int denominador = getMcm(this.denominador, racional.getDenominador());
        int numerador = (denominador / this.denominador) * this.numerador + (denominador / racional.getDenominador()) * racional.getNumerador();
        return new Racional(numerador, denominador);
    }

    public Racional resta(Racional racional) {
        int denominador = getMcm(this.denominador, racional.getDenominador());
        int numerador = (denominador / this.denominador) * this.numerador - (denominador / racional.getDenominador()) * racional.getNumerador();
        return new Racional(numerador, denominador);
    }

    public Racional mult(Racional racional) {
        return new Racional(this.numerador * racional.getNumerador(), this.denominador * racional.getDenominador());
    }

    public Racional div(Racional racional) {
        return new Racional(this.numerador * racional.getDenominador(), this.denominador * racional.getNumerador());
    }

    public static int getMcd(int num1, int num2) {
        int mcd = 0;
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        do {
            mcd = b;
            b = a % b;
            a = mcd;
        } while (b != 0);
        return mcd;
    }

    public static int getMcm(int num1, int num2) {
        int mcm = 0;
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        mcm = (a / getMcd(a, b)) * b;
        return mcm;
    }
}
