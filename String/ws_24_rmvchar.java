
public class ws_24_rmvchar {
    public static void main(String[] args) {
        String s = "yash pandey", ans = "";
        char c = 'a';
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == c){
                continue;
            }
            else{
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
    // public static void main(String[] args) {
    //     String s = "yash pandey", ans = "";
    //     char c = 'a';
    //     for(int i = 0 ; i < s.length() ; i++){
    //         if(s.charAt(i) == c){
    //             s = s.replaceAll("[a]", "");
    //         }
    //     }
    //     System.out.println(s);
    // }
        // public static void main(String[] args) {
        //     String s  = "Yash pandey";
        //     char ch[] = s.toCharArray(), c = 'a';
        //     int j = 0 , count = 0;
        //     for(int i=0 ; i < s.length();i++){
        //         if(ch[i] != c){
        //             ch[j]=ch[i];
        //             j++;
        //         }
        //         else{
        //             count++;
        //         }
        //     }
        //     while(count-->0){
        //         ch[j] = ' ';
        //         j++;
        //     }
        //     System.out.println(ch);
        // }
}
