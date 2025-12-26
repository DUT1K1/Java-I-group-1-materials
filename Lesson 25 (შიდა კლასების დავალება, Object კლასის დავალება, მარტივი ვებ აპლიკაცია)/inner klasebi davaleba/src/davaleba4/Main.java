package davaleba4;

public class Main {
    public static void main(String[] args) {
        Notification n = new Notification(
                "John Doe", "Jane Smith", "Hello, how are you?"
        ) {

            @Override
            public void send() {
                System.out.println("Message sent!");
                System.out.println(getSender() + " -> " + getReceiver() + ": " + getMessage());
            }

            @Override
            public void receive() {
                System.out.println("Message received!");
                System.out.println(getMessage());
            }
        };

        n.send();
        n.receive();
    }
}
