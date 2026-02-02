import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        String filePath = "/Users/davidmaisuradze/Mziuri group 1/Lesson 31 (serialization)/serialization 1/userfile.txt";

        User user = null;
        try (
                FileInputStream fis = new FileInputStream(filePath);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            user = (User) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        user.sayHello();
        System.out.println(user);
    }
}
