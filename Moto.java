public class Moto extends Vehiculo {

    // Valor fijo del peaje para las motos
    private int valorPeaje = 1;

    // Constructor de la clase
    public Moto(String placa) {
        super(placa);
    }

    // Permite obtener el valor del peaje
    public int getValorPeaje() {
        return valorPeaje;
    }

    // Permite modificar el valor del peaje
    public void setValorPeaje(int valorPeaje) {
        this.valorPeaje = valorPeaje;
    }

    // Muestra la información de la moto
    public void imprimir() {
        System.out.println(
            "Moto - Placa: " + getPlaca()
            + " - Peaje: $" + valorPeaje
        );
    }
}