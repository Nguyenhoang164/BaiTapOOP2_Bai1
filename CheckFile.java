import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckFile {
    public void CheckStatusFile(String filepath){
        try{
            File file = new File(filepath);
            if (file.exists()){
                throw new FileNotFoundException();
            }
            if (file.isDirectory()){
                System.out.println("file is direcotry");
            }else{
                System.out.println("no direcotry");
            }
            System.out.println(filepath);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CheckFile checkFile = new CheckFile();
        System.out.println("moi nhap link ");
        String sc = input.nextLine();
        checkFile.CheckStatusFile(sc);
    }
}
