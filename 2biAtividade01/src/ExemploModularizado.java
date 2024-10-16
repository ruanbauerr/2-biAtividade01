public class ExemploModularizado {

    public static void main(String[] args) {
        int numero = 5;
        int quadrado = calcularQuadrado(numero);
        exibirResultado(numero, quadrado);
    }

    public static int calcularQuadrado(int num) {
        return num * num;
    }

    public static void exibirResultado(int num, int quadrado) {
        System.out.println("O quadrado de " + num + " é " + quadrado);
    }
}