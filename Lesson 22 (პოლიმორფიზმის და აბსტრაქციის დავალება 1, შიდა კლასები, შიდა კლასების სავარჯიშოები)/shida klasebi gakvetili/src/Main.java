public class Main {
    public static void main(String[] args) {
//        Person.Heart heart = new Person.Heart(100, 200);
//        Person person = new Person(
//                "Davit",
//                "Maisuradze",
//                21,
//                heart
//        );
//        person.setHeart(heart);
//        System.out.println(person);


//        ClassA classA = new ClassA();
//        classA.number(10);

        MathOperations mathOperations = new MathOperations() {
            @Override
            public void add(int a, int b) {
                System.out.println(a + b);
            }
        };


        mathOperations.add(15, 20);
    }
}
