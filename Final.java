import java.util.*;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import packages.*;


public class Final
{
	public static void main(String[] args) throws IOException
	{
        otp otpobj=new otp();
        int n,i,c=0,j,p=0,flag=0,k=0,m=0;

        ArrayList<String[]> data = new ArrayList<>();
        data.add(new String[5]);
        for(j=0;j<5;j++) data.get(0)[j]="-";
            
        Scanner s= new Scanner(System.in);

        System.out.println("\n    ==================================================================================================================================\n");
        System.out.println("                                                         WELCOME TO COVID VACCINATION SYSTEM");
        System.out.println("\n    ==================================================================================================================================\n");

        while(true)
        {
            System.out.println("Chosse Option :- \n1. For Sign Up \n2. For Sign In \n3. For Download Certificate \n4. For Exit");
            System.out.print("Enter Your Choice :- ");
            n=s.nextInt();

            if(n==2)
            {
                System.out.println("\n    ==================================================================================================================================");
                System.out.println("                                                         SIGN IN PAGE");
                System.out.println("    ==================================================================================================================================\n");

                String name=new String();
                s.nextLine();
                System.out.print("Enter Your Name :- ");
                name=s.nextLine();
                for(i=0;i<10;i++)
                {
                    if(data.get(i)[0]=="-")
                    {
                        System.out.println("\n\t\tThe Enter Name Is Not Found So You Need To Sign Up");
                        n=1;
                        m=1;
                        break;
                    }

                    if(data.get(i)[0].equalsIgnoreCase(name))
                    {
                        k=i;
                        System.out.println("\n\t\tOTP GENERATION");
                        p=2;
                        while(p>0)
                        {
                            if(otpobj.otpreturn())
                            {
                                flag=1;
                                break;
                            }
                        }
                        if(flag==1)
                        {
                            break;
                        }
                    }                
                }
            }

            if(flag==1)
            {
                p=1;flag=0;
            }
            else
            { 
                p=2;
            }

            if(n==1)
            {
                if(p!=1)
                {
                    String name=new String();
                    String phone=new String();
                    String Age=new String();

                    System.out.println("\n    ==================================================================================================================================");
                    System.out.println("                                                         SIGN UP PAGE");
                    System.out.println("    ==================================================================================================================================\n");



                    if(m==1)
                    {
                        System.out.println("\n\t\tPlease Press ENTER KEY For Further Process!.. ");
                    }

                    s.nextLine();
                    System.out.print("Enter Your Name :- ");
                    name=s.nextLine();
                    data.get(c)[0]=name;

                    while(true)
                    {
                        System.out.print("Enter Your Phone Number :- ");
                        phone=s.next();
                        if(phone.length()!=10)
                        {
                            System.out.println("\n\t\t\"Enter 10 Digits Phone Number!..\"");
                        }
                        else break;
                    }
                    data.get(c)[1]=phone;

                    System.out.print("Enter Your Age :- ");
                    Age=s.next();
                    data.get(c)[2]=Age;
                    int num=Integer.parseInt(Age);
                    if(num<18)
                    {
                        System.out.println("\n\t\t! You Are Not Eligible For Vaccination !..");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println("\n\t\tOTP GENERATION");
                        p=2;
                        while(p>0)
                        {
                            if(otpobj.otpreturn())
                            {
                                break;
                            }
                        }
                    }
                }
            }
            if(n==3)
            {   
                s.nextLine();
                System.out.print("Enter Your Phone Number From Which You Register :- ");
                String num=s.nextLine();
                for(int l=0;l<10;l++)
                {       
                    if(data.get(l)[1]=="-")
                    {
                        System.out.println("\n\t\tThe enter phone number has not been registered !");
                        break;
                    }
                    if(data.get(l)[1].equalsIgnoreCase(num))
                    {
                        int b=1;
                        if(data.get(l)[4]!="-")
                        {
                            b=2;
                        }
                        certificate_ad2 ob=new certificate_ad2();
                        ob.input(l,b);
                        ob.print(data);
                        if(b==2)
                        {
                            ob.printf(data);
                        }
                        System.out.println("\n\t\tYour Certificate Has Been Downloaded Succefully");
                        break;
                    }
                }
            }
            if(n==4)
            {
                System.exit(0);
            }
            if(n<1 && n>4)
            {
                System.exit(0);
            }

            if(n==1 || n==2)
            {
                int b;
                while(true)
                {
                    System.out.println("\nWhich Dose Do You Want To Take :- ");
                    System.out.println("Enter \n1. For First Dose \n2. For Second Dose");
                    System.out.print("Enter Your Choice :- ");//
                    b=s.nextInt();
                    if(n==1)
                    {
                        if(b==2 && data.get(c)[3]=="-") 
                        {
                            System.out.println("\n\t\tYou Haven't Taken 1st Dose, First You Take 1st Dose Of Vaccine!..");
                            continue;
                        }
                        else break;
                    }
                    if(n==2)
                    {
                        if(b==1 && data.get(k)[3]!="-")
                        {
                            System.out.println("\n\t\tYou have Already Taken 1st Dose Of Vaccine!.. ");
                            continue;
                        }
                        if(b==2 && data.get(k)[4]!="-") 
                        {
                            System.out.println("\n\t\tYou Have Successfully Taken Both Dose Of Vaccine And Can't Take More Than 2 Doses!..");
                            System.exit(0);
                        }
                        else break;
                    }
                }
                
                int z=0;
                while(p>0)
                {
                    System.out.println("\nChoose The Address Of Vaccination Center From The Below Addresses :- \n");

                    address ob=new address();
                    ob.print_all();
                    int a;
                    System.out.print("\nEnter The Address No :- ");
                    a=s.nextInt()-1;
                    z=ob.print(a,b,data,c,k,z);
                    
                    if(z==1)
                    {
                        break;
                    }
                }
                
                //Exception Handaling
                System.out.println("\nPress Enter key For Vaccination");
                try
                {
                    System.in.read();
                }
                catch(Exception e){}
                
                while(p>0)
                {
                    if(b==1)
                    {
                        System.out.println("\t\t\"You Are Vaccinated With The First Dose\"\n");
                        break;

                    }
                    else if(b==2)
                    {
                        System.out.println("\t\t\"You Are Vaccinated With Second Dose. You Are Fully Vaccinated\"\n");
                        break;
                    }
                    else 
                    {
                        System.out.println("\n\t\tEnter The Option Is Not Correct Please Try Again!..");
                    }
                }

                System.out.print("Press Any Key To Continue...");
                s.next();

                while(true)
                {
                    if(b==1)
                    {
                        certificate_ad1 ob=new certificate_ad1();
                        ob.input(c,b);
                        ob.print(data);

                        FileWriter obj=new FileWriter("Entry_Of_Vaccinated_People.txt",true);
                        Date date=new Date();
                        obj.write("\n\nThe Vaccine Was Take By Person Below At "+date.toString());
                        obj.write("\nName :- "+data.get(c)[0]+" \nAge :- "+data.get(c)[2]+" \nPhone Number :- "+data.get(c)[1]+" \nDose:- "+b+" \nAddress Of Destination :- "+data.get(c)[3]+"\n\n");
                        obj.close();

                        data.add(new String[5]);
                        c++;
                        for(int l = 0; l < 5; l++) data.get(c)[l] = "-";
                    }
                    else if(b==2)
                    {
                        certificate_ad2 ob=new certificate_ad2();
                        ob.input(k,b);
                        ob.print(data);
                        ob.printf(data);

                        FileWriter obj=new FileWriter("Entry_Of_Vaccinated_People.txt",true);
                        Date date=new Date();
                        obj.write("\n\nThe Vaccine was take by person below at "+date.toString());
                        obj.write("\nName :- "+data.get(k)[0]+" \nAge :- "+data.get(k)[2]+" \nPhone Number :- "+data.get(k)[1]+" \nDose:- "+b+" \nAddress Of Venue for Dose 1 :- "+data.get(k)[3]+" \nAddress Of Venue For Dose 2 :- "+data.get(k)[4]+"\n\n");
                        obj.close();
                    }
                    System.out.println("\t\t\t\t\t\t\t\t\t----------------------------------------\n\n");
                    break; 
                }
            }
        }
	}
}