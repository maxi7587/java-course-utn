public class App {
    public static void main(String[] args) {
        String greeting = "Hello from java\u2122!";
        System.out.println(greeting);
        System.out.println(greeting.substring(0, 10));

        String hello_world = "Hello World!";
        System.out.println(hello_world);
        System.out.println(greeting.substring(0, 5));

        String hello = "Hello";
        String world = "World";
        String hello_world_joined = hello + " " + world;
        System.out.println(hello_world_joined);
        String hello_world_concat = hello.concat(world);
        System.out.println(hello_world_concat);
        String week_days = String.join("-", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
        System.out.println(week_days);

        String first_string = "jaja";
        String second_string = "jaja";
        System.out.println((first_string == second_string));
        System.out.println(first_string.equals(second_string));
        System.out.println(Integer.toHexString(first_string.hashCode()));
        System.out.println(Integer.toHexString(second_string.hashCode()));
        System.out.println((Integer.toHexString(first_string.hashCode()) == Integer.toHexString(second_string.hashCode())));

        System.out.println("".length());

        String lower_case = "java";
        String upper_case = "Java";
        System.out.println(lower_case.equalsIgnoreCase(upper_case));

        String null_string = null;
        if (null != null_string && !null_string.isEmpty()) {
            System.out.println("String is not null");
        } else {
            System.out.println("String is null");
        }
    }
}
