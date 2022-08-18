import java.util.Scanner;

public class reverseStr {
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        for(int i = s1.length()-1;i>=0;i--){
            s = s + s1.charAt(i);
        }
        System.out.println(s);
        if(s1.equals(s)){
            System.out.println("palindrome numeber");
        }
        else{
            System.out.println("not");
        }
        sc.close();
    }
}
