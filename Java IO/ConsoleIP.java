import java.io.Console;

public class ConsoleIP {
    public static void main(String[] args) {
        Console c = System.console();
        //String s = c.readLine("Enter Input");
        char [] pass = c.readPassword("Enter Password");
        String pass1 = new String(pass);
        if(pass1.equals("sd")){
            System.out.println("hehehehehehehe");
        }
    }
}
