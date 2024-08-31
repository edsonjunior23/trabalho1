public class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;

    // Construtor para inicializar os coeficientes da equação
    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para calcular o discriminante (Delta)
    private double calcularDelta() {
        return (b * b) - (4 * a * c);
    }

    // Método para calcular as raízes
    public void calcularRaizes() {
        double delta = calcularDelta();

        if (delta > 0) {
            // Duas raízes reais e distintas
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Duas raízes reais: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            // Uma raiz real (dupla)
            double x = -b / (2 * a);
            System.out.println("Uma raiz real (dupla): x = " + x);
        } else {
            // Raízes complexas
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-delta) / (2 * a);
            System.out.println("Duas raízes complexas: x1 = " + parteReal + " + " + parteImaginaria + "i, x2 = " + parteReal + " - " + parteImaginaria + "i");
        }
    }

    // Método principal para teste
    public static void main(String[] args) {
        EquacaoSegundoGrau equacao1 = new EquacaoSegundoGrau(1, -3, 2); // a=1, b=-3, c=2
        equacao1.calcularRaizes();

        EquacaoSegundoGrau equacao2 = new EquacaoSegundoGrau(1, -2, 1); // a=1, b=-2, c=1
        equacao2.calcularRaizes();

        EquacaoSegundoGrau equacao3 = new EquacaoSegundoGrau(1, 2, 5); // a=1, b=2, c=5
        equacao3.calcularRaizes();
    }
}