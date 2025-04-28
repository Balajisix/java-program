import java.io.*;

public class FileReader {
    public static void main(String[] args) throws IOException {
        FileInputStream sourceStream = null;

        try {
            sourceStream = new FileInputStream("test.txt");
            int data;

            while((data = sourceStream.read()) != -1){
                System.out.print((char)data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check if the file exists.");
            e.printStackTrace();
        } finally {
            if(sourceStream != null){
                sourceStream.close();
            }
        }
    }
}
