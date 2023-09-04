public class Main
{
    public static void main(String[] args)
    {
        circulo circulo1 = new circulo(0.5);
        double area = circulo1.calcularAreaCirc();
        System.out.println("Area do circulo: " + area);
        double perimetro = circulo1.calcularPerimetroCirc();
        System.out.println("Perimetro do circulo: " + perimetro);
        System.out.println("---------------------------------");
        quadrado quadrado1 = new quadrado(2);
        double area1 = quadrado1.calcularAreaQUAD();
        System.out.println("Area do quadrado: " + area1);
        double perimetro1 = quadrado1.calcularPerimetroQUAD();
        System.out.println("Perimetro do quadrado: " + perimetro1);
        System.out.println("---------------------------------");
        triangulo triangulo1 = new triangulo(9, 4,10,7);
        double area2 = triangulo1.calcularAreaTRIANG();
        System.out.println("Area do triangulo: " + area2);
        double perimetro2 = triangulo1.calcularPerimetroTRIANG();
        System.out.println("Perimetro do triangulo: " + perimetro2);
        System.out.println("---------------------------------");
        retangulo retangulo1 = new retangulo(3, 4);
        double area3 = retangulo1.calcularAreaRetang();
        System.out.println("Area do retangulo: " + area3);
        double perimetro3 = retangulo1.calcularPerimetroRetang();
        System.out.println("Perimetro do retangulo: " + perimetro3);
    }
}