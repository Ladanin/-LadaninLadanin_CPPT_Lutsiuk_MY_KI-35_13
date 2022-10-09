import java.io.*;
/**Copy Machine Class that extends the SuperClass from lab 3 and interface**/
public class CopyMachineClass extends ScannerClass implements ScannerMenuInterface {
    /**Variables using for taking logs into the TXT FILE**/
    private File dataFile = new File("Lab3_Lutsiuk.txt");
    private PrintWriter fout = new PrintWriter(dataFile);
    /**Constructors, DEFAULT AND WITH ARGUMENT**/
   public CopyMachineClass()throws FileNotFoundException
   {
       SetScannerName("Default Name");
   }
    public CopyMachineClass(String ScannerName)throws FileNotFoundException{
       SetScannerName(ScannerName);
    }

    /** Override Methods from Abstract Class**/
    @Override
    public void ScanThePaper(String PaperContent) {
        if(GetScannerPaper() && !GetScannerCap() ){
          SetScannerPaperContent(PaperContent);
            fout.write("\nScanning Paper Content\n");
        } else{
            System.out.println("\n\nCheck that Cap is Open or Paper is IN the scanner \n\n");
        }

    }


    @Override
    public void ShowPaperContent() {
        if(GetScannerPaperContent() != null){
            System.out.println(GetScannerPaperContent());
            fout.write("\n Printing Paper Content \n");
            fout.write(GetScannerPaperContent());
        }
        else{System.out.println("Paper is Clear, try to Scan the Paper.");}

    }
    /**Methods from the Interface**/
    public void ShowInfoAboutClass() {
        System.out.println("===================================");
        System.out.println("Name of Scanner :");
        System.out.println(GetScannerName());
        System.out.println("Cap is Open?");
        if(GetScannerCap()){ System.out.println("Yes"); }
        else{ System.out.println("No");}
        System.out.println("Paper is In");
        if(GetScannerPaper()){ System.out.println("Yes"); }
        else{ System.out.println("No");}
        System.out.println("===================================");
        fout.write("\nTaking information about Scanner\n");
    }


    public void DoNextScannerMove() {
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
    @Override
    public void ScannerEndOfProgram() {
       fout.write("End of the Program");
       fout.flush();
        fout.close();

    }




}
