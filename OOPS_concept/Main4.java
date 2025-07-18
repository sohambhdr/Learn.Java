class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {  // Inheritance
    void bark() {
        System.out.println("Barking...");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited: Eating...
        d.bark();  // Barking...
    }
}