package IntroduccionJava.NivelCProgramacionOrientadaObjetos;

import java.util.Scanner; // Necesitamos Scanner para leer datos del usuario

// Clase que representa una cuenta bancaria sencilla
// Permite ingresar, retirar dinero y consultar el saldo
public class C2CuentaBancaria {
    // Datos principales de la cuenta
    private String titular;      // Nombre del dueño de la cuenta
    private String numeroCuenta; // Número de cuenta
    private double saldo;        // Saldo disponible en la cuenta

    // Constructor: crea una cuenta con titular, número y saldo inicial
    public C2CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Métodos para consultar los datos de la cuenta
    public String getTitular() {
        return this.titular;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // Métodos para modificar los datos de la cuenta si fuera necesario
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para ingresar dinero
    // Solo permite ingresar cantidades positivas
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad; // sumamos el dinero al saldo
            System.out.println("Ingreso realizado correctamente.");
        } else {
            System.out.println("No se puede ingresar una cantidad negativa.");
        }
    }

    // Método para retirar dinero
    // Evita que el saldo quede negativo
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad > saldo) {
                System.out.println("Saldo insuficiente. Se retirará todo el saldo disponible.");
            }
            saldo = Math.max(0, saldo - cantidad); // si no hay suficiente, se deja en 0
            System.out.println("Retirada realizada correctamente.");
        } else {
            System.out.println("No se puede retirar una cantidad negativa.");
        }
    }

    // Método principal donde se ejecuta el programa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos Scanner para leer del teclado

        // Pedimos los datos iniciales de la cuenta al usuario
        System.out.print("Introduce el nombre del titular: ");
        String titular = sc.nextLine();

        System.out.print("Introduce el número de cuenta: ");
        String numeroCuenta = sc.nextLine();

        System.out.print("Introduce el saldo inicial: ");
        double saldoInicial = sc.nextDouble();
        sc.nextLine(); // Limpiamos el buffer para que no haya problemas con nextLine

        // Creamos la cuenta con los datos introducidos
        C2CuentaBancaria cuenta = new C2CuentaBancaria(titular, numeroCuenta, saldoInicial);

        boolean salir = false; // Variable para controlar el menú

        // Menú interactivo: se repite hasta que el usuario elija salir
        while (!salir) {
            System.out.println("\nMENÚ");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer nuevamente

            switch (opcion) {
                case 1 -> { // Ingresar dinero
                    System.out.print("Cantidad a ingresar: ");
                    double ingreso = sc.nextDouble();
                    sc.nextLine(); // Limpiar buffer
                    cuenta.ingresar(ingreso);
                }
                case 2 -> { // Retirar dinero
                    System.out.print("Cantidad a retirar: ");
                    double retiro = sc.nextDouble();
                    sc.nextLine(); // Limpiar buffer
                    cuenta.retirar(retiro);
                }
                case 3 -> // Consultar saldo actual
                        System.out.println("Saldo actual: " + cuenta.getSaldo() + " €");
                case 4 -> { // Salir del programa
                    System.out.println("Saliendo del programa...");
                    salir = true;
                }
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        sc.close(); // Cerramos el Scanner al final (buena práctica)
    }
}
