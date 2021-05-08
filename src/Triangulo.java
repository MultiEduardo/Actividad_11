public class Triangulo extends shape{
    private double Base;
    private double Altura;

    public Triangulo(double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public void setBase(double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public double getBase() {
        return Base;
    }

    public double getAltura() {
        return Altura;
    }

    //ponemos la area y perimetro del Triangulo
    public double area() {
        return (Base * Altura) / 2.0;
    }

    public double perimeter() {
        return Base * 3.0;
    }

    /*private double calculateHeightLength() {
        return (Math.sqrt(3.0) * this.sideLength) / 2.0;
    }*/
}
