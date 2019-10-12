import java.lang.Math;
import java.util.Scanner;

class Homework2 {
    // En lugar de comentarios, usé los sysout como guía (de paso sirven para cuendo ejecuto el programa)
    public static void exercise1() {
        System.out.println("Dada la frase: \"Hemos cosechado el doble de duraznos que el año anterior\"");
        String phrase = "Hemos cosechado el doble de duraznos que el año anterior";

        System.out.println("¿Cuántos caracteres hay en la frase?");
        System.out.println(phrase.length());

        System.out.println("¿Qué devuelve el método frase.charAt(9)?");
        System.out.println(phrase.charAt(9));

        System.out.println("Escribe una instrucción que devuelva la letra \"d\" de durazno");
        System.out.println(phrase.charAt(phrase.indexOf("duraznos")));
    }

    public static void exercise2() {
        System.out.println("Dada la frase: \"Eso que vi fue un gato o un auto?\"");
        String phrase = "Eso que vi fue un gato o un auto?";

        System.out.println("¿Qué se obtiene al hacer la siguiente instrucción: frase.substring(12, 23)?");
        String phrase_substring = phrase.substring(12, 23);
        System.out.println(phrase_substring);

        System.out.println("¿Qué longitud tiene el resultado?");
        System.out.println(phrase_substring.length());
    }

    public static void exercise3() {
        System.out.println("Dada una frase ingresada por el usuario (ingresar frase)");
        Scanner input = new Scanner(System.in);
        String input_phrase = input.nextLine();

        System.out.println("Determina su cantidad de letras");
        System.out.println(input_phrase.length());

        System.out.println("Imprímela en la pantalla");
        System.out.println(input_phrase);
    }

    public static void exercise4() {
        System.out.println("Dada una frase ingresada por el usuario (ingresar frase que contenga al menos una \"t\")");
        Scanner input = new Scanner(System.in);
        String input_phrase = input.nextLine();

        System.out.println("Reemplaza todas las letras \"t\" por letras \"p\"");
        System.out.println(input_phrase.replace("t", "p").replace("T", "P"));
    }

    public static void exercise5() {
        System.out.println("Pedir una frase al usuario");
        Scanner input = new Scanner(System.in);
        String input_phrase = input.nextLine();

        System.out.println("Devolverla en mayúsculas");
        System.out.println(input_phrase.toUpperCase());

        System.out.println("Devolverla en miúsculas");
        System.out.println(input_phrase.toLowerCase());

        System.out.println("Devolverla reemplazando todas las vocales por espacios");
        System.out.println(input_phrase.replaceAll("[aeiouAEIOU]", " "));

        System.out.println("Deterinar si esa frase termina con un signo de admiración");
        if (input_phrase.endsWith("!")) {
            System.out.println("La frase ingresada SI termina con un signo de admiración");
        } else {
            System.out.println("La frase ingresada NO termina con un signo de admiración");
        }

        System.out.println("Deterinar si esa frase empieza con la letra \"H\" (o \"h\")");
        if (input_phrase.startsWith("H") || input_phrase.startsWith("h")) {
            System.out.println("La frase ingresada SI comienza con \"H\" o \"H\"");
        } else {
            System.out.println("La frase ingresada NO comienza con \"H\" o \"H\"");
        }

    }

