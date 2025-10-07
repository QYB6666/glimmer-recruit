package Nine.NinthQ1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
public class Copy {
    public static void main(String[] args) {
        File source = new File("C:\\Users\\29867\\Desktop\\daima\\NinthQ1\\doro.jpg");
        File dest = new File("C:\\Users\\29867\\Desktop\\daima\\NinthQ1\\doro_copy.jpg");
    try (InputStream fis = new FileInputStream(source);
         OutputStream fos = new FileOutputStream(dest)) {
        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) != -1) {
        fos.write(buffer, 0, length);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    }
}
