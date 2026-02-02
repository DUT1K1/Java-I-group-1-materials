import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Google", 2004);
        User user = new User("Davit", "Maisuradze", 21, company);
        System.out.println(user);
        long companySerialVersionUID = ObjectStreamClass
                .lookup(company.getClass())
                .getSerialVersionUID();
        long userSerialVersionUID = ObjectStreamClass
                .lookup(user.getClass())
                .getSerialVersionUID();
        System.out.println(companySerialVersionUID);
        System.out.println(userSerialVersionUID);

        try (
                FileOutputStream fos = new FileOutputStream("userfile.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
