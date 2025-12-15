public class Outer {
    private String message = "Hello from inner class";

    class Inner {
        public void printMessage() {
            System.out.println(message);
        }
    }
}
