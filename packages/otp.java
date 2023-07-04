package packages;
import java.util.Random;
import java.util.Scanner;
public class otp{
    int x, num;
    boolean t=false;
    Scanner s= new Scanner(System.in);

    public boolean otpreturn()
    {
        Random rnd = new Random();
        x = rnd.nextInt(999999);
        System.out.println("OTP IS : " + String.format("%06d", x)); 
        System.out.print("Enter OTP : ");
        num=s.nextInt();
        if(x == num)
        {
            System.out.println("\n\t\tvalid OTP");
            t=true;                
        }
        else
        {
            System.out.println("\n\t\tInvalid OTP\n");
            otpreturn();
        }
        return t; 
    }
}