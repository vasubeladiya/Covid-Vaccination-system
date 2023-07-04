package packages;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class certificate_ad1 {
    ArrayList<String[]> data ;
    int c,b;
    public void input(int f,int e)
    {
        c=f;
        b=e;
    }
    public void print(ArrayList<String[]> data ) throws IOException
    {
        FileWriter crti=new FileWriter("Certificate.txt",false);
        crti.write("\n    ==================================================================================================================================\n");
        crti.write("                                                         Certificate of Covid vaccination");
        crti.write("\n    ==================================================================================================================================\n\n");
        crti.write("     Beneficiary Details\n");
        crti.write("     Beneficiary Name : "+data.get(c)[0]+"\n");
        crti.write("     Phone No. : "+ data.get(c)[1]+"\n");
        crti.write("     Age : "+ data.get(c)[2]+"\n");
        crti.write("\n     Vaccination Details\n");
        crti.write("     Vaccine Name : \n");
        crti.write("     Dose : "+b+"\n");
        crti.write("     1st Dose Vaccination At : "+ data.get(c)[3]+"\n");
        crti.close();

        
    }
}

