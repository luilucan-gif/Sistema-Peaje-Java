public class Vehiculo {

    // Atributo común para todos los vehículos
    private String placa;

    // Constructor que recibe la placa
    public Vehiculo(String placa) {
        this.placa = placa;
    }

    // Permite obtener la placa
    public String getPlaca() {
        return placa;
    }

    // Permite modificar la placa
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Devuelve la información básica del vehículo
    public String obtenerInformacion() {
        return "Placa: " + placa;
    }
}