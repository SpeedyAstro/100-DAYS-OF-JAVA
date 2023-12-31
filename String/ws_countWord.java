public class ws_countWord {
    public static void main(String[] args) {
        String s = " java is robust language!";
        int count=0;
        boolean b = false;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == ' ' || s.charAt(i) == '\n' || s.charAt(i) == '\t'){
                b = true;
            }
            else if(b == false){
                count++;
            }
            b = false;
        }
        System.out.println("Number of words :"+count);
    }
}
