interface Chargeable {
    int battery = 69;
    void charge();
}

interface Connectable {
    void connect();
}

class Smartphone implements Chargeable, Connectable {
    @Override
    //MUST DECLARE PUBLIC
    public void charge() {
        System.out.println("Smartphone is charging");
        System.out.println("Phone battery is: "+ battery);
    }
    
    @Override
    public void connect() {
        System.out.println("Smartphone is connecting to the network");
    }
}

class Laptop implements Chargeable, Connectable {
    @Override
    public void charge() {
        System.out.println("Laptop is charging");
    }

    @Override
    public void connect() {
        System.out.println("Laptop is connecting to the Wi-Fi");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Chargeable myPhone = new Smartphone();
        myPhone.charge(); // Outputs: Smartphone is charging

        Connectable myLaptop = new Laptop();
        myLaptop.connect(); // Outputs: Laptop is connecting to the Wi-Fi
    }
}
//no construcots
//no instance variables-variables are public static and final by default
//interface can extend another interface
interface Animal {
    void eat();
}

interface Dog extends Animal {
    void bark();
}