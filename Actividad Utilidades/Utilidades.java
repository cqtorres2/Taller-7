public class Utilidades {
    public int Numero1 = 23;
    public int Numero2 = 45;
    public int Resultado;

    public int suma(int Numero1, int Numero2, int Resultado) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
        return Resultado = Numero1 + Numero2;
    }

    public int resta(int Numero1, int Numero2, int Resultado) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
        return Resultado = Numero1 - Numero2;
    }

    public int Multiplicar(int Numero1, int Numero2, int Resultado) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
        return Resultado = Numero1 * Numero2;
    }

    public double Dividir(int Numero1, int Numero2, int Resultado) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
        return Resultado = Numero1 / Numero2;
    }

    @Override
    public String toString() {
        return "El ejercicio propuesto consta de los numeros " + Numero1 + " y " + Numero2
                + " donde la suma de ambos es " + suma(Numero1, Numero2, Resultado) + " su resta consta de  "
                + resta(Numero1, Numero2, Resultado) + " con una multiplicación de "
                + Multiplicar(Numero1, Numero2, Resultado) + " Que es dividido con un resultado de "
                + Dividir(Numero1, Numero2, Resultado);
    }
}
