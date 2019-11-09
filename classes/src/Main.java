public class Main {

    public static void main(String[] args) {
        Client client_1 = new Client("Maximiliano");
        client_1.setName("Maxi").setEmail("maxi7587@hotmail.com").setDni("33579775");
        client_1.greet();
        client_1.tellMyId();

        Client client_2 = new Client("Vanina");
        client_2.greet();
        client_2.tellMyId();
    }
}
