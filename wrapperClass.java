import java.util.ArrayList;
public class wrapperClass {
    public static void main(String[] args) {
        //autoboxing
        int a = 20;
        Integer i = Integer.valueOf(a);
        //unboxing
        int b = i;
        System.out.println(i);
        System.out.println(b);
        //usage in collections
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(i);
        arr.add(a); //automatic autoboxing
        System.out.println(arr);
        //utility methods
        String num = "123";
        //converting string to int
        int x = Integer.parseInt(num);
        System.out.println(x); 
        //converting string to Integer
        Integer y = Integer.valueOf(num);
        System.out.println(y);
        //comparing two Integer objects numerically
        Integer int1 = 1234;
        Integer int2 = 12345;
        System.out.println(int1.compareTo(int2));
        //many other functions    
    }
}