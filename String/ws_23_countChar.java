public class ws_23_countChar {
    public static void main(String[] args) {
        String s = "anubhav pandey";
        int count[] = new int[126], max = -1;
        char c = ' ';
        for(int i=0 ; i < s.length(); i++){
            count[s.charAt(i)]++;
        }
        //printing all char of string occurence
        for(int i = 0; i < count.length; i++){
            if(count[i] >= 1){
                System.out.println((char)i+" - "+count[i]); // count space also
            }
            if(max<count[i]){
                max = count[i];
                c = (char)i;
            }

        }
        System.out.println("Maximum character is : "+ c +"  : count -> "+max);
    }
}
