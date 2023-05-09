import java.io.*;

public class display1 {
    public static void main(String[] args) {
        try{
            FileWriter fr = new FileWriter("dld.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fr);
            bufferedWriter.write("hello day");
            bufferedWriter.close();
            FileReader fileReader = new FileReader("dld.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int data = bufferedReader.read();
            while (data != -1){
                System.out.println((char) data);
                data = bufferedReader.read();
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}