import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
public class MakeFileHidden {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("C:\\Users\\pande\\Documents\\kachra\\test.txt");
        Files.setAttribute(p, "dos:hidden", true, LinkOption.NOFOLLOW_LINKS);
    }
}
