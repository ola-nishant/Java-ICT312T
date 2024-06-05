class sampleClass {
    int x;

    sampleClass(int val) {
        this.x = val;
    }

    void printVal() {
        System.out.println(this.x);
    }
}

// singleton pattern
class sampleClass2 {
    private static sampleClass2 instance;

    private sampleClass2() {}

    static sampleClass2 getInstance() {
        if (instance == null) {
            instance = new sampleClass2();
        }
        return instance;
    }
}

// static utility class
class utility {
    private utility() {}
    static void printHello() {
        System.out.println("Hello");
    }
}

public class constructors {
    public static void main(String[] args) {
        sampleClass a = new sampleClass(0);
        a.printVal();
    }
}