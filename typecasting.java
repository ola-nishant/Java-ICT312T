public class typecasting {
    public static void main(String args[]){
        //automatic or widening conversion
        int a = 10;
        long b = a;
        System.out.println(a);
        System.out.println(b);
        //narrowing or explicit conversion
        double c = 10.0d;
        int d = (int)c;
        System.out.println(c);
        System.out.println(d);
    }
}
