import java.util.Arrays;
import java.util.Scanner;

public class LocalDeZapatillas {
    private Zapatilla[] zapatillas;
    private Scanner scanner = new Scanner(System.in);
    enum Industria {TAIWANESA, CANADIENSE};

    public Zapatilla[] getZapatillas() {
        return zapatillas;
    }

    private int cuantasZapatillasDeIndustria(String industria) {
        int cantidad = 0;
        for (Zapatilla zapatilla : zapatillas) {
            if (zapatilla.getIndustria() == industria) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int cuantasZapatillasTaiwanesas() {
        return this.cuantasZapatillasDeIndustria(Industria.TAIWANESA.toString());
    }

    public int cuantasZapatillasCanadienses() {
        return this.cuantasZapatillasDeIndustria(Industria.CANADIENSE.toString());
    }

    public void comprarZapatilla() {
        String marca;
        String modelo;
        int numero;
        Industria industria = null;
        marca = scanner.nextLine();
        modelo = scanner.nextLine();
        numero = scanner.nextInt();
        System.out.println("Industria TAIWANESA (1) o CANCADIENSE (2) (selecciona el número corespondiente)");
        int industria_index = 0;
        while (industria_index != 1 && industria_index != 2) {
            industria_index = scanner.nextInt();
        }
        industria = Industria.values()[industria_index];
    }

}
