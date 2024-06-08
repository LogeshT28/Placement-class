//Write a Java programme to create a class called Animal with a Method called make sound.
// create a sub class called cat that overrides the make sound method to mark

class Animal{
    void MakeSound(){
        System.out.println("Animal Barked");
    }
}
class Dog extends Animal{
    void MakeSound(String Dog){
        System.out.println("Dog Barked");
    }

    void MakeSound(String Dog ,String Dogs){
        System.out.println("Dogs are  Barked in my area");
    }

}
public class Problem1 {
    public static void main(String[] args) {
        Dog o = new Dog();
        o.MakeSound();
        o.MakeSound("xx");
        o.MakeSound("yy", "zzzzz");
    }
}
