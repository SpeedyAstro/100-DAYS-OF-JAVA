package String;

public class pangram {
    public static boolean checkIfPangram(String sentence){
        if(sentence.length()<26){
            return false;
        }
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0 ; i < sentence.length();i++){
            if(sentence.indexOf(alpha.charAt(i))==-1){
                return false;
            }
        }
        return true;
    }
    public boolean checkIfPangram2(String sentence) {
        int [] arr = new int[26];
        char [] chars = sentence.toCharArray();
        for (char aChar : chars) {
            arr[aChar - 97]++;
        }
        for(int ele:arr){
            if(ele==0){
                return false;
            }
        }
        return true;
    }
}
