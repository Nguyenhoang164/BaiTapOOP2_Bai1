import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Wirter {
    public boolean Witer(String filename){
        boolean status;
        try {

            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write("hello how a nicce day");
            fileWriter.close();
            status = true;
            System.out.println(status);
        } catch (Exception e){
            status = false;
            System.out.println(status);

        }
     return status;
    }

}
class Display{
    public void DisplayFiletext(String filename){
        try{
            FileReader fileReader = new FileReader(filename);
            int data = fileReader.read();
            while (data != -1){
                System.out.println((char) data );
                data = fileReader.read();
            }
        }catch (Exception e){
            System.out.println("false can not read ");
        }

    }
}
class main{
    public static void main(String[] args) {
        Wirter wirter = new Wirter();
        Scanner input = new Scanner(System.in);
        Display display = new Display();
        System.out.println("nhap ten file muon ghi chep");
        String filename = input.nextLine();
        wirter.Witer(filename);
        display.DisplayFiletext(filename);
    }
}