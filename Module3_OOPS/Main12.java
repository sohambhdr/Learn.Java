class Person {
    private String name;  // Private
    
    public String getName() {  // Getter
        return name;
    }
    
    public void setName(String n) {  // Setter
        name = n;
    }
}

public class Main12 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alice");
        System.out.println(p.getName());  // Alice
    }
}