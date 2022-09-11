package TypeCasting;

/*
 * DATA TYPES : THE TYPE OF DATA WE ARE SPECIFING TO JAVA IS KNOWN AS DATA TYPES.
 * FOR EXAMPLE : 
 *          10 - INT 
 *          'a' - character
 *          "ab" - string
 *          true - boolean 
 * 
 * According to data types , languages are divided into two parts - 
 *          1 - Statically typed languages : in which programmer needs to specify the data type [c, c++, java, fortan, pascal]
 *          2 - Dynamically typed languages : no need to specify the data type [python , objective c, ruby ]
 * 
 * Types of data types : 
 *          primitve data types : which are already defined by java and their size is fixed [there are 8 primitive data types : boolean , char , byte ,short ,long, int,float ,double ]
 *          non - primitive data types : which are user defined and their size not fixed
 * [ examples : strings , array, collections , class , abstract class , interface etc]
 * 
 * 
 */


public class TC_main {
    public static void main(String[] args) {
        int a = 10;
        float f = 20.32f;
        f = a; // 1.1 Widening Type Casting (ImplicitType Casting)
        a = (int)f; //  
        Integer b = new Integer(a); //wrapper class [primitive to object]
        System.out.println(a);
        System.out.println(b);
        Integer b1 = a; // automatically converting primitive to object also known as Autoboxing [j2se 5] (what actuall;y happening Integer b1 = Integer.valueOf(a))
        System.out.println(b1);
        Integer b2 = Integer.valueOf(a);
        System.out.println(b2);
        Integer c = new Integer(10);
        int c1 = c.intValue(); //explicitly converting object to primitive 
        int aa = c1; //unboxing automatically converting

        byte d = 20;
        int ad = d; // widening type casting 

        byte da = (byte)ad; //narrowing typecasting 
        byte je = 12;
        int dd = 3;
        byte sum = (byte) (je+dd);
    }
}
/*
 * Type Casting : the process of converting the data from one data type to another data type , this process is known as data typecasting.
 * There are two types of data type casting : 
 *  1 : "Primitive data type Casting" :
 *          -> 1) Windeing Type Casting (Implicit Type Casting)
 *          -> 2) Narrow Type Casting (Explicit Type Casting) 
 *  2 : "User defined data type casting" 
 * 
 * -- Wideing Typecasting : it is the process of converting data from lower data type to higher data type 
 * -- Narrowing Typecasting : can be achieved by using "cast operator" for eg . (byte) , converting higher to lower datatype
 * 
 * USER DEFINED DATA TYPE CASTING : it is a process of converting data from one user defined data type to another user defined data type 
 * for "user defined typcasting " , both data types should have relation (either extands or implements )
 * 
 * IN JAVA ALL CHARACTER HAVE THEIR UNIQUE NUMERIC VALUES THAT KNOWN AS ASCII VALUES 
 */