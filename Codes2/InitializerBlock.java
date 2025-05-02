// An initializer block in Java is a block of code enclosed within {} inside a class but outside any method or constructor. It is used for initializing instance variables.

// Types of Initializer Blocks in Java
//  Instance Initializer Block (IIB)
//  Static Initializer Block (SIB)

//  1. Instance Initializer Block (IIB)
//  Executed before the constructor, every time an object is created.
//  Used for initializing instance variables (non-static).

// Execution Order
// Instance Block → Constructor


//  2. Static Initializer Block (SIB)
//  Executes only once when the class is first loaded into memory.
//  Used for initializing static variables.
//  Runs before the main() method.

class Test {
    // Instance Initializer Block
    {
        System.out.println("Instance Initializer Block executed");
    }

    // Constructor
    Test() {
        System.out.println("Constructor executed");
    }

    static {
        System.out.println("Static Initializer Block executed");
    }
}

public class InitializerBlock {
    public static void main(String[] args) {
        System.out.println("Main Method Starts");
        Test obj1 = new Test(); // Creates first object
        Test obj2 = new Test(); // Creates second object
        System.out.println("Main Method Ends");
    }
}
