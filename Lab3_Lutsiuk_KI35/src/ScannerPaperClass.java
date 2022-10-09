import java.awt.print.Paper;

public class ScannerPaperClass {

    private boolean ScannerPaperIn;
    private String PaperContent;

    public ScannerPaperClass(){
        ScannerPaperIn = false;
        PaperContent = null;
    }

   public boolean GetScannerPaperIn(){
        return ScannerPaperIn;
   }
   public void SetScannerPaperIn(boolean ScannerPaperIn){
        this.ScannerPaperIn = ScannerPaperIn;
   }

   public String    GetScannerPaperContent(){
        return PaperContent;
   }
   public void SetScannerPaperContent( String PaperContent){
        this.PaperContent = PaperContent;
   }

}
