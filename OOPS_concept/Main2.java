class Dog {
    String name;
    
    Dog(String n) {  // Constructor
        name = n;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");  // Calls constructor
        System.out.println(myDog.name);  // Buddy
    }
}