public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Rolan", 2500);
        CuentaBancaria cuen1 = new CuentaBancaria(13256, 1500, "Juridica");
        Utilidades uti1 = new Utilidades();
        
        System.out.println(cuen1);
        System.out.println(emp1);
        System.out.println(uti1);

    }
}
