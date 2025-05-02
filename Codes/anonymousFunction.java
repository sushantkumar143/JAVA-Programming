class Greeting{
    void display(){
        System.out.println("Hello !!");
    }
}

public class anonymousFunction {
    public static void main(String[] args){
        Greeting obj1 = new Greeting(){
            void display(){
                System.out.println("Hello, How are you !!");
            }
        };
        obj1.display();
        obj1.display();

    }
}
