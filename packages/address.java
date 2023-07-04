package packages;
import java.util.*;

public class address
{
    String[] address=new String[10];
    // ArrayList<String[]> data = new ArrayList<>();
    public
    address()
    {
        address[0]="AADINATH PRI SCHOOL VASTRAL, AADINATHNAGAR VASTRAL, Ahmedabad Corporation, Gujarat, 382415";
        address[1]="SAHARA CLINIC AMAN CHOWL RAKHIYAL, Ahmedabad Corporation, Gujarat, 380023";
        address[2]="AMARNATH MAHADEV BAPUNAGAR, Ahmedabad Corporation, Gujarat, 380024";
        address[3]="AMBALI UHC-1, OPP. AMBALI GAM BRTS BUS STAND AMBALI AHMEDABAD., Ahmedabad Corporation, Gujarat, 380058";
        address[4]="AMRAIWADI SUB ZONAL, Near National Handloom Amraiwadi Char Rasta Amraiwadi, Ahmedabad Corporation, Gujarat, 380026";
        address[5]="AMRAIWADI UPHC-2, AMRAIWADI UPHC METRO TRAIN PILLAR NO 40 SWASTIK CROSS ROAD AMRAIWADI, Ahmedabad Corporation, Gujarat, 380026";
        address[6]="APOLLO CVHF HEART INSTITUTE 1, Opp GNFC TowerPakwan Cross Road S.G. HighwayAhmedabad Gujarat., Ahmedabad Corporation, Gujarat, 380059";
        address[7]="ARVIND MILL NARODA ROAD, Ahmedabad Corporation, Gujarat, 380018";
        address[8]="BAPUNAGAR GUJARATI SCHOO NO 3, 137 Last Bus Stop Bapunagar, Ahmedabad Corporation, Gujarat, 380024";
        address[9]="BAPUNAGAR UHC, Margha Farm Stadium Bapunagar, Ahmedabad Corporation, Gujarat, 380024";
    }
    public void print_all()
    {
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("enter "+(i+1)+" for address "+address[i]);
        }
    }

    public int print(int i,int b,ArrayList<String[]> data,int c,int k,int z)
    {
        if(i>=0 && i<10)
        {   
            if(b==1) data.get(c)[3]=address[i];
            if(b==2) data.get(k)[4]=address[i];
            System.out.println("\n\t\tYour Slot Booked Succesfully!");
            z=1;
        }
        else 
        {
            System.out.println("Sorry! the enter address is not correct. Try it once again");
        }
        return z;
    }

}
