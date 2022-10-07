import java.awt.print.Paper;
import java.io.*;
import java.util.Scanner;

public class ScannerClass {
    private String ScannerName;
    private boolean ScannerCapOpen = false;
    private boolean ScannerPaperIn = false;
    private String PaperContent = null;
private File dataFile = new File("Lab3_Lutsiuk.txt");
private PrintWriter fout = new PrintWriter(dataFile);


    /** Constructor **/
  public ScannerClass (String ScannerName) throws FileNotFoundException {
        this.ScannerName = ScannerName;
        fout.write("Created Scanner with name: ");
        fout.write(ScannerName);
    }
    /** Default Constructor **/
    public  ScannerClass () throws FileNotFoundException {
      ScannerName = "Default Scanner";
      fout.println("Created Default Scanner");
    }

    public String   GetScannerName(){
        fout.write("\nGets Scanner Name\n");
      return this.ScannerName;

    }
    /** Getter and Setter for Cap of Scanner **/
    public void  SetScannerCap(){
     if(ScannerCapOpen) {
         fout.write("\nScanner Cap is Closed\n");
         ScannerCapOpen = false;
     }
     else{
            fout.write("\nScanner Cap is Open\n");
            ScannerCapOpen = true;
        }
     }
    public boolean GetScannerCap(){
        fout.write("\nGets Cap is Open or Closed\n");
      return this.ScannerCapOpen;
    }
    /** Getter and Setter for PaperIn **/
    public void  SetPaperIn() {
        if (ScannerCapOpen) {
            if (ScannerPaperIn) {
                ScannerPaperIn = false;
                fout.write("\n Take out Paper from Scanner \n");
            }
            else {
                fout.write("\n Take in Paper into Scanner\n");
                ScannerPaperIn = true;
            }
            }
        else {System.out.println("\nOpen the Cap First to Put Paper\n");}
    }
    public boolean GetScannerPaper(){
        fout.write("\nGets Paper is in Scanner\n");
        return this.ScannerPaperIn;
    }

/** Method to show the Text on the Paper **/
    public void ShowPaperContent(){
        if(PaperContent != null){
            System.out.println(PaperContent);
            fout.write("\n Printing Paper Content \n");
            fout.write(PaperContent);
        }
        else{System.out.println("Paper is Clear, try to Scan the Paper.");}
    }
    /**     Method that Scan the Text on Paper **/
    public void ScanThePaper(String PaperContent){
        if(ScannerPaperIn && !ScannerCapOpen ){
          this.PaperContent = PaperContent;
            fout.write("\nScanning Paper Content\n");
        } else{
            System.out.println("\n\nCheck that Cap is Open or Paper is IN the scanner \n\n");
        }

        }
        /**Method that shows the Information about Scanner**/
    public void ShowInfoAboutClass(){
        System.out.println("===================================");
        System.out.println("Name of Scanner :");
        System.out.println(ScannerName);
        System.out.println("Cap is Open?");
        if(ScannerCapOpen){ System.out.println("Yes"); }
        else{ System.out.println("No");}
        System.out.println("Paper is In");
        if(ScannerPaperIn){ System.out.println("Yes"); }
        else{ System.out.println("No");}
        System.out.println("===================================");
        fout.write("\nTaking information about Scanner\n");
    }
    /**Method for Navigation in Scanner**/
    public void DoNextScannerMove(){
        System.out.println("===================================");
        System.out.println("Press the button equal to the Menu point:");
        System.out.println("To Close or Open Scanner Cap Press: F");
        System.out.println("To Put Paper in the Scanner Press: P");
        System.out.println("To Scan Paper Press: S");
        System.out.println("To Show Paper Content Press: D");
        System.out.println("To Turn Off the program Press: X");
        System.out.println("===================================");
        fout.write("\nTaking menu to the USER\n");

    }
    public void ScannerEndOfProgram(){
        fout.flush();
        fout.close();
    }

}

