package tp3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    /**
     * Dados dos números, num1 y num2, ingresados por el usuario, intercambiar los valores entre sí que éstos
     * tienen.
     */
    public static void exercise1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Elige dos números (presiona \"Enter\" después de cada uno)");
        float first_input = input.nextFloat();
        float second_input = input.nextFloat();
        System.out.println("El primero es " + first_input + " y el segundo es " + second_input);

        float pivot = first_input;

        first_input = second_input;
        second_input = pivot;

        System.out.println("Ahora los rotamos: " + first_input + " y " + second_input);
    }

    /**
     * Realizar un programita que permita ingresar al usuario un número entero positivo, y devuelva ese número
     * en letras, es decir si ingresa 1 el programa devolverá “UNO”. Siempre que los números estén entre 1 y 10.
     * Para cualquier otro número se devolverá la palabra “Otro.”
     */
    public static String exercise2() {
        Scanner input = new Scanner(System.in);

        System.out.println("Elige un número entero del 1 al 10");
        int integer_input = input.nextInt();

        System.out.println("Has elegido el número " + integer_input);

        if (integer_input > 10 || integer_input < 1) {
            System.out.print("Convertido en una palabra es otro");

            return "Otro";
        }
        String[] number_strings = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez" };

        System.out.println("Convertido en una palabra es " + number_strings[integer_input - 1]);

        return number_strings[integer_input];
    }

    /**
     * ¿Cuál es la salida de los siguientes bucles?
     * a) for (n = 10; n > 0; n = n–2) {
     *     System.out.println("Hola");
     *     System.out.println(n);
     * }
     * b) double n = 2;
     * for (; n > 0; n = n-0.5)
     *     System.out.println(n);
     */
    public static void exercise3() {
        System.out.println("3.a");
        System.out.println("Hola");
        System.out.println("10");
        System.out.println("Hola");
        System.out.println("8");
        System.out.println("Hola");
        System.out.println("6");
        System.out.println("Hola");
        System.out.println("4");
        System.out.println("Hola");
        System.out.println("2");

        System.out.println("3.b");
        System.out.println("2.0");
        System.out.println("1.5");
        System.out.println("1.0");
        System.out.println("0.5");
    }

    /**
     * Realizar un programita que permita ingresar una palabra al usuario, y luego muestre en pantalla una letra
     * por línea.
     */
    public static void exercise4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escibe una palabra");
        String string_input = input.nextLine();

        for (int letter_index = 0; letter_index < string_input.length(); letter_index++) {
            System.out.println(string_input.charAt(letter_index));
        }
    }

    /**
     * Realizar un programita equivalente al anterior, pero esta vez, los caracteres de la palabra se mostrarán en
     * orden inverso, es decir para la palabra “zapato” por ejemplo, se verá en pantalla
     */
    public static void exercise5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escibe una palabra");
        String string_input = input.nextLine();

        for (int letter_index = string_input.length() - 1; letter_index >= 0; letter_index--) {
            System.out.println(string_input.charAt(letter_index));
        }
    }

    /**
     * Realizar un programita que permita ingresar una palabra al usuario, y muestre en pantalla todas sus
     * consonantes, una por línea.
     */
    public static void exercise6() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escibe una palabra");
        String string_input = input.nextLine();

        String vocals = "aeiou";

        for (int letter_index = 0; letter_index < string_input.length(); letter_index++) {
            if (!vocals.contains(string_input.substring(letter_index, letter_index + 1))) {
                System.out.println(string_input.charAt(letter_index));
            }
        }
    }

    /**
     * Realizar un programita que permita ingresar una frase al usuario, y cuente cuantas vocales tiene.
     */
    public static void exercise7() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escibe una frase");
        String string_input = input.nextLine();

        String vocals = "aeiou";
        int counter = 0;

        for (int letter_index = 0; letter_index < string_input.length(); letter_index++) {
            if (vocals.contains(string_input.substring(letter_index, letter_index + 1))) {
                counter++;
            }
        }

        System.out.println("La frase seleccionada tiene " + counter + " vocales");
    }

    /**
     * Realizar un programita que permita ingresar una frase al usuario y cuente la cantidad de espacios que tiene
     */
    public static void exercise8() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escibe una frase");
        String string_input = input.nextLine();

        int counter = 0;

        for (int letter_index = 0; letter_index < string_input.length(); letter_index++) {
            if (string_input.charAt(letter_index) == ' ') {
                counter++;
            }
        }

        System.out.println("La frase que escribiste tiene " + counter + " espacios");
    }

    /**
     * Realizar un programita que permita ingresar una frase y cuente la cantidad de palabras que tiene.
     */
    public static void exercise9() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escibe una frase");
        String phrase = input.nextLine();

        String[] phrase_words = phrase.split(" ");
        System.out.println("La frase que escribiste tiene " + phrase_words.length + " palabras");
    }

    /**
     * Realizar un programita que permita ingresar un número n, y determine si éste es primo o no.
     * * Los números primos son aquellos que sólo son divisibles por 1 y por sí mismos.
     */
    public static void exercise10() {
        Scanner input = new Scanner(System.in);
        System.out.println("Elige un número");
        int prime_number = input.nextInt();
        boolean is_prime = true;

        for (int index = 2; index < prime_number; index++) {
            if (prime_number%index == 0) {
                is_prime = false;
                break;
            }
        }

        if (is_prime) {
            System.out.println("El número que elegiste SI es primo");
        } else {
            System.out.println("El número que elegiste NO es primo");
        }
    }

    /**
     * Realizar un programita que, pida 10 números al usuario y los guarde en un array, y luego los sume,
     * mostrando el resultado en pantalla.
     */
    public static void exercise11() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe 10 números (presionando \"Enter\" después de cada uno)");
        final Float[] sum = { new Float(0) };
        List<Float> numbers_list = new ArrayList<Float>();

        // @note podría haberlo hecho en un solo bucle, pero el ejercicio decía hacerlo en 2 partes...
        for (int index = 0; index < 10; index++) {
            numbers_list.add(input.nextFloat());
        }

        // @note ¿por qué no se puede acceder a la variable sum si es "int", pero si cuando es un objeto?
        numbers_list.forEach((Float n) -> {
            sum[0] += n;
        });

        System.out.printf("La suma de los números elegidos es " + sum[0]);
    }

    /**
     * Realizar un programita que dadas 30 notas de alumnos de un curso referidas a un examen que todos
     * rindieron, devuelva la nota promedio de todo el curso en ese examen.
     */
    public static void exercise12() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe las notas de 30 alumnos (presionando \"Enter\" después de cada una)");
        int sum = 0;

        for (int index = 0; index < 30; index++) {
            sum = sum + input.nextInt();
        }

        double prom = sum / 30d;
        System.out.println("El promedio de las 30 notas es " + prom);
    }

    /**
     * Realizar un programita que permita encontrar la lista de los primeros 20 números primos de los números
     * Naturales.
     */
    public static void exercise13() {
        System.out.println("Los primeros 20 números naturales primos son:");

        List<Integer> primes_list = new ArrayList<Integer>();

        int index = 1;
        boolean is_prime;
        while (primes_list.size() < 20) {
            is_prime = true;
            for (int sub_index = 2; sub_index < index; sub_index++) {
                if (index%sub_index == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                primes_list.add(index);
            }
            index++;
        }
        System.out.println(primes_list);
    }

    /**
     * Realizar un programita que permita ingresar 10 números enteros al usuario. Determinar cuál es el valor
     * máximo de todos ellos.
     */
    public static void exercise14() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe 10 números enteros (presionando \"Enter\" después de cada uno)");

        int max_value = 0;
        for (int index = 0; index < 10; index++) {
            int user_input = input.nextInt();
            if (max_value < user_input) {
                max_value = user_input;
            }
        }

        System.out.println("El número más grande entre los elegidos es " + max_value);
    }

    /**
     * Realizar un programita que permita ingresar 10 números enteros al usuario. Determinar cuál es el valor
     * mínimo de todos ellos.
     */
    public static void exercise15() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe 10 números enteros (presionando \"Enter\" después de cada uno)");

        int min_value = Integer.MAX_VALUE;
        for (int index = 0; index < 10; index++) {
            int user_input = input.nextInt();
            if (min_value > user_input) {
                min_value = user_input;
            }
        }

        System.out.println("El número más pequeño entre los elegidos es " + min_value);
    }

    /**
     * Realizar un programita que dado un arreglo de 20 números, todos ordenados al azar, cada número siendo 1
     * o 0, ordene el mismo, poniendo todos los ceros a la izquierda del arreglo, y los unos a la derecha del mismo.
     */
    public static void exercise16(List<Integer> binary_array) {
        if (binary_array.size() != 20) {
            System.out.println("El ejercicio 16 recibe una lista de 20 números (ni más ni menos). Todos deben ser 0 o 1.");
        }
        System.out.println("La lista recibida es la siguiente");
        System.out.println(binary_array.toString());
        final List<Integer> final_list = new ArrayList<Integer>();
        final List<Integer> ones = new ArrayList<Integer>();

        binary_array.forEach((Integer item) -> {
            if (item == 0) {
                final_list.add(item);
            } else if (item == 1) {
                ones.add(item);
            } else {
                System.out.println("Alguno de los núemros de la lista pasada en el ejercicio 16 no es un 0 o un 1... será omitido");
            }
        });
        final_list.addAll(ones);
        System.out.println("Hemos ordenado los números del array");
        System.out.println(final_list.toString());
    }

    /**
     * Dado la siguiente matriz:
     * 4 7 -5 4
     * 0 3 -2 6
     * 1 2 4 1
     * 6 1 0 3
     * Escribir un programita que encuentre la suma de todos los elementos que no pertenecen a la diagonal
     * principal.
     */
    public static void exercise17() {
        int[][] matrix = {{4, 7, -5, 4, 9}, {0, 3, -2, 6, -2}, {1, 2, 4, 1, 1}, {6, 1, 0, 3, -4}};
        int sum = 0;

        for (int index = 0; index < 4; index ++) {
            for (int sub_index = 0; sub_index < 4; sub_index ++) {
                if (index != sub_index) {
                    sum += matrix[index][sub_index];
                }
            }
        }

        System.out.println("Dada la siguiente matriz:");
        System.out.println(matrix.toString());
        System.out.println("La suma de todos los elementos que no pertenecen a la diagonal principal de la matriz es " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Ejercicio 1\n");
        exercise1();
        System.out.println("Ejercicio 2\n");
        exercise2();
        System.out.println("Ejercicio 3\n");
        exercise3();
        System.out.println("Ejercicio 4\n");
        exercise4();
        System.out.println("Ejercicio 5\n");
        exercise5();
        System.out.println("Ejercicio 6\n");
        exercise6();
        System.out.println("Ejercicio 7\n");
        exercise7();
        System.out.println("Ejercicio 8\n");
        exercise8();
        System.out.println("Ejercicio 9\n");
        exercise9();
        System.out.println("Ejercicio 10\n");
        exercise10();
        System.out.println("Ejercicio 11\n");
        exercise11();
        System.out.println("Ejercicio 12\n");
        exercise12();
        System.out.println("Ejercicio 13\n");
        exercise13();
        System.out.println("Ejercicio 14\n");
        exercise14();
        System.out.println("Ejercicio 15\n");
        exercise15();
        System.out.println("Ejercicio 16\n");
        List<Integer> integers_list = new ArrayList();
        Random rand_number = new Random();
        for (int index = 0; index < 20; index++) {
            integers_list.add(new Integer(rand_number.nextInt(2)));
        }
        exercise16(integers_list);
        System.out.println("Ejercicio 17\n");
        exercise17();
    }
}
