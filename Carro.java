public class Carro extends Vehiculo {

    // Valor fijo del peaje para los carros
    private int valorPeaje = 2;

    // Constructor de la clase
    public Carro(String placa) {
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

    // Muestra la información del carro
    public void imprimir() {
        System.out.println(
            "Carro - Placa: " + getPlaca()
            + " - Peaje: $" + valorPeaje
        );
    }
}