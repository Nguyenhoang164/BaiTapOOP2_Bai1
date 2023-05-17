import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class THdoc_ghi {
    public boolean WriteData(String data , String filename){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(filename , true);
            fileOutputStream.write(data.getBytes());
            fileOutputStream.close();
            return true;
        }catch (IOException e){
           return false;
        }
    }


    public void ReadData(){
        try {
            FileInputStream fileInputStream = new FileInputStream("data.dat");
            byte [] data = new byte[fileInputStream.available()];
            int read = fileInputStream.read(data);
            String str = new String(data,0,read);
            System.out.println(str);
            fileInputStream.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        THdoc_ghi s1 = new THdoc_ghi();
        System.out.println("nhập chuỗi ký tự : " );
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        System.out.println(s1.WriteData(data,"data.dat"));
        s1.ReadData();
    }
}
