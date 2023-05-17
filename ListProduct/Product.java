package ListProduct;

import java.io.*;

public class Product implements Serializable {
    private String ProID;
    private String ProName;
    private int Prize ;
    public Product(String ID , String name , int prize){
        this.ProName = name;
        this.ProID = ID;
        this.Prize = prize;
    }
    public Product(){

    }

    public String getProID() {
        return ProID;
    }

    public void setProID(String proID) {
        ProID = proID;
    }

    public String getProName() {
        return ProName;
    }

    public void setProName(String proName) {
        ProName = proName;
    }

    public int getPrize() {
        return Prize;
    }

    public void setPrize(int prize) {
        Prize = prize;
    }
    public String toString(){
        return "product id : " + getProID() + " product name : " + getProName() + " prize : " + getPrize();
    }
}
class ProductProcess{
    public static boolean writeProductToFile(Product [] products , File file){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            return true;
        }catch (IOException e){
            return false;
        }
    }
    public static Product[] readProductFromFile(File file){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Product [] list = (Product[]) objectInputStream.readObject();
            for (Product products:list) {
                System.out.println(products);
            }
            objectInputStream.close();
            return new Product[]{};
        }catch (IOException | ClassNotFoundException e){
            return null;
        }
    }
}
class ProductApp{
    public static void main(String[] args) {
        File file = new File("C:\\Users\\PC\\Desktop\\OOP2_Bai5\\ListProduct\\Product.txt");
        Product [] products = new Product[5];
        products[0] = new Product("A1","Steel",1222222);
        products[1] = new Product("A2","Stone",112222);
        products[2] = new Product("A3","Stand",120222);
        products[3] = new Product("A4","hammer",1342);
        products[4] = new Product("A5","glass",12);
        ProductProcess.writeProductToFile(products,file);
        ProductProcess.readProductFromFile(file);
    }
}
