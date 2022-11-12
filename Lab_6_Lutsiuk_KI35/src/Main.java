
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
                String fTxtName = "Lab_6_Lutsiuk.txt";
                String fBinName = "Lab_6_Lutsiuk.bin";
                boolean checkerready = false;
                Writting_Clas writter = new Writting_Clas(fTxtName,fBinName);
                    while (!checkerready) {

                        out.print("Enter X: ");
                        double KeyA = in.nextDouble();
                        if(KeyA == 0){
                            checkerready = true;
                            break;
                        }
                        Math_Class eq = new Math_Class(KeyA);

                        writter.writeResTxt(KeyA, eq.calculate());

                    }
                    writter.EndOfFile();


                } catch (CalcException | IOException ex) {

                    out.print(ex.getMessage());
                }



        }
    }
}