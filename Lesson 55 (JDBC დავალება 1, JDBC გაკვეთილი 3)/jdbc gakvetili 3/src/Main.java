public class Main {
    public static void main(String[] args) {
        // DAO - Data Access Object
        StudentDao sd = new StudentDaoImplementation();
//        Student createdStudent = sd.create(new Student("John", "Doe"));
//        System.out.println(createdStudent);

//        sd.findAll().forEach(System.out::println);
//        System.out.println(sd.findById(1111));


//        Student student = sd.findById(11);
//        System.out.println(student);
//        System.out.println("=====================");
//        student.setFirstName("Jane");
//        student.setLastName("Maisuradze");
//        Student updatedStudent = sd.update(student);
//        System.out.println(updatedStudent);

        sd.delete(11);
    }
}
