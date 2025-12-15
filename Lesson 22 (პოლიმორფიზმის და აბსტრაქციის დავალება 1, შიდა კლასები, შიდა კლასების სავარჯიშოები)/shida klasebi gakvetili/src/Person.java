public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Heart heart;

    public Person(String firstName, String lastName, int age, Heart heart) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.heart = heart;
    }

    public static class Heart {
        private double weight;
        private double volume;

        public Heart(double weight, double volume) {
            this.weight = weight;
            this.volume = volume;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getVolume() {
            return volume;
        }

        public void setVolume(double volume) {
            this.volume = volume;
        }

        @Override
        public String toString() {
            return "Heart{" +
                    "weight=" + weight +
                    ", volume=" + volume +
                    '}';
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age + " " +
                heart.toString() + '}';
    }
}
