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
}
