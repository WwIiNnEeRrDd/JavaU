import java.io.*;

public class Estudiante {
    private String nombre;
    private String cedula;
    private int mes;
    private int año;
    private String carrera;
    private float indice;

    public Estudiante() {
        nombre = "";
    }

    public getNombre(){
        return nombre;      
    }

    public void setNombre(String n) {
        nombre = n;
    }
}

public class proyecto1 {
    public static void main(String[] args) throws Exception {

        Estudiante estudiantes[] = new Estudiante[100];

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <= 99; i++) {
            System.out.println("Ingrese el nombre del estudiante");
            estudiantes[i].setNombre(leer.readLine());
            /*
             * System.out.println("Ingrese la cedula del estudiante");
             * cedula[i] = Integer.parseInt(leer.readLine());
             * System.out.println("Ingrese el mes de nacimiento del estudiante");
             * mes[i] = Integer.parseInt(leer.readLine());
             * System.out.println("Ingrese el año de nacimiento del estudiante");
             * año[i] = Integer.parseInt(leer.readLine());
             * System.out.println("Ingrese la carrera del estudiante");
             * carrera[i] = Integer.parseInt(leer.readLine());
             * System.out.println("Ingrese el indice del estudiante");
             * indice[i] = Integer.parseInt(leer.readLine());
             */
        }
    }
}
