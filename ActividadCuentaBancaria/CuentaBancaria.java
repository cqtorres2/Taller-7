public class CuentaBancaria {
    private int numeroCuenta;
    private int saldo;
    public String tipoCuenta;

    public CuentaBancaria (int numeroCuenta, int saldo, String tipoCuenta){
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

    /*Class prueba{
     * int numeroCuenta = 2222;    * 
    } */

    @Override
    public String toString() {
        return "El estado de la cuenta contiene los siguientes datos. Numero de cuenta: " + numeroCuenta + " Con " + saldo + " de saldo disponible y una cuenta de tipo " + tipoCuenta;
    }    
}
