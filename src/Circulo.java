public class Circulo extends shape {

    public static final double PI = 3.141592;

    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    //aqui determinamos el diametro del circulo para que pueda hacer la ecuacion
    //del perimetro
    public double getDiameter() {
        return radio * 2;
    }

    //ponemos la area y perimetro del Circulo
    public double area() {
        return PI * radio * radio;
    }

    public double perimeter() {
        return PI * getDiameter();
    }
}
