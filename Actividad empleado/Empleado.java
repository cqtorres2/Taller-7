public class Empleado {
    public String nombre;
    public int salario;

    public Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "El empleado de nombre " + nombre + " tiene un salario de " + salario + " en dolares";
    }
}
