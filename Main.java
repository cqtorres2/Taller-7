public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Rolan", 2500);
        CuentaBancaria uti1 = new CuentaBancaria(13256, 1500, "Juridica");
        
        System.out.println(uti1);
        System.out.println(emp1);
    }
}
