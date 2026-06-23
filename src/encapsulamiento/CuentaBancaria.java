package encapsulamiento;

public class CuentaBancaria {

    private String titular;
    private double saldo;
    private int pin;

    public CuentaBancaria(String titular, double saldo, int pin) {
        this.titular = titular;
        this.saldo = saldo;
        this.pin = pin;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void retirar(double monto, int pinIngresado) {
        if (pinIngresado == pin) {
            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("Retiro realizado");
            } else {
                System.out.println("Fondos insuficientes");
            }
        } else {
            System.out.println("PIN incorrecto");
        }
    }
}