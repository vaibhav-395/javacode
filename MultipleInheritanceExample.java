package src;

interface Account {
    void set(String name, int accountNumber, double balance);
    void display();
}

interface Person2 {
    void store(String name);
    void disp();
}

class Customer implements Account, Person2 {
    String name;
    int accountNumber;
    double balance;

    @Override
    public void set(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Account Information:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + (balance * 0.05)); // Assuming interest rate of 5%
    }

    @Override
    public void store(String name) {
        this.name = name;
    }

    @Override
    public void disp() {
        System.out.println("Person Information:");
        System.out.println("Name: " + name);
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.store("John Doe");
        customer.set("John Doe", 123456789, 5000.0);
        customer.disp();
        customer.display();
    }
}
