
import static java.lang.System.out;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Maksym Lutsiuk
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        {
            try {

                Scanner in = new Scanner(System.in);
                String fName = "Lab_5_Lutsiuk.txt";
                PrintWriter fout = new PrintWriter((fName));
                try {
                    try {

                        out.print("Enter X: ");
                        Math_Class eq = new Math_Class(in.nextInt());
                        fout.print(eq.calculate());
                    } finally {

                        fout.flush();
                        fout.close();
                    }
                } catch (CalcException | ArithmeticException ex) {

                    out.print(ex.getMessage());
                }
            } catch (FileNotFoundException ex) {
                out.print("Exception reason: Perhaps wrong file path");
            }


        }
    }
}