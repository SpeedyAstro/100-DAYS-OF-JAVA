import java.io.File;
import java.io.FilenameFilter;

class SearchFile implements FilenameFilter{
    String n ;
    SearchFile(String n){
        this.n = n;
    }
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(n);
    }
}

public class SearchFilewitFilter {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\pande\\Documents");
        SearchFile sf = new SearchFile(".txt");
        String s[] = f.list(sf);
        for(String c : s){
            System.out.println(c);
        }
        // ANOTHER APPROACH 
        // String extension = ".txt";
        // String s1[] = f.list(new FilenameFilter() {

        //     @Override
        //     public boolean accept(File dir, String name) {
        //         return name.endsWith(extension);
        //     }
            
        // });
        // for(String c : s1){
        //     System.out.println(c);
        // }
    }
}
