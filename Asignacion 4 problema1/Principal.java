import java.io.*;

public class Principal {
    public static void main(String[] args) throws IOException {

        CapturarDatos datos = new CapturarDatos();
        MovimientosCuenta saldoactualizado = new MovimientosCuenta();

        String name;
        String accNumber;
        float saldo = 1000;
        float dinero;
        boolean loop = true;
        int optionMenu;
        int optionUsuario;

        System.out.println("Bienvenido al cajero de la banca en linea\n");
        name = datos.capturarDatos("Ingrese su nombre");
        accNumber = datos.capturarDatos("Ingrese su numero de cuenta");

        Usuario cuenta = new Usuario(name, accNumber);

        while (loop) {

            optionMenu = datos.capturarMenu(
                    "Que opcion desea realizar?\nIngrese 1 Para realizar un deposito en su cuenta bancaria\nIngrese 2 Para realizar un Retiro en su cuenta bancaria\nIngrese 3 Para salir del programa");

            if (optionMenu == 1) {
                cuenta.imprimirCuenta();
                while (true) {
                    optionUsuario = datos.capturarMenu(
                            "Ingrese 1 Para realizar un deposito en su cuenta bancaria\nIngrese 2 Para ver el saldo de la cuenta bancaria\nIngrese 3 Para salir al menu principal");
                    if (optionUsuario == 1) {
                        dinero = datos.capturarDinero("Ingrese el dinero a depositar");
                        saldo = saldoactualizado.despositarDinero(saldo, dinero);
                        System.out.println("Dinero depositado con exito");
                        break;
                    } else if (optionUsuario == 2) {
                        System.out.println("Su saldo actual es de " + saldo);
                    } else if (optionUsuario == 3) {
                        break;
                    }
                }
            }
            if (optionMenu == 2) {
                cuenta.imprimirCuenta();
                while (true) {
                    optionUsuario = datos.capturarMenu(
                            "Ingrese 1 Para realizar un retiro en su cuenta bancaria\nIngrese 2 Para ver el saldo de la cuenta bancaria\nIngrese 3 Para salir al menu principal");
                    if (optionUsuario == 1) {
                        while (true) {
                            dinero = datos.capturarDinero("Ingrese el dinero a retirar");
                            if (saldo >= dinero) {
                                saldo = saldoactualizado.retirarDinero(saldo, dinero);
                                break;
                            } else {
                                System.out.println("No tiene suficiente dinero en la cuenta, ingrese otro valor");
                            }
                        }

                        System.out.println("Dinero retirado con exito");
                        break;
                    } else if (optionUsuario == 2) {
                        System.out.println("Su saldo actual es de " + saldo);
                    } else if (optionUsuario == 3) {
                        break;
                    }
                }
            } else if (optionMenu == 3) {
                System.out.println("Hasta pronto " + name + " El saldo final de su cuenta es: " + saldo);
                loop = false;
            }
        }
    }
}