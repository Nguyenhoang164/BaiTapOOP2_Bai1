import java.io.*;
import java.util.Scanner;

public class FileRender1 {
    public void ReadFileText(String FilePath) {
        try {
            File newfile = new File(FilePath);
            if (newfile.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(newfile));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tong " + sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap duong dan ");
        String file = input.nextLine();
        FileRender1 file1 = new FileRender1();
        try {
            file1.ReadFileText(file);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
