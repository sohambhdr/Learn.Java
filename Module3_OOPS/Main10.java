abstract class Shape {
    abstract void draw();  // Abstract method
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

public class Main10 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();  // Drawing circle
    }
}