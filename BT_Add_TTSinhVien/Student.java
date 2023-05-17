package BT_Add_TTSinhVien;

import java.io.*;

public class Student implements Serializable {
    private String MaSinhVien;
    private String Name;
    private int Age;
    private String Class;

    public Student(String maSinhVien, String name, int age, String aClass) {
        MaSinhVien = maSinhVien;
        Name = name;
        Age = age;
        Class = aClass;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        MaSinhVien = maSinhVien;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setClass(String aClass) {
        Class = aClass;
    }

    public String toString() {
        return "Ma sinh vien : " + getMaSinhVien() + " - " + " ten : " + getName() + " - " + "tuoi : " + getAge() + " - " + "Lop : " + getClass();
    }

}
class StudentProcess{
    public static boolean writeStudentToFile(Student[] student ){
         File file = new File("Student.dat");
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            return true;
        } catch (IOException e) {
            return false;
        }

    }
    public static Student[] readStudentFromFile(){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Student.dat"));
            Student [] students = (Student[]) objectInputStream.readObject();
            for (Student list: students) {
                System.out.println(list.toString());
            }
             objectInputStream.close();
            return new Student[] {};

        }   catch (IOException | ClassNotFoundException e){
            return null;
        }
    }
}

class StudentApp {
    public static void main(String[] args){

        Student[] students = new Student[5];

        students[0] = new Student("A12", "Nguyen van A", 12, "A");
        students[1] = new Student("A13", "Nguyen van B", 12, "B");
        students[2] = new Student("A14", "Nguyen van C", 12, "A");
        students[3] = new Student("A15", "Nguyen van D", 12, "B");
        students[4] = new Student("A16", "Nguyen van E", 12, "B");
         StudentProcess.writeStudentToFile(students) ;
         StudentProcess.readStudentFromFile();

    }













}