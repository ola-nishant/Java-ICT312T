import java.util.Scanner;
public class ThrowKeyword{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int availableBalance = sc.nextInt();
        int withdrawAmount = sc.nextInt();
        try{
            if(availableBalance < withdrawAmount){
                throw new ArithmeticException("Insufficient Balance");
            }
            else{
                System.out.println("Withdrawal Successful");
                System.out.println("AvailableBalance is: "+(availableBalance - withdrawAmount));
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}