class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {  // Overriding
        System.out.println("Bark");
    }
}

public class Main6 {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();  // Bark (runtime polymorphism)
    }
}