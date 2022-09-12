import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadnWrite {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\pande\\Documents\\output.txt",true);
            FileInputStream fis = new FileInputStream("C:\\Users\\pande\\Documents\\input.txt");
            int i;
            while((i=fis.read())!= -1){
                fos.write(i);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
