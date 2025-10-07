package EighthQ3;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
;
public class Average {
    public static void main(String[] args) throws Exception {
        Reader reader = null;
        BufferedReader bufferReader = null;
        try {
            
            File file = new File("C:\\Users\\29867\\Desktop\\daima\\EighthQ3\\data.txt");
            if (!file.exists()) {
                throw new FileNotFoundException("File not found");
            }
            reader = new FileReader("C:\\Users\\29867\\Desktop\\daima\\EighthQ3\\data.txt");
            bufferReader = new BufferedReader(reader);
            Double sum = 0.0;
            int count = 0;
            String line;
            while ((line = bufferReader.readLine()) != null) {
                Integer num;
                try {
                    num = Integer.parseInt(line);
                    sum = sum + num;
                } catch (Exception e) {
                    throw new NumberFormatException("Invalid number format: " + line);
                }
                count++;
            }
            if (count == 0) {
                throw new EmptyFileException("File is empty");
            }
            System.out.println("Average is:" + (sum / count));
        } finally {
            if (bufferReader != null) {
                bufferReader.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }
}


