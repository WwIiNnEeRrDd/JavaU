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

    public int capturarMenu(String message) {

        boolean loop = true;
        int option = 0;
        try {
            while (loop) {
                System.out.println(message);
                option = Integer.parseInt(read.readLine());
                if (option > 3 || option < 0) {
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

    public float capturarDinero(String message) {
        boolean loop = true;
        float money = 0;
        try {
            while (loop) {
                System.out.println(message);
                money = Float.parseFloat(read.readLine());
                if (money <= 0) {
                    System.out.println("El dinero tiene que ser positivo");
                } else {
                    loop = false;
                }
            }
            return money;
        } catch (Exception e) {
            System.out.println("Ingrese un valor valido");
            return capturarDinero(message);
        }
    }
}