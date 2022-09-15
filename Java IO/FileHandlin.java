import java.io.File;
import java.io.IOException;

public class FileHandlin {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\");
        //f.createNewFile();
        long l = f.getFreeSpace();
        System.out.println(l/(1024*1024*1024));
        long l1 = f.getTotalSpace();
        System.out.println(l1/(1024*1024*1024));
        File f1 = new File("D:\\kachra\\testing\\testing");
        f1.mkdirs(); // create many directories 
        File f3 = new File("C:\\Users\\pande\\Documents");
        String [] str = f3.list();
		for(int i = 0 ; i < str.length; i++){
			System.out.println(str[i]);
		}
    }
}
