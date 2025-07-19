final class FinalClass {  // Can't extend
    final int VALUE = 10;  // Constant
    
    final void method() {
        System.out.println("Final method");
        System.out.println("VALUE is: " + VALUE);
    }

    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.method();
    }
}