package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
    public static void main(String[] args) throws IOException {
        try {
            byte bWrite[] = {11,21,3,40,5};
            FileOutputStream os = new FileOutputStream("test.txt");
            for (int i = 0; i < bWrite.length; i++) {
                os.write(bWrite[i]);//writes the bytes
            }
            os.close();

            FileInputStream is = new FileInputStream("test.txt");
            int size = is.available();
            for (int i = 0; i < size; i++) {
                System.out.println((char)is.read()+" ");
            }
            is.close();
        }catch (IOException e){
            System.out.println("Exception");
        }
    }
}
