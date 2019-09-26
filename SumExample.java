class SumExample {
    public static int sum(int first_term, int second_term) {
        int result = first_term + second_term;

        return result;
    }
    public static void main (int[] args) {
        System.out.println(args);
        int sum_result = sum(1, 2);
        System.out.println("1 + 2 = " + sum_result);
    }
}
