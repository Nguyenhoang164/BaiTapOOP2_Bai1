import java.io.FileReader;
import java.io.IOException;
// lớp fileRender được kế thừa từ inputStreamRender
// Closeable, AutoCloseable, Readable
// dùng để đọc file text
//gồm 3 phương thức khởi tạo
public class FileReadOnly {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("hello.txt");
            int data = fileReader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}