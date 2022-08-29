import java.util.*;
import  java.lang.String;
import java.io.*;

/**
 * Клас Lab2 реалізує приклад програми до лабораторної роботи №2
 *
 * @author Maksym Lutsiuk KI-35
 * @version 1.0
 * @since version 1.0
 *
 */

public class Lab2_Lutsiuk_KI35 {

    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     * @throws FileNotFoundException
     */

    public static void main(String[] args) throws FileNotFoundException {
        Scanner numScanner = new Scanner(System.in);
        int sizeOfMatrix;
        String[][] arrayOfMatrix;
        File dataFile = new File("Lab2_Lutsiuk.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.println("Enter the filler of Matrix:");
        String filler = numScanner.nextLine();
        if (filler.length() > 1) {
            System.out.println("Filler is too long, only one Symbol");
            System.exit(3434);
        }
        System.out.println("Enter the size of Matrix:");
        sizeOfMatrix = numScanner.nextInt();
        if (sizeOfMatrix <= 0) {
            System.out.println("Only positive numbers");
            System.exit(3434);
        }
        arrayOfMatrix = new String[sizeOfMatrix][];
        for (int i = 0; i < arrayOfMatrix.length; i++) {

            for (int j = 0; j < arrayOfMatrix.length; j++) {
                if (j % 2 != 0) {
                    arrayOfMatrix[i] = new String[sizeOfMatrix];
                    arrayOfMatrix[i][j] = filler;
                    System.out.print(arrayOfMatrix[i][j] + "\t");
                    fout.print(arrayOfMatrix[i][j]+ "\t");
                }
                else{System.out.print("0\t");
                fout.print("0\t");
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();

    }
}
