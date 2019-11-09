import org.w3c.dom.css.Rect;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

	    // Ejercicio 2
        Zapatilla zapatilla1 = new Zapatilla("nike", "1", 40, "argentina");
        Zapatilla zapatilla2 = new Zapatilla("adidas", "3", 42, "argentina");
        System.out.println(zapatilla1.getMarca().equals(zapatilla2.getMarca()));

        // Ejercicio 3
        System.out.println("Asigna un identificador al auto");
        String nombre_auto = user_input.nextLine();
        System.out.println("Define el marca del auto");
        String marca_auto = user_input.nextLine();
        System.out.println("Define el modelo del auto (año)");
        int modelo_auto = user_input.nextInt();
        System.out.println("Define la patente del auto");
        String patente_auto = user_input.nextLine();
        System.out.println("Asigna un identificador al auto");
        float km_auto = user_input.nextFloat();
        System.out.println("Asigna un identificador al auto");
        float ult_cambio_de_aceite_auto = user_input.nextFloat();

        Auto auto_familiar = new Auto(nombre_auto, marca_auto,  modelo_auto, patente_auto, km_auto, ult_cambio_de_aceite_auto);

        if (auto_familiar.cambioAceite()) {
            System.out.println("Requiere cambio de aceite");
        } else {
            System.out.println("No requiere cambio de aceite");
        }

        // Ejercicio 4
        Rectangulo[] rectangulos = new Rectangulo[5];
        System.out.println("Ingresa los datos de 5 rectágulos.");
        for (int index = 0; index < 5; index++) {
            System.out.println("Datos del rectángulo N° " + (index + 1));
            rectangulos[index] = new Rectangulo(user_input.nextInt(), user_input.nextInt());
        }
        for (int index = 0; index < 5; index++) {
            System.out.println("Perímetro del rectángulo N° " + (index + 1) + rectangulos[index].getPerimetro());
            System.out.println("Área del rectángulo N° " + (index + 1) + rectangulos[index].getArea());
        }

        // Ejerccio 6
        LocalDeZapatillas localDeZapatillas = new LocalDeZapatillas();
        System.out.println("Agrega 6 modelos de zapatillas canadienses o taiwanesas.");
        for (int index = 0; index < 6; index++) {
            localDeZapatillas.comprarZapatilla();
        }
        int cantidadDeZapatillasCanadienses = localDeZapatillas.cuantasZapatillasCanadienses();
        int cantidadDeZapatillasTaiwanesas = localDeZapatillas.cuantasZapatillasTaiwanesas();
        System.out.println("Cantidad de zapatillas canadienses: " + cantidadDeZapatillasCanadienses);
        System.out.println("Cantidad de zapatillas taiwanesas: " + cantidadDeZapatillasTaiwanesas);
        if (cantidadDeZapatillasCanadienses > cantidadDeZapatillasTaiwanesas) {
            System.out.println("Tienes más zapatillas canadienses");
        } else if (cantidadDeZapatillasCanadienses < cantidadDeZapatillasTaiwanesas) {
            System.out.println("Tienes más zapatillas taiwanesas");
        } else {
            System.out.println("Tienes la misma cantidad de zapatillas canadienses y taiwanesas");
        }

        // Ejercicio 10

    }
}
