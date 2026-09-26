public class SistemaPeaje {

    // Método principal que inicia el programa
    public static void main(String[] args) {

        // Creación de la estación de peaje
        Peaje peaje = new Peaje("Peaje Guayaquil", "Guayas");

        // Creación de los vehículos
        Carro carro1 = new Carro("GSA-1234");
        Carro carro2 = new Carro("GBC-5678");

        Moto moto1 = new Moto("IX-123A");
        Moto moto2 = new Moto("IA-456B");

        Camion camion1 = new Camion("GTA-9012", 4);
        Camion camion2 = new Camion("GTR-3456", 6);

        // Registro de los vehículos en el peaje
        peaje.anadirVehiculo(carro1);
        peaje.anadirVehiculo(carro2);
        peaje.anadirVehiculo(moto1);
        peaje.anadirVehiculo(moto2);
        peaje.anadirVehiculo(camion1);
        peaje.anadirVehiculo(camion2);

        // Presentación del resultado final
        peaje.imprimir();
    }
}