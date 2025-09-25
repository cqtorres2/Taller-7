public class Utilidades {
    private int numeroCuenta;
    private int saldo;
    public String tipoCuenta;

    public Utilidades (int numeroCuenta, int saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "El estado de la cuenta contiene los siguientes datos. Numero de cuenta: " + numeroCuenta + " Con " + saldo + " de saldo disponible y una cuenta de tipo " + tipoCuenta;
    }
}
