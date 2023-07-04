package packages;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class certificate_ad2 extends certificate_ad1
{ 
    
    public void printf(ArrayList<String[]> data ) throws IOException
    {
        FileWriter crti=new FileWriter("Certificate.txt",true);
        crti.write("2st Dose Vaccination At : "+ data.get(c)[4]+"\n");
        crti.close();
    }
}
