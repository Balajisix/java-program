import java.io.*;
import java.util.Scanner;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        Scanner sc = null;
        FileOutputStream source = null;

        try {
            sc = new Scanner(System.in);
            System.out.println("Enter the text to write into the file: ");
            String userInput = sc.nextLine();

            source = new FileOutputStream("write.txt");
            source.write(userInput.getBytes());

            System.out.println("File Written Successfully. Please check!");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        } finally {
            if(source != null) {
                source.close();
            }
            if(sc != null) {
                sc.close();
            }
        }
    }
}