    public static void exercise6() {
        System.out.println("Escribir programas para resolver las siguientes expresiones matemáticas, solicitando los valores de las variables al usuario");
        Scanner input = new Scanner(System.in);

        System.out.println("x/y + 1");
        System.out.println("¿Cuál es el valor de x?");
        float a_x = input.nextFloat();
        System.out.println("¿Cuál es el valor de y?");
        float a_y = input.nextFloat();
        System.out.println(a_x/a_x + 1);
        System.out.println("");

        System.out.println("(x+y)/(x-y)");
        System.out.println("¿Cuál es el valor de x?");
        float b_x = input.nextFloat();
        System.out.println("¿Cuál es el valor de y?");
        float b_y = input.nextFloat();
        System.out.println((b_x+b_y)/(b_x-b_y));
        System.out.println("");

        System.out.println("b*b/2");
        System.out.println("¿Cuál es el valor de b?");
        float c_b = input.nextFloat();
        System.out.println(Math.pow(c_b, 2)/2.0);
        System.out.println("");

        System.out.println("(a+b)*c/d");
        System.out.println("¿Cuál es el valor de a?");
        float d_a = input.nextFloat();
        System.out.println("¿Cuál es el valor de b?");
        float d_b = input.nextFloat();
        System.out.println("¿Cuál es el valor de c?");
        float d_c = input.nextFloat();
        System.out.println("¿Cuál es el valor de d?");
        float d_d = input.nextFloat();
        System.out.println((d_a+d_b)*d_c/d_d);
        System.out.println("");

        System.out.println("x*y/(a*b)");
        System.out.println("¿Cuál es el valor de x?");
        float e_x = input.nextFloat();
        System.out.println("¿Cuál es el valor de y?");
        float e_y = input.nextFloat();
        System.out.println("¿Cuál es el valor de a?");
        float e_a = input.nextFloat();
        System.out.println("¿Cuál es el valor de b?");
        float e_b = input.nextFloat();
        System.out.println(e_x*e_y/(e_a*e_b));
        System.out.println("");

        System.out.println("(x+y)*(x+y)*(a-b)");
        System.out.println("¿Cuál es el valor de x?");
        float f_x = input.nextFloat();
        System.out.println("¿Cuál es el valor de y?");
        float f_y = input.nextFloat();
        System.out.println("¿Cuál es el valor de a?");
        float f_a = input.nextFloat();
        System.out.println("¿Cuál es el valor de b?");
        float f_b = input.nextFloat();
        System.out.println(Math.pow(f_x+f_y, 2)*(f_a - f_b));
    }

    public static void exercise7() {
        System.out.println("Dadas las siguientes expresiones booleanas, determine, en el papel (si hacer ningún código), cuál es el\n" +
                "orden de evaluación de las mismas, donde X, Y, Z son expresiones que devuelven true o false y numero es\n" +
                "una variable de tipo int.");

        System.out.println("X ӀӀ Y && (numero > 0)");
        System.out.println("1. (numero > 0)");
        System.out.println("2. Y && (numero > 0)");
        System.out.println("3. X ӀӀ Y && (numero > 0)");
        System.out.println("");

        System.out.println("((X && Y) && X && Z) ӀӀ !Y");
        System.out.println("1. (X && Y)");
        System.out.println("2. ((X && Y) && X && Z)");
        System.out.println("3. !Y");
        System.out.println("3. ((X && Y) && X && Z) ӀӀ !Y");
        System.out.println("");

        System.out.println("numero=0 ӀӀ numero<>0 && numero<23");
        System.out.println("1. numero=0");
        System.out.println("2. numero<>0");
        System.out.println("3. numero<23");
        System.out.println("3. numero<>0 && numero<23");
        System.out.println("4. numero=0 ӀӀ numero<>0 && numero<23");
        System.out.println("");

        System.out.println("!Z && Y");
        System.out.println("1. !Z");
        System.out.println("2. !Z && Y");
        System.out.println("");

        System.out.println("(Z && X) ӀӀ Y");
        System.out.println("1. (Z && X)");
        System.out.println("2. (Z && X) ӀӀ Y");
        System.out.println("");

        System.out.println("(Y ӀӀ Z && Z ӀӀ X) ӀӀ !Z && Y");
        System.out.println("1. (Y ӀӀ Z && Z ӀӀ X)");
        System.out.println("2. !Z");
        System.out.println("3. (Y ӀӀ Z && Z ӀӀ X) ӀӀ !Z && Y");
        System.out.println("");
    }

    public static void exercise8() {
        System.out.println("¿Qué imprimirá en pantalla el siguiente programita?\n" +
                "public class MyClass\n" +
                "{\n" +
                " public static void main(String[] args)\n" +
                " {\n" +
                " int x = 3;\n" +
                " if(x < 3)\n" +
                " {\n" +
                " System.out.print(\"x\");\n" +
                " }\n" +
                " else\n" +
                " {\n" +
                " System.out.print(\"y\");\n" +
                " }\n" +
                " }\n" +
                "}");
        System.out.println("---> Imprimirá \"y\"");
    }

    public static void exercise9() {
        System.out.println("¿Qué imprimirá en pantalla el siguiente programita?\n" +
                "public class MyClass\n" +
                "{\n" +
                " public static void main(String[] args)\n" +
                " {\n" +
                " int a = 47;\n" +
                " int b = 0;\n" +
                " if(b == 0)\n" +
                " {\n" +
                " System.out.print(\"No se puede dividir por cero\");\n" +
                " }\n" +
                " else\n" +
                " {\n" +
                " System.out.print(\"El resultado de dividir a por b es =\" + a/b);\n" +
                " }\n" +
                " }\n" +
                "}");
        System.out.println("---> Imprimirá \"No se puede dividir por cero\"");
    }

