public class pangram {
    public static boolean checkIfPangram(String senetence){
        if(senetence.length()<26){
            return false;
        }
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0 ; i < senetence.length();i++){
            if(senetence.indexOf(alpha.charAt(i))==-1){
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
