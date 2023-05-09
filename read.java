import java.io.FileReader;
import java.io.IOException;

public class read {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("dld.txt");
            int data = fileReader.read();
            while (data != -1){
                System.out.println((char) data);
                data = fileReader.read();
            }
            fileReader.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