    public static void exercise10() {
        System.out.println("Realizar un programita que pida un número y devuelva +1 si éste es positivo y -1 si éste es negativo.");

        System.out.println("Escribe un número positivo o negativo");
        Scanner input = new Scanner(System.in);

        float value = input.nextFloat();
        if (value < 0) {
            System.out.println(-1);
        } else {
            System.out.println("+1"); // used string to show the "+" sign
        }
    }

    public static void exercise11() {
        System.out.println("Realizar un programita que pida un número y devuelva +1 si éste es positivo y 0 si éste es negativo.");
        System.out.println("Escribe un número positivo o negativo");
        Scanner input = new Scanner(System.in);

        float value = input.nextFloat();
        if (value < 0) {
            System.out.println(0);
        } else {
            System.out.println("+1"); // used string to show the "+" sign
        }
    }

    public static void exercise12() {
        System.out.println("Realizar un programita que pida dos números enteros y devuelva 1 si ambos números son iguales, y 0 sino.");
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe un número");
        float value = input.nextFloat();
        System.out.println("Escribe otro número");
        float value2 = input.nextFloat();

        if (value == value2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void exercise13() {
        System.out.println("Realizar un programita que pida 3 números enteros n, a y b. Y determine si n se encuentra en el intervalo\n" +
                "cerrado [a, b] devolviendo verdadero o falso según corresponda");
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuál es el valor entero de n?");
        int n = input.nextInt();
        System.out.println("¿Cuál es el valor entero de a?");
        int a = input.nextInt();
        System.out.println("¿Cuál es el valor entero de b?");
        int b = input.nextInt();

        // @NOTE: check which is bigger between "a" and "b" to use the correct interval
        int bigger;
        int smaller;
        if (a < b) {
            smaller = a;
            bigger = b;
        } else {
            smaller = b;
            bigger = a;
        }

        System.out.println("¿\"n\" se encuentra en el intervalo indicado?");
        System.out.println(n >= smaller && n <= bigger);
    }

    public static void exercise14() {
        System.out.println("Realizar un programita que pida dos números y determine cuál de ellos es el mayor.");
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe un número");
        int a = input.nextInt();
        System.out.println("Escribe otro número");
        int b = input.nextInt();

        if (a < b) {
            System.out.println("El mayor es " + b);
        } else if (a > b) {
            System.out.println("El mayor es " + a);
        } else {
            System.out.println("Los dos números son iguales");
        }
    }

    public static void exercise15() {
        System.out.println("Realizar un programita que pida dos números y determine cuál de ellos es el menor.");
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe un número");
        int a = input.nextInt();
        System.out.println("Escribe otro número");
        int b = input.nextInt();

        if (a < b) {
            System.out.println("El menor es " + a);
        } else if (a > b) {
            System.out.println("El menor es " + b);
        } else {
            System.out.println("Los dos números son iguales");
        }
    }

    public static void exercise16() {
        System.out.println("Realizar un programita que pida un número entero y determine si es par o impar.");
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe un número entero");
        int a = input.nextInt();

        if (a % 2 == 0) {
            System.out.println("El número ingresado es PAR.");
        } else {
            System.out.println("El número ingresado es IMPAR.");
        }
    }

    public static void exercise17() {
        System.out.println("Realizar un programita que pida 3 números enteros menores a 550 y determine si son los 3 iguales, o todos\n" +
                "diferentes entre sí, o si, ni son iguales ni son todos diferentes");
        Scanner input = new Scanner(System.in);

        System.out.println("Escriba un número entero menor a 550");
        int a = input.nextInt();
        while (a >= 550) {
            System.out.println("El número debe ser un entero menor a 550");
            a = input.nextInt();
        }
        System.out.println("Escriba otro número entero menor a 550");
        int b = input.nextInt();
        while (b >= 550) {
            System.out.println("El número debe ser un entero menor a 550");
            b = input.nextInt();
        }
        System.out.println("Escriba un último número entero menor a 550");
        int c = input.nextInt();
        while (c >= 550) {
            System.out.println("El número debe ser un entero menor a 550");
            c = input.nextInt();
        }

        if (a == b && a == c) {
           System.out.println("---> Los tres números son iguales");
        } else if (a == b || a == c || b == c) {
            System.out.println("---> Dos de los tres números son iguales");
        } else {
            System.out.println("---> Los tres números son distintos");
        }
    }

    public static void exercise18() {
        System.out.println("Realizar un programita que pida 3 números enteros e imprima en pantalla si están en orden creciente, o en\n" +
                "orden decreciente, o no cumplen un orden.");
        Scanner input = new Scanner(System.in);

        System.out.println("Escriba un número entero");
        int a = input.nextInt();
        System.out.println("Escriba otro número entero");
        int b = input.nextInt();
        System.out.println("Escriba un último número entero");
        int c = input.nextInt();

        // @NOTE: el "<=" es a propósito...
        if (a <= b && b <= c) {
            System.out.println("Los números están en orden creciente");
        } else if (a >= b && b >= c) {
            System.out.println("Los números están en orden decreciente");
        } else {
            System.out.println("Los tres números no siguen ningún orden");
        }
    }

    public static void stringbuilder1() {
        System.out.println("Con la ayuda del método reverse de la clase Stringbuilder verifique si las siguientes palabras son");
        String[] words = {"Anana", "Sotos", "Sus", "Motor", "Sometemos", "Suertes"};

        StringBuilder word_buffer = new StringBuilder();
        for (String word : words) {
            word_buffer.append(word).reverse();
            if (word.toLowerCase().equals(word_buffer.toString().toLowerCase())) {
                System.out.println(word + " SI es un palíndromo");
            } else {
                System.out.println(word + " NO es un palíndromo");
            }
            word_buffer.setLength(0);
        }
    }

    public static void stringbuilder2() {
        System.out.println("Con la ayuda del método reverse de la clase Stringbuilder verifique si las siguientes palabras son");
        int number1 = 7337;
        int number2 = 11311;
        int number3 = 113131;
        int[] ints = {number1, number2, number3};

        StringBuilder ints_buffer = new StringBuilder();
        for (int integer : ints) {
            ints_buffer.append(integer).reverse();
            if (integer == Integer.valueOf(ints_buffer.toString())) {
                System.out.println(integer + " SI es capicúa");
            } else {
                System.out.println(integer + " NO es capicúa");
            }
            ints_buffer.setLength(0);
        }
    }

    public static void stringbuilder3() {
        System.out.println("Con la ayuda del método replace de la clase Stringuilder proceda a modificar los strings según se indica\n" +
                "a continuación: ");

        System.out.println("\"Nuestros\" cambiar a \"Nosotros\"");
        StringBuilder ours_to_we = new StringBuilder("Nuestros").replace(1, 5, "osot");
        System.out.println("--->" + ours_to_we.toString());

        System.out.println("\"JAVA Programming Language\" cambiar a \"JAVA Platform for Windows\"");
        StringBuilder java_lang = new StringBuilder("JAVA Programming Language");
        java_lang.replace(6, java_lang.length() - 1, "latform for Windows");
        System.out.println("--->" + java_lang.toString());

        System.out.println("\"Poderío\" a \"Potrero\"");
        StringBuilder power = new StringBuilder("Poderío").replace(2, 6, "trer");
        System.out.println("--->" + power.toString());
    }

    public static void main (String[] args) {
        System.out.println("\nEjercicio 1:");
        exercise1();
        System.out.println("\nEjercicio 2:");
        exercise2();
        System.out.println("\nEjercicio 3:");
        exercise3();
        System.out.println("\nEjercicio 4:");
        exercise4();
        System.out.println("\nEjercicio 5:");
        exercise5();
        System.out.println("\nEjercicio 6:");
        exercise6();
        System.out.println("\nEjercicio 7:");
        exercise7();
        System.out.println("\nEjercicio 8:");
        exercise8();
        System.out.println("\nEjercicio 9:");
        exercise9();
        System.out.println("\nEjercicio 10:");
        exercise10();
        System.out.println("\nEjercicio 11:");
        exercise11();
        System.out.println("\nEjercicio 12:");
        exercise12();
        System.out.println("\nEjercicio 13:");
        exercise13();
        System.out.println("\nEjercicio 14:");
        exercise14();
        System.out.println("\nEjercicio 15:");
        exercise15();
        System.out.println("\nEjercicio 16:");
        exercise16();
        System.out.println("\nEjercicio 17:");
        exercise17();
        System.out.println("\nEjercicio 18:");
        exercise18();

        // StringBuilder

        System.out.println("\nStringBuilder - Ejercicio 1:");
        stringbuilder1();
        System.out.println("\nStringBuilder - Ejercicio 2:");
        stringbuilder2();
        System.out.println("\nStringBuilder - Ejercicio 3:");
        stringbuilder3();
    }
}