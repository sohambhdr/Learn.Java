class Animal {
    String name = "Animal";
}

class Dog extends Animal {
    String name = "Dog";
    
    void print() {
        System.out.println(super.name);  // Animal
    }
}

public class Main7 {
    public static void main(String[] args) {
        new Dog().print();
    }
}