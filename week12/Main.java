package week12;

interface AIntFunc {
    void Apply(String input);

    static void Print(String input) {
        System.out.println("Static method: " + input);
    }

    default void Print(String input1, String input2) {
        System.out.println("Default method: " + input1 + ", " + input2);
    }
}

public class Main {
    public static void main(String[] args) {
        AIntFunc aIntFunc = new AIntFunc() {
            @Override
            public void Apply(String input) {
                System.out.println("Anonymous class apply method: " + input);
            }
        };

        aIntFunc.Apply("Apply method");
        AIntFunc.Print("Static method testing");
        aIntFunc.Print("Testing", "Default method");

        AIntFunc aIntFunc1 = (input) -> System.out.println("apply method with lambda expression: " + input);

        aIntFunc1.Apply("Testing apply method with lambda expression");
        AIntFunc.Print("Testing static print method with lambda expression");
        aIntFunc1.Print("Testing", "Default print method with lambda expression");
    }
}
