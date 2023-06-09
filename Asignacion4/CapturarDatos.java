import java.io.*;

public class CapturarDatos {

    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    public String capturarDatos(String message) {

        try {
            System.out.println(message);
            return read.readLine();
        } catch (Exception e) {
            System.out.println("Ingrese un valor valido");
            return capturarDatos(message);
        }
    }

    public float capturarNotas(String message) {
        boolean loop = true;
        float grade = 0;
        try {
            while (loop) {
                System.out.println(message);
                grade = Float.parseFloat(read.readLine());
                if (grade > 5.00 || grade < 0) {
                    System.out.println("El indice tiene que estar en el rango de 0 a 5");
                } else {
                    loop = false;
                }
            }
            return grade;
        } catch (Exception e) {
            System.out.println("Ingrese un valor valido");
            return capturarNotas(message);
        }
    }

    public int capturarMenu(String message) {

        boolean loop = true;
        int option = 0;
        try {
            while (loop) {
                System.out.println(message);
                option = Integer.parseInt(read.readLine());
                if (option > 5 || option < 0) {
                    System.out.println("Ingrese un valor valido");
                } else {
                    loop = false;
                }
            }
            return option;
        } catch (Exception e) {
            System.out.println("Ingrese un valor valido");
            return capturarMenu(message);
        }
    }
}
