class Outter {
    class Inner {
        void display() {
            System.out.println("Called using inner class.");
        }
    }
}

public class nestedClass2 {
    public static void main(String[] args) {
        // First, create an instance of the outer class
        Outter outerObj = new Outter();
        
        // Then, create an instance of the inner class using the outer class instance
        Outter.Inner obj1 = outerObj.new Inner();
        
        obj1.display();
    }
}
