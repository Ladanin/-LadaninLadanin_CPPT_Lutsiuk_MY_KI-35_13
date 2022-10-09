import java.io.*;
import java.util.Scanner;

/**
 * Computer Scanner Application class implements main method for ComputerScanner

 class possibilities demonstration
 * @author Maksym Lutsiuk
 * @version 1.0
 */
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {


        CopyMachineClass ScannerTest = new CopyMachineClass("Xerox");
        boolean checkeready = true;
        Scanner scanner = new Scanner(System.in);
        String informationofpaper;
        String navigator;
        while (checkeready){
            ScannerTest.ShowInfoAboutClass();

            System.out.println("What do next?");
            ScannerTest.DoNextScannerMove();
            navigator = scanner.nextLine();
            navigator = navigator.toUpperCase();

            switch (navigator){
                case("F"):
                    ScannerTest.SetScannerCap();
                    break;
                case("S"):
                    System.out.println("Write your text to the Paper:");
                    informationofpaper = scanner.nextLine();
                    ScannerTest.ScanThePaper(informationofpaper);
                    break;
                case("P"):
                    ScannerTest.SetPaperIn();
                    break;
                case("D"):
                    ScannerTest.ShowPaperContent();
                    break;
                case("X"):
                    ScannerTest.ScannerEndOfProgram();
                    checkeready = false;
                    break;
            }
        }



    }
}