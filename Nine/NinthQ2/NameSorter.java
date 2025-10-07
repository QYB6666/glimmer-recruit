package Nine.NinthQ2;
import java.io.*;
import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\29867\\Desktop\\daima\\Nine\\NinthQ2\\n" + //
                "ame.txt"), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line.trim();
                if (!name.isEmpty()) {
                    names.add(name);
                }
            }
        } catch (Exception e) {
             e.getMessage();
            return;
        }
        Collections.sort(names); // 按 Unicode 排序
    try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\29867\\Desktop\\daima\\Nine\\NinthQ2\\n" + //
                "ame_sorted.txt"), "UTF-8"))) {
            for (String name : names) {
                writer.write(name);
                writer.newLine();//。它会根据当前操作系统自动选择合适的换行符，比如 Windows 下是 \r\n，Linux 和 macOS 下是 \n。这样可以保证生成的文件在不同平台上都能正确显示换行效果。
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
