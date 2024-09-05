package CLASES;

public class AppBanco {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("joel");
        Cuenta cuenta2 = new Cuenta("don Carlos", -10000);

        cuenta1.ingresar(50000);
        cuenta2.ingresar(20000);

        cuenta1.imprimir();
        cuenta2.imprimir();

        cuenta1.retirar(23000);

        cuenta1.imprimir();
        cuenta2.imprimir();
    }
    
}