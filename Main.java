import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha a operação (1 para área, 2 para perímetro, 0 para sair):");
            int operacao = scanner.nextInt();

            if (operacao == 0) {
                break; // Encerra o programa se o usuário escolher 0.
            }

            System.out.println("Escolha a forma (1 para círculo, 2 para quadrado, 3 para triângulo, 4 para retângulo):");
            int forma = scanner.nextInt();

            switch (forma) {
                case 1:
                    System.out.println("Digite o raio do círculo:");
                    double raio = scanner.nextDouble();
                    Circulo circulo1 = new Circulo(raio);

                    if (operacao == 1) {
                        double area = circulo1.calcularAreaCirc();
                        System.out.println("Área do círculo: " + area);
                    } else if (operacao == 2) {
                        double perimetro = circulo1.calcularPerimetroCirc();
                        System.out.println("Perímetro do círculo: " + perimetro);
                    }
                    break;
                case 2:
                    System.out.println("Digite o lado do quadrado:");
                    double lado = scanner.nextDouble();
                    Quadrado quadrado1 = new Quadrado(lado);

                    if (operacao == 1) {
                        double area = quadrado1.calcularAreaQUAD();
                        System.out.println("Área do quadrado: " + area);
                    } else if (operacao == 2) {
                        double perimetro = quadrado1.calcularPerimetroQUAD();
                        System.out.println("Perímetro do quadrado: " + perimetro);
                    }
                    break;
                case 3:
                    System.out.println("Digite a base do triângulo:");
                    double base = scanner.nextDouble();
                    System.out.println("Digite a altura do triângulo:");
                    double altura = scanner.nextDouble();
                    System.out.println("Digite o lado esquerdo do triângulo:");
                    double ladoEsq = scanner.nextDouble();
                    System.out.println("Digite o lado direito do triângulo:");
                    double ladoDir = scanner.nextDouble();
                    Triangulo triangulo1 = new Triangulo(ladoEsq, ladoDir, base, altura);

                    if (operacao == 1) {
                        double area = triangulo1.calcularAreaTRIANG();
                        System.out.println("Área do triângulo: " + area);
                    } else if (operacao == 2) {
                        double perimetro = triangulo1.calcularPerimetroTRIANG();
                        System.out.println("Perímetro do triângulo: " + perimetro);
                    }
                    break;
                case 4:
                    System.out.println("Digite a base do retângulo:");
                    double baseRet = scanner.nextDouble();
                    System.out.println("Digite a altura do retângulo:");
                    double alturaRet = scanner.nextDouble();
                    Retangulo retangulo1 = new Retangulo(baseRet, alturaRet);

                    if (operacao == 1) {
                        double area = retangulo1.calcularAreaRetang();
                        System.out.println("Área do retângulo: " + area);
                    } else if (operacao == 2) {
                        double perimetro = retangulo1.calcularPerimetroRetang();
                        System.out.println("Perímetro do retângulo: " + perimetro);
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("---------------------------------");
        }
    }
}

class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularAreaCirc() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetroCirc() {
        return 2 * Math.PI * raio;
    }
}

class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularAreaQUAD() {
        return Math.pow(lado, 2);
    }

    public double calcularPerimetroQUAD() {
        return 4 * lado;
    }
}

class Triangulo {
    private double ladoesq;
    private double ladodir;
    private double base;
    private double altura;

    public Triangulo(double ladoesq, double ladodir, double base, double altura) {
        this.ladoesq = ladoesq;
        this.ladodir = ladodir;
        this.base = base;
        this.altura = altura;
    }

    public double calcularAreaTRIANG() {
        return (base * altura) / 2;
    }

    public double calcularPerimetroTRIANG() {
        return ladoesq + ladodir + base;
    }
}

class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularAreaRetang() {
        return base * altura;
    }

    public double calcularPerimetroRetang() {
        return 2 * (base + altura);
    }
}
