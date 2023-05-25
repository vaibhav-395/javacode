package src;

// Superclass Arithmetic
class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

// Subclass Adder
class Adder extends Arithmetic {
    // No need to override the add method as it is inherited from the superclass
}

// Main class Tester
public class Tester {
    public static void main(String[] args) {
        Adder adder = new Adder();

        // Print superclass name
        System.out.println("My superclass is: Arithmetic");

        // Perform addition using the add method from the superclass
        int sum1 = adder.add(42, 13);
        int sum2 = adder.add(20, 0);

        // Print the sums
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
