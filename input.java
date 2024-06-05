import java.util.Scanner;

public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        short b = sc.nextShort();
        int c = sc.nextInt();
        long d = sc.nextLong();
        float e = sc.nextFloat();
        double f = sc.nextDouble();
        boolean g = sc.nextBoolean();
        String h = sc.next();
        char i = sc.next().charAt(0);
        String j = sc.nextLine();
        System.out.println("Byte: " + a + ", Short: " + b + ", Int: " + c + ", Long: " + d +", Float: " + e + ", Double: " + f + ", Boolean: " + g +", String1: " + h + ", Char: " + i + ", String2: " + j);
        System.out.printf("Byte: %d, Short: %d, Int: %d, Long: %d, Float: %.2f, Double: %.2f, Boolean: %b, String1: %s, Char: %c, String2: %s%n", a, b, c, d, e, f, g, h, i, j);
        sc.close();
    }
}