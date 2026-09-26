import java.util.ArrayList;

public class Peaje {

    // Datos de la estación de peaje
    private String nombre;
    private String departamento;
    private int totalPeaje;
    private int totalCamiones;
    private int totalMotos;
    private int totalCarros;

    // Lista que almacena los vehículos registrados
    private ArrayList<Vehiculo> vehiculos;

    // Constructor de la clase
    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.totalPeaje = 0;
        this.totalCamiones = 0;
        this.totalMotos = 0;
        this.totalCarros = 0;
        this.vehiculos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Registra un vehículo y acumula el valor pagado
    public void anadirVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        totalPeaje += calcularPeaje(vehiculo);

        if (vehiculo instanceof Carro) {
            totalCarros++;
        } else if (vehiculo instanceof Moto) {
            totalMotos++;
        } else if (vehiculo instanceof Camion) {
            totalCamiones++;
        }
    }

    // Determina el valor según el tipo de vehículo
    public int calcularPeaje(Vehiculo vehiculo) {
        if (vehiculo instanceof Carro) {
            return ((Carro) vehiculo).getValorPeaje();
        } else if (vehiculo instanceof Moto) {
            return ((Moto) vehiculo).getValorPeaje();
        } else if (vehiculo instanceof Camion) {
            return ((Camion) vehiculo).calcularPeaje();
        }

        return 0;
    }

    // Imprime los vehículos y el resumen de la estación
    public void imprimir() {
        System.out.println("SISTEMA DE PEAJE");
        System.out.println("Estación: " + nombre);
        System.out.println("Ubicación: " + departamento);
        System.out.println("--------------------------------");

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Carro) {
                ((Carro) vehiculo).imprimir();
            } else if (vehiculo instanceof Moto) {
                ((Moto) vehiculo).imprimir();
            } else if (vehiculo instanceof Camion) {
                ((Camion) vehiculo).imprimir();
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Total de carros: " + totalCarros);
        System.out.println("Total de motos: " + totalMotos);
        System.out.println("Total de camiones: " + totalCamiones);
        System.out.println("Total recaudado: $" + totalPeaje);
    }
}