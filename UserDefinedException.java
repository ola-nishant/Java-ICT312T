import java.util.Scanner;
// public class InvalidPinCode extends Exception{
//     public InvalidPinCode(String s){
//         super(s);
//     }
// }

public class UserDefinedException {
    static void validatePincode(int pinCode) throws InvalidPinCode{
        if(pinCode < 1000 || pinCode > 9999){
            throw new InvalidPinCode("Invalid Pincode");
        }
        else{
            System.out.println("Valid Pincode");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pincode;
        try{
            pincode = sc.nextInt();
            validatePincode(pincode);
        }
        catch(InvalidPinCode e){
            System.out.println(e.getMessage());
            // throw e;
        }
        finally{
            sc.close();
        }
    }
}
