public class ScannerCapClass {
    private boolean ScannerCapOpen;

    public ScannerCapClass(){
        ScannerCapOpen = false;
    }

    public boolean GetScannerCap(){
        return ScannerCapOpen;
    }
    public  void SetScannerCap(boolean ScannerCapOpen){
        this.ScannerCapOpen = ScannerCapOpen;
    }
}
