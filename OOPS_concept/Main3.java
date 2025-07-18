class StaticExample {
    static int count = 0;  // Static variable
    
    static {  // Static block
        System.out.println("Static block executed");
    }
    
    static void increment() {  // Static method
        count++;
    }
}

public class Main3 {
    public static void main(String[] args) {
        StaticExample.increment();
        System.out.println(StaticExample.count);  // 1
    }
}
// Output: Static block executed\n1