package Bai_Tap_OOP2_Bai2.Thuc_Hanh_Animal.Thuc_Hanh_Cat;



abstract class Animal{
    public abstract String MakeSound();
}
interface Edible {
    String HowtoEat();
}
 class Cat extends Animal implements Edible {
 @Override
 public String MakeSound(){
     return "Cat : meo meo " ;
 }
 @Override
     public String HowtoEat(){
     return "eat mouse" ;
 }
}
class Check{
    public static void main(String[] args) {
        Animal [] animals = new Animal[1];
        animals[0] = new Cat();
        for ( Animal animal : animals ){
            System.out.println(animal.MakeSound());
            if (animal instanceof  Cat){
                Edible edible = (Cat) animal ;
                System.out.println(edible.HowtoEat());
            }
        }
    }
}
