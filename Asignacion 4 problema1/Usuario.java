public class Usuario {

    private String name;
    private String accNumber;

    public Usuario(String n, String a) {
        this.name = n;
        this.accNumber = a;
    }

    public void imprimirCuenta() {
        System.out.println("Bienvenido " + name + " Numero de cuenta: " + accNumber);
    }

}