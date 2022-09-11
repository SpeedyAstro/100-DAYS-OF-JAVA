
// package NumberSystem;

public class Findintoccur {
    public static void main(String[] args) {
        int a = 1333234;
        int count = 0;
        while(a> 0){
            int rem = a % 10;
            if(rem == 3){
                count++;
            }
            a /= 10;
        }
        System.out.println(count);
    }
}
