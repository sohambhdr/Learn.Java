class Engine {
    String type = "V8";
}

class Car {
    Engine engine;  // HAS-A
    
    Car(Engine e) {
        engine = e;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Engine eng = new Engine();
        Car myCar = new Car(eng);
        System.out.println(myCar.engine.type);  // V8
    }
}