import java.io.*;
import java.text.DecimalFormat;

//en repositorio de github
public class practicajava {
    public static void main(String[] args) throws Exception {

        boolean ciclo1 = true;
        float lado1 = 0;
        float lado2 = 0;
        float lado3 = 0;
        double perimetro;
        double area;

        DecimalFormat format1 = new DecimalFormat("#.00");
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        while (ciclo1) {
            System.out.println("que figura va a calcular?\n1.Triangulo\n2.Ciculo\n3.rectangulo");
            int option = Integer.parseInt(leer.readLine());
            if (option == 1) // Calculos del p y a del triangulo
            {

                lado1 = valor("Introduzca el lado 1");

                lado2 = valor("Introduzca el lado 2");

                lado3 = valor("Introduzca el lado 3");

                perimetro = lado1 + lado2 + lado3;

                area = Math.sqrt((perimetro / 2) * ((perimetro / 2) - lado1) * ((perimetro / 2) - lado2)
                        * ((perimetro / 2) - lado3));

                System.out.println(
                        "El perimetro es: " + format1.format(perimetro) + "\nEl area es: " + format1.format(area));

            }

            else if (option == 2) // Calculos del p y a del circulo
            {
                lado1 = valor("Introduzca el radio");
                perimetro = (2 * lado1) * Math.PI;
                area = Math.PI * (lado1 * lado1);

                System.out.println(
                        "El perimetro es: " + format1.format(perimetro) + "\nEl area es: " + format1.format(area));

            } else if (option == 3) // Calculos del p y a del rectangulo
            {

                lado1 = valor("Introduzca la base");
                System.out.println("");
                lado2 = valor("Introduzca la altura");
                perimetro = lado1 * 2 + lado2 * 2;
                area = lado1 * lado2;

                System.out.println(
                        "El perimetro es: " + format1.format(perimetro) + "\nEl area es: " + format1.format(area));

            }

            System.out.println("Si desea salir del programa\nIntroduzca EXIT");
            String option2 = leer.readLine();
            if (option2.equals("EXIT"))// salir del programa
            {
                ciclo1 = false;
            }
        }
    }

    public static float valor(String mensaje) {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(mensaje);
            return Float.parseFloat(leer.readLine());
        } catch (Exception e) {
            System.out.println("Ingrese un valor valido");
            return valor(mensaje);
        }

    }

}
