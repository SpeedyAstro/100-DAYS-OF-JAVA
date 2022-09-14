import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Dynamic Input Approaches...
public class BufferedInput{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // faster than buffer reader
        String n = br.readLine();
        System.out.println(n);
    }
}