class SecondExample {
    static final int CONSTANT = 20;
    enum Size { SMALL, LARGE, EXTRA_LARGE };
    // enum Any { int, short, long, byte, float, double, char };

    // static void print(Any arg) {
    //     System.out.println(arg);
    // }

    public static void main (String[] args) {
        int hexaVar= 0xCA;
        System.out.println("hexaVar: " + hexaVar);

        int million = 1_000_000;
        System.out.println("million: " + million);

        double doubleRest = 2.0 - 1.1;
        System.out.println("doubleRest: " + doubleRest);

        int x = 0;
        if (x == 0) {
            System.out.println("X is TRUTHY");
        } else {
            System.out.println("X is FALSY");
        }

        char TM = '\u2122';
        System.out.println("TM: " + TM);

        char pi = '\u03C0';
        System.out.println("pi: " + pi);

        System.out.println(CONSTANT);

        int div1 = 15/2;
        double div2 = 15.0/2.0;
        int div3 = 15%2;
        System.out.println(div1);
        System.out.println(div2);
        System.out.println(div3);
        // print(div2);

        Size small = Size.SMALL;
        System.out.println(small);
        System.out.println(small.ordinal());

        Size xl = Size.EXTRA_LARGE;
        System.out.println(xl);
        System.out.println(xl.ordinal());
    }
}
