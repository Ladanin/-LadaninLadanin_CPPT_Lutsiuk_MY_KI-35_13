import java.io.File;
import java.io.PrintWriter;
/**Abstract Class from the Lab 3**/
public abstract class ScannerClass {
    /**Two classes to describe the Paper and Cap**/
    private String ScannerName = null;
    private ScannerCapClass CapOfScanner = new ScannerCapClass();
    private ScannerPaperClass PaperOfScanner = new ScannerPaperClass();

    /**Getters and setters**/
    public String GetScannerName(){
        return ScannerName;
    }
    public void SetScannerName(String ScannerName){
        this.ScannerName = ScannerName;
    }
    public void  SetScannerCap(){
        if( CapOfScanner.GetScannerCap()) {
            CapOfScanner.SetScannerCap(false);
        }
        else{
            CapOfScanner.SetScannerCap(true);
        }
    }
    public boolean GetScannerCap(){
        return this.CapOfScanner.GetScannerCap();
    }
    public void  SetPaperIn() {
        if (CapOfScanner.GetScannerCap()) {
            if ( PaperOfScanner.GetScannerPaperIn()) {
                PaperOfScanner.SetScannerPaperIn(false);

            }
            else {

                PaperOfScanner.SetScannerPaperIn(true);
            }
        }
        else {System.out.println("\nOpen the Cap First to Put Paper\n");}
    }
    public boolean GetScannerPaper(){
        return this.PaperOfScanner.GetScannerPaperIn();
    }
    public void SetScannerPaperContent(String PaperContent){
       PaperOfScanner.SetScannerPaperContent(PaperContent);
    }
    public String GetScannerPaperContent(){
        return PaperOfScanner.GetScannerPaperContent();
    }
    /**Abstract functions that will be described in extended class**/

    public abstract void ScanThePaper(String PaperContent);
    public abstract void ShowPaperContent();
    public abstract void ScannerEndOfProgram();
}
