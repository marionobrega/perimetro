public class quadrado {
    public double lado;

    public quadrado(double lado)
    {
        this.lado = lado;
    }

    public double calcularAreaQUAD()
    {
        return lado * lado;
    }

    public double calcularPerimetroQUAD()
    {
        return lado + lado + lado + lado;
    }
}