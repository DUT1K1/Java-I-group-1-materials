public class Human {
    private int age;
    private String name;
    private String gender;
    final String id = "";

    public void setAge(int age) {
        if (age < 0) {
            return;
        }
        this.age = age;
        this.printInfo();
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
        this.printInfo();
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
        this.printInfo();
    }

    public String getGender() {
        return gender;
    }

    public void printInfo() {
        System.out.println("age: " + age + " name: " + name + " gender: " + gender);
    }
}
