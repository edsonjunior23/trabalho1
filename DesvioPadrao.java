public class DesvioPadrao {

    // Método para calcular a média de um array de números
    private static double calcularMedia(double[] numeros) {
        double soma = 0.0;
        for (double num : numeros) {
            soma += num;
        }
        return soma / numeros.length;
    }

    // Método para calcular o desvio padrão de um array de números
    public static double calcularDesvioPadrao(double[] numeros) {
        double media = calcularMedia(numeros);
        double somaQuadradosDiferencas = 0.0;

        for (double num : numeros) {
            somaQuadradosDiferencas += Math.pow(num - media, 2);
        }

        return Math.sqrt(somaQuadradosDiferencas / (numeros.length - 1));
    }

    // Método principal para teste
    public static void main(String[] args) {
        double[] numeros = {10, 12, 23, 23, 16, 23, 21, 16}; // Exemplo de conjunto de dados
        double desvioPadrao = calcularDesvioPadrao(numeros);
        System.out.println("O desvio padrão é: " + desvioPadrao);
    }
}
