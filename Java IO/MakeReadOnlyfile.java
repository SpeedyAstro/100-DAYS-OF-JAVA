import java.io.File;

public class MakeReadOnlyfile {
    public static void main(String[] args) {
        File f=  new File("C:\\Users\\pande\\Documents\\kachra\\test.txt");
        f.setReadOnly();
    }
}
