public class retangulo
{
    public double base;
    public double altura;

    public retangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double calcularAreaRetang()
    {
        return base * altura;
    }

    public double calcularPerimetroRetang()
    {
        return base + base + altura + altura;
    }
}