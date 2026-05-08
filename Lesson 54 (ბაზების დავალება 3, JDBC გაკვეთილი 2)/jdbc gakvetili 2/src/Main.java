public class Main {
    public static void main(String[] args) {
        // DAO - Data Access Object
        StudentDao sd = new StudentDaoImplementation();
        Student createdStudent = sd.create(new Student("John", "Doe"));
        System.out.println(createdStudent);
    }
}
