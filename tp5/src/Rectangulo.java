public class Rectangulo {
    float base;
    float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPerimetro() {
        return base * 2 + altura * 2;
    }

    public float getArea() {
        return base * altura;
    }
}
