public class Animal {
    void eat(){
        System.out.println("Eating!");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Baw Baw!");
    }
}
class TestInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
