class Dog {  // Class
    String name;  // Property
    
    void bark() {  // Method (behavior)
        System.out.println(name + " barks!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Object creation
        myDog.name = "Buddy";
        myDog.bark();  // Output: Buddy barks!
    }
}