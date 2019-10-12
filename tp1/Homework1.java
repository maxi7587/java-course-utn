import java.lang.Math;
import java.util.Scanner;

class Homework1 {
    public static void exercise_1() {
        System.out.println("Exercise 1:\n");

        System.out.println("18 / 3 = " + 18 / 3);
        System.out.println("18 / 3.0 = " + 18 / 3.0);
    }

    public static void exercise_2() {
        System.out.println("Exercise 2:\n");

        double sqaure_root_458 = Math.sqrt(458);
        System.out.println("Square root of 548 using decimals:" + sqaure_root_458);

        int sqaure_root_int = (int) sqaure_root_458;
        System.out.println("Square root of 548 truncated: " + sqaure_root_int);
    }

    public static void exercise_2_2() {
        System.out.println("Exercise 2 (2):\n");

        System.out.println("2.a (2+8)*(6-2) = " + (2+8)*(6-2));
        System.out.println("int variable required\n");

        System.out.println("2.b (2*(10-2))/(-1*(8-12)) = " + (2*(10-2))/(-1*(8-12)));
        System.out.println("int variable required\n");

        double c_mult = 3 * Math.sqrt(9);
        System.out.println("2.c 3 * Math.sqrt(9) = " + c_mult);
        System.out.println("float (or double) variable required\n");

        System.out.println("2.d (1+2+3+4+5+6+7+8+9+10) = " + (1+2+3+4+5+6+7+8+9+10));
        System.out.println("int variable required\n");

        int start = 2;
        int end = 8;
        int index = 2;
        int total = start;
        while(index < end) {
            total = (index + 1) * total;
            index = index + 1;
        }
        System.out.println("2.e 2...8 (multiplicatorio) = " + total);
        System.out.println("int variable required\n");

        System.out.println("2.f (1/2)+(2/3)+(3/4)+(4/5) = " + ((1.0/2) + (2.0/3) + (3.0/4) + (4.0/5)));
        System.out.println("float (or double) variable required\n");

        System.out.println("2.g 3 + 4 = " + (3+4));
        System.out.println("int variable required\n");

        double h = (-8 + Math.sqrt((Math.pow(8, 2)) - 4*3)) / (2*3);
        System.out.println("2.h (-8 + Math.sqrt((Math.pow(8, 2)) - 4*3)) / (2*3) = " + h);
        System.out.println("float (or double) variable required\n");
    }

    public static double exercise_3(float fahrenheit) {
        System.out.println("Exercise 3:\n");
        double celsius = (5/9) * (fahrenheit - 32);
        System.out.println("Converting Fahrenheit to Celsius...");

        return celsius;
    }

    public static void exercise_4() {
        System.out.println("Exercise 4:\n");
        char c = 'a';
        System.out.println("(char) \"a\" + 5 = " + (c + 5));
    }

    public static double exercise_5() {
        System.out.println("Exercise 5:\n");
        System.out.println("Select some \"inches\" measure to convert into \"meters\"");
        Scanner input = new Scanner(System.in);
        int inches_input = input.nextInt();
        double meters = inches_input * 0.0254;
        System.out.println(inches_input + " inches equal " + meters + " meters.");

        return meters;
    }

    public static double exercise_6() {
        System.out.println("Exercise 6: calculate the average of three scores\n");
        Scanner input = new Scanner(System.in);
        System.out.println("First score");
        float note_1 = input.nextFloat();
        System.out.println("Second score");
        float note_2 = input.nextFloat();
        System.out.println("Last score");
        float note_3 = input.nextFloat();
        double notes_prom = (note_1 + note_2 + note_3) / 3;
        System.out.println("Your scores' average is " + notes_prom);

        return notes_prom;
    }

    public static void exercise_7() {
        Scanner input = new Scanner(System.in);
        System.out.println("Exercise 7: cuadratic function (ax2 + bx + c) roots calculation\n");
        System.out.println("Fist constant (a)");
        float a = input.nextFloat();
        System.out.println("Second constant (b)");
        float b = input.nextFloat();
        System.out.println("Last constant (c)");
        float c = input.nextFloat();
        double root_1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double root_2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        System.out.println("The roots for your function are " + root_1 + " and " + root_2);
    }

    public static void main (String[] args) {
        exercise_1();
        System.out.println("");

        exercise_2();
        System.out.println("");

        exercise_2_2();
        System.out.println("");

        double celsius = exercise_3(500);
        System.out.println("500 Fahrenheit are " + celsius + " Celsius.\n");

        exercise_4();
        System.out.println("");

        double meters = exercise_5();
        System.out.println("");

        double notes_prom = exercise_6();
        System.out.println("");

        exercise_7();
    }
}
