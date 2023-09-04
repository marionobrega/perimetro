public class triangulo {
    public double base;
    public double altura;
    public double ladoesq;
    public double ladodir;
    public triangulo(double ladoesq, double ladodir, double base, double altura)
    {
        this.ladoesq = ladoesq;
        this.ladodir = ladodir;
        this.base = base;
        this.ladoesq = ladoesq;
    }

    public double calcularAreaTRIANG()
    {
        return (base * altura)/2;
    }

    public double calcularPerimetroTRIANG()
    {
        return base + ladodir + ladoesq;
    }
}
