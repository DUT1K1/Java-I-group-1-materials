public class Main {
    public static void main(String[] args) {
//        Outer outer = new Outer();
//        Outer.Inner inner = outer.new Inner();
//        inner.printMessage();


//        MathUtils utils = new MathUtils();
//        MathUtils.Operations operations = utils.new Operations();
//        System.out.println(operations.factorial(5));


//        Human human = new Human();
//        Human.Address address = human.new Address("New York", 10001);


//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello from anonymous class");
//            }
//        };
//        runnable.run();


        Shape shape = new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing a shape");
            }
        };
        shape.draw();
    }
}
