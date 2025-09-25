public class Empleado {
    public String nombre;
    public int salario;

    public Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }
    public int getSalario() {
        return salario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "El empleado de nombre " + nombre + " tiene un salario de " + salario + " en dolares";
    }
}
