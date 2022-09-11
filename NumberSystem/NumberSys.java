public class NumberSys {
    public static void main(String[] args) {
        // for(int i = 0 ; i< 300 ; i++){
        //     System.out.println((char)i +" "+ i); // printing ascii characters using narrow binding typecasting 
        // }
        // in java there are four types of Number System 
        /*
         * 1) Decimal System - : this one default in java [0,1,2,3,4,5,6,7,8,9] base 10
         * 2) Binary System - : add prefix 0b or 0B  [Alphabet = 0 ,1 ] base 2
         * 3) Octal System - prefix 0 (zero) [Alphabet - 0,1,2,3,4,5,6,7] base 8
         * 4) Hexa-decimal system - [0-9 , 10 -A, 11- B ,12 - C ,13 - D ,14 - E, 15 F] PREFIX -: 0x or 0X
         * 
         */
        int a = 0b10; // BINARY
        int b = 010; // OCTAL  
        int c = 12; // decimal 
        int d = 0xF;
        System.out.println(a); // return 2 in binary
        System.out.println(b); // return 8 in octal
        System.out.println(c); // return 12 in decimal
        System.out.println(d); // return 21 in Hexa decimal

        System.out.println(Integer.parseInt("101", 2)); // return 5 binary to decimal
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toOctalString(c));
        System.out.println(Integer.toHexString(c));

    }
}
