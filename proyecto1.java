import java.io.*;
import java.util.Arrays;

class Estudiante {
    private String nombre;
    private String cedula;
    private int mes;
    private int año;
    private String carrera;
    private float indice;

    public Estudiante(String n, String c, int m, int a, String ca, float i) {
        this.nombre = n;
        this.cedula = c;
        this.mes = m;
        this.año = a;
        this.carrera = ca;
        this.indice = i;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getMes() {
        return this.mes;
    }

    public float getIndice() {
        return this.indice;
    }

    public String getCarrera() {
        return this.carrera;
    }
}

public class proyecto1 {
    public static void main(String[] args) throws Exception {

        String nombre;
        String cedula;
        int mes;
        int año;
        String carrera;
        float indice = 0;
        String carreraciclo = "";

        Estudiante estudiantes[] = new Estudiante[8];

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese el nombre del estudiante");
            nombre = leer.readLine();
            System.out.println("Ingrese la cedula del estudiante");
            cedula = ""; // leer.readLine();
            System.out.println("Ingrese el mes de nacimiento del estudiante");
            mes = 0; // Integer.parseInt(leer.readLine());
            System.out.println("Ingrese el año de nacimiento del estudiante");
            año = 0; // Integer.parseInt(leer.readLine());
            System.out.println("Ingrese la carrera del estudiante");
            carrera = leer.readLine();
            boolean loop = true;
            while (loop) {
                System.out.println("Ingrese el indice del estudiante");
                indice = Float.parseFloat(leer.readLine());
                if (indice > 3.00 || indice < 0) {
                    System.out.println("El indice tiene que estar en el rango de 0 a 3");
                } else {
                    loop = false;
                }
            }

            estudiantes[i] = new Estudiante(nombre, cedula, mes, año, carrera, indice);
        }

        Estudiante aux;
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes.length - i - 1; j++) {
                if (estudiantes[j + 1].getCarrera().compareTo(estudiantes[j].getCarrera()) < 0 ||
                        (estudiantes[j + 1].getCarrera().equals(estudiantes[j].getCarrera())
                                && estudiantes[j + 1].getIndice() > estudiantes[j].getIndice())) {
                    aux = estudiantes[j + 1];
                    estudiantes[j + 1] = estudiantes[j];
                    estudiantes[j] = aux;

                }
            }
        }

        int n = 0;

        for (int i = 0; i < estudiantes.length; i++) {

            if (!carreraciclo.equals(estudiantes[i].getCarrera())) {
                n = 0;
                carreraciclo = estudiantes[i].getCarrera();

            }
            if (estudiantes[i].getIndice() >= 2.5 && n < 5) {
                System.out.println(
                        estudiantes[i].getNombre() + " " + estudiantes[i].getCarrera() + " "
                                + estudiantes[i].getIndice());
                n = n + 1;
            }
        }

    }
}
