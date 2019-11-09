import java.util.Arrays;

public class Taller {

    public static final String NOMBRE_TALLER = "SERVICE CARS MULTIMARCAS";
    private static Auto[] autos;



    public static void ingresarVehiculo(Auto auto){
        if(autos==null){
            autos = new Auto[]{auto};
        }else{
            int newLength = autos.length+1 ;
            autos = Arrays.copyOf(autos, (autos.length+1));
            autos[newLength-1]=auto;
        }
    }

    public static void ingresarVehiculos(Auto[] autos){
        if(autos==null){
            Taller.autos=autos;
        }else{
            for (int i = 0; i < autos.length; i++) {
                ingresarVehiculo(autos[i]);
            }
        }
    }

    public static int cantidadDeVehiculosEnTaller(){
        return (autos==null) ? 0 : autos.length;
    }

    public static void sacarVehiculo(Auto auto) {
        if (autos == null) {
            return;
        }
        Auto[] nuevos_autos = new Auto[autos.length - 1];
        boolean eliminado = false;
        for (int index = 0; index < autos.length; index++) {
            if(autos[index].equals(auto) && !eliminado) {
                eliminado = true;
            } else if (eliminado) {
                nuevos_autos[index -1] = autos[index];
            } else {
                nuevos_autos[index] = autos[index];
            }
        }
        autos = nuevos_autos;
    }

    public static void sacarVehiculos(Auto[] autos) {
        for (int index = 0; index < autos.length; index++) {
            sacarVehiculo(autos[index]);
        }
    }

    public static void sacarVehiculoRapido(Auto auto) {
        if (autos == null) {
            return;
        }
        for (int index = 0; index < autos.length; index++) {
            if(autos[index].equals(auto)) {
                autos[index] = autos[autos.length - 1];
                autos = Arrays.copyOf(autos, autos.length - 1);
            }
        }
    }

    public static void sacarVehiculosRapido(Auto[] autos) {
        for (int index = 0; index < autos.length; index++) {
            sacarVehiculoRapido(autos[index]);
        }
    }
}