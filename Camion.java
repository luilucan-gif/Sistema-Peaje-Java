public class Camion extends Vehiculo {

    // El camión paga un dólar por cada eje
    private int valorPeajeEje = 1;
    private int numeroEjes;

    // Constructor de la clase
    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    // Permite obtener el valor cobrado por cada eje
    public int getValorPeajeEje() {
        return valorPeajeEje;
    }

    // Permite modificar el valor cobrado por cada eje
    public void setValorPeajeEje(int valorPeajeEje) {
        this.valorPeajeEje = valorPeajeEje;
    }

    // Permite obtener el número de ejes
    public int getNumeroEjes() {
        return numeroEjes;
    }

    // Calcula el valor total que debe pagar el camión
    public int calcularPeaje() {
        return valorPeajeEje * numeroEjes;
    }

    // Muestra la información del camión
    public void imprimir() {
        System.out.println(
            "Camión - Placa: " + getPlaca()
            + " - Ejes: " + numeroEjes
            + " - Peaje: $" + calcularPeaje()
        );
    }
}