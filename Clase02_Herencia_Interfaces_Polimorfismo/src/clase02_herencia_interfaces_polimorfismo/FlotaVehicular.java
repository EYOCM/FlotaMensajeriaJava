
package clase02_herencia_interfaces_polimorfismo;

import java.util.ArrayList;

public class FlotaVehicular {
    public static void main(String[] args) {
               ArrayList<Vehiculo> flota = new ArrayList<>();

        flota.add(new Motocicleta());
        flota.add(new Camion());
        flota.add(new Bicicleta());
        flota.add(new Tesla());

        for (Vehiculo v : flota) {
            v.Moverse();
            v.detenerse();

            if (v instanceof VehiculoElectrico) {
                VehiculoElectrico ev = (VehiculoElectrico) v;
                ev.cargarBateria();
            }

            System.out.println(); // Separador para legibilidad
        }
    }
}
        
    
    

