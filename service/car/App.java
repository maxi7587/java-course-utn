package service.car;

/**
 * App
 */
public class App {

    public static void main(String[] args) {

        System.out.println(Taller.NOMBRE_TALLER);

        Auto peugeot206 = new Auto("Peugeot", "206", "GYP207");
        Auto fordKA = new Auto("Ford", "KA", "SYP209");

        System.out.println("Cantidad de autos en el taller: "+Taller.cantidadDeVehiculosEnTaller()+"\n");

        Taller.ingresarVehiculo(peugeot206);
        System.out.println("Cantidad de autos en el taller: "+Taller.cantidadDeVehiculosEnTaller()+"\n");

        Taller.ingresarVehiculo(fordKA);
        System.out.println("Cantidad de autos en el taller: "+Taller.cantidadDeVehiculosEnTaller()+"\n");


        Auto[] autosPremium = new Auto[]{new Auto("BMW", "M5", "UYB008"), new Auto("Audi", "A3", "WPU091")};

        Taller.ingresarVehiculos(autosPremium);

        System.out.println("Cantidad de autos en el taller: "+Taller.cantidadDeVehiculosEnTaller()+"\n");


    }
}