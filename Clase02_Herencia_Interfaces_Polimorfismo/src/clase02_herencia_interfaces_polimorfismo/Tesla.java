package clase02_herencia_interfaces_polimorfismo;

public class Tesla extends Vehiculo implements VehiculoElectrico {

    @Override
    public void Moverse() {
        System.out.println("El tesla se mueve por un motor electrico");
    }

    @Override
    public void cargarBateria() {
        System.out.println("El tesla, necesita cargar su bateria");
    }
    
}
