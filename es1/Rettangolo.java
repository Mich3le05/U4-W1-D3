package es1;

//Creare una classe Rettangolo che permetta di rappresentare dei rettangoli.
public class Rettangolo {
    // Per ogni rettangolo deve essere possibile specificare altezza e larghezza in fase di costruzione dell'istanza e devono essere realizzati i metodi per calcolare perimetro ed area.
    private double altezza;
    private double larghezza;

    public Rettangolo(double alt, double larg) {
        this.altezza = alt;
        this.larghezza = larg;
    }

    public double area() {
        return altezza * larghezza;
    }

    public double perimetro() {
        return (altezza + larghezza) * 2;
    }
}
