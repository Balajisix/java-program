import java.io.*;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream sourceStream = null;
        FileOutputStream destStream = null;

        try {
            sourceStream = new FileInputStream("source.txt");
            destStream = new FileOutputStream("dest.txt");
            int temp;
            while((temp = sourceStream.read()) != -1){
                destStream.write(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The source or destination file may not exist. Please check!!!");
            e.printStackTrace();
        } finally {
            if(sourceStream != null){
                sourceStream.close();
            }
            if(destStream != null){
                destStream.close();
            }
        }
    }
}
