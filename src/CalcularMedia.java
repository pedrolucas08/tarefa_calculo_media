public class CalcularMedia {

    public static void CalculoMedia(double... notas) {
        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas += nota;
        }

        System.out.println("Média: " + somaNotas / notas.length);
    }
}
