public class JurosCompostos {

    public static double calcularMontante(double capitalInicial, double taxaJuros, int numeroPeriodos) {
        return capitalInicial * Math.pow(1 + taxaJuros, numeroPeriodos);
    }

    // Método para teste
    public static void main(String[] args) {
        double capitalInicial = 1000.0; // Capital inicial
        double taxaJuros = 0.05; // Taxa de juros por período (5%)
        int numeroPeriodos = 12; // Número de períodos (meses, anos, etc.)

        double montanteFinal = calcularMontante(capitalInicial, taxaJuros, numeroPeriodos);
        System.out.println("O montante final após " + numeroPeriodos + " períodos é: " + montanteFinal);
    }
}
