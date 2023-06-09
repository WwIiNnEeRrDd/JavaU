public class Calificaciones {
    public float calcularPromedio(float[] notas) {
        float promedio;
        float sumatoria = 0;

        for (int i = 0; i < 5; i++) {
            sumatoria = sumatoria + notas[i];
        }
        promedio = sumatoria / 5;

        return promedio;
    }

    public void imprimirNotas(float[] notas) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Calificacion " + (i + 1) + ": " + notas[i]);
        }
    }
}
