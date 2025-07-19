class Dog {
    {  // Instance initializer
        System.out.println("Initializer block");
    }
    
    Dog() {
        System.out.println("Constructor");
    }
}

public class Main8 {
    public static void main(String[] args) {
        new Dog();  // Output: Initializer block\nConstructor
    }
}