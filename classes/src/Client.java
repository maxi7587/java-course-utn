public class Client {
    private static int nextId;
    private int id;
    private String name;
    private String email;
    private String dni;

    public Client(String name, String email, String dni) {
        this.name = name;
        this.email = email;
        this.dni = dni;
        this.init();
    }

    public Client(String name) {
        this.name = name;
        this.init();
    }

    private void init() {
        nextId = nextId + 1;
        id = nextId;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public Client setName(String name) {
        this.name = name;

        return this;
    }

    public String getEmail() {
        return email;
    }

    public Client setEmail(String email) {
        this.email = email;

        return this;
    }

    public String getDni() {
        return dni;
    }

    public Client setDni(String dni) {
        this.dni = dni;

        return this;
    }

    public String greet() {
        String greeting = "Hello, I'm " + this.name;
        System.out.println(greeting);

        return greeting;
    }

    public String tellMyId() {
        String my_id_is = "My ID is " + this.id;
        System.out.println(my_id_is);

        return my_id_is;
    }
}
