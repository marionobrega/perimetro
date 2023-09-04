public class circulo
{
    public double raio;


    public circulo(double raio)
    {
        this.raio = raio;
    }

    public double calcularAreaCirc()
    {
        return Math.PI * (raio * raio);
    }

    public double calcularPerimetroCirc()
    {
        return 2 * Math.PI * raio;
    }
}