import java.io.*;
import java.util.Scanner;
public class Writting_Clas {
    private  String FNameTxt;
    private String FNameBin;
    DataOutputStream foutBin;
    PrintWriter foutTxt;
private  double y;
    public Writting_Clas( String FNameTxt,String FNameBin) throws FileNotFoundException {
       this.FNameTxt = FNameTxt;
        this.FNameBin = FNameBin;
        foutTxt = new PrintWriter(this.FNameTxt);
        foutBin = new DataOutputStream(new FileOutputStream(this.FNameBin));
    }

    public void writeResBin(String fName, double KeyA) throws IOException
    {
        foutBin.writeDouble(KeyA);
        foutBin.writeDouble(y);

    }
    public void writeResTxt( double KeyA, double KeyB) throws FileNotFoundException
    {

        foutTxt.printf(" %f    =    ", KeyA);
        foutTxt.printf("%f \n",KeyB);


    }
    public void readResTxt()
    {
        try
        {
            File f = new File (FNameTxt);
            if (f.exists())
            {
                Scanner s = new Scanner(f);
                System.out.println(s.nextLine());


                s.close();
            }
            else
                throw new FileNotFoundException("File " + FNameTxt + "not found");
        }
        catch (FileNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    public void readResBin() throws IOException
    {
        DataInputStream f = new DataInputStream(new FileInputStream(FNameBin));
        System.out.println(f.readDouble());
        f.close();
    }
    public void EndOfFile() throws IOException {
        foutTxt.flush();
        foutTxt.close();
        foutBin.flush();
        foutBin.close();
    }
}
