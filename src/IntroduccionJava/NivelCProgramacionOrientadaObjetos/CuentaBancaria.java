package IntroduccionJava.NivelCProgramacionOrientadaObjetos;

public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular , String numeroCuenta , double saldo ) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            // he puesto max para que no haya valores negativos
            saldo = Math.max(0, saldo - cantidad);
        }
    }




    public static void main(String [] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Natalia" , "484949498894DSJ" , 50);
        cuenta.ingresar(3);
        System.out.println(cuenta.getSaldo());
        cuenta.ingresar(-3);
        System.out.println(cuenta.getSaldo());

        cuenta.retirar(60);
        System.out.println(cuenta.getSaldo());

    }
}
