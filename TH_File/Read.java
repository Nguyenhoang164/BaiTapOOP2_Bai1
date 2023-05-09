package TH_File;

import java.io.File;


public class Read {
    public static void main(String[] args) {
        String filename = "hello whatsHUP";
        File file1 = new File(filename);
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
    }


}
