package Nine.NinthQ3;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "doro", 2, "114514");
       
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"))) {
            oos.writeObject(student);     // 序列化
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"))) {
            Student doro = (Student) ois.readObject();// 反序列化
            System.out.println(doro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
