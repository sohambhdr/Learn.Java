class Dog {
    // Inherits from Object implicitly
}

public class Main13 {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.toString());  // Default: Dog@hashcode
    }
}