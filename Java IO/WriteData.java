import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {
        try{
            String data = "this is my modified string";
            FileOutputStream fos = new FileOutputStream("C:\\Users\\pande\\Documents\\test.txt",true);
            // true add string into existing string (Append) , false just remove and add new string
            byte [] b = data.getBytes();
            fos.write(b);
            fos.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
