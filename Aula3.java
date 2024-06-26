--Principal--


public class Principal {
    public static void main (String[] args){
        Circulo c1;
        c1 = new Circulo();

        Trapezio t1;
        t1 = new Trapezio()


        c1.setRaio(6);
        System.out.println(c1.calcularPerimetroCirculo());
        System.out.println(c1.calcularAreaCirculo());

        t1.setBaseMaior(6);
        t1.setBaseMenor(6);
        t1.setLado1(6);
        t1.setLado2(6);
        System.out.println(t1.calcularPerimetroTrapezio());
        System.out.println(t1.calcularAreaTrapezio());
    }
}

--Circulo--

public class Circulo {
    private double raio;

    public void setRaio(double x) {
        if (x <= 0)
            return;
        this.raio = x;
    }

    public double calcularPerimetro() {
        return 2 * 3.14 * this.raio;
    }

    public double calcularArea() {
        return (this.raio * this.raio) * 3.14;
    }
}


--Trapezio--


public class Trapezio{
    private double baseMaior;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;

    public void setBaseMaior (double x){
        if (x<=0)
            return;
        this.baseMaior = x;
    }

    public void setBaseMenor(double x){
        if (x<=0)
            return;
        this.baseMenor = x;
    }

    public void setLado1(double x){
        if (x<=0)
            return;
        this.lado1 = x;
    }

    public void setLado2(double x){
        if (x<=0)
            return;
        this.lado2 = x;
    }

    public double calcularAltura(){

    }

    public double calcularPerimetroTrapezio(){
        return this.lado1 + this. + this.baseMaior + this.baseMenor;
    }

    public double calcularAreaTrapezio() {
        return ((this.baseMenor + this.baseMaior) * altura) /2;

    }


}
