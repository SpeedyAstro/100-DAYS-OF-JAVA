import java.util.Arrays;

public class ws_25_rmvDupli {
    public static void main(String[] args) {
        String s = "this is java , a robust language";
        char [] ch = s.toCharArray();
        int count = 0;
        for(int i = 0 ;  i < s.length() ; i ++){
            int j;
            for(j =0 ; j < i ; j++){
                if(ch[i] == ch[j]){
                    break;
                }
            }
            if(i == j){
                ch[count] = ch[i];
                count++;
            }
        }
        // while(count<s.length()){
        //     ch[count] = ' ';
        //     count++;
        // }
        String newstr=String.valueOf(Arrays.copyOf(ch, count)); //alternative
        System.out.println(newstr);
        System.out.println(ch);
        
    }
}
