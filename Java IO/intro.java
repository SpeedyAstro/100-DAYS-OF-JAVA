import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ReadData{
   
}
public class intro {
    /*
        Terms used in Java IO - 
        1 . Input Devices : Keyboard , mouse , Optical pen 
        2. Output Devices ; Screen , headset , printers
        3. Stream : flow of data , stream is the meadium which allow the data to flow from input devices to java applications or from java application to output devices

        ThERE ARE predefined stream which transfer the data from cmd to java applications
        1. System.out
        2 System.in
        2 System.err

        there are many classes provided by java to handle IO , which are present in java.io package 
        Types of stream - 
        1. Byte Stream 
        2. Character Stream

        Byte Stream :
        data is transfered in the form of 1 , 0's
        types of stream : 
        1 . InputStream :
            -> public int read() throws IOException
            -> public int available() throws IOException
            -> public int close() throws IOException
        2. OutPutStream :
            -> public void write() throws IOExceptio
            -> public void flush() throws IOExceptio
            -> public void close() throws IOExceptio
        Hieracrchy of InputStream and output stream

    */    
    public static void main(String[] args) {
        System.err.println("hello world !");
        try{
        FileInputStream fis = new FileInputStream("C:\\Users\\pande\\Documents\\100-DAYS-OF-JAVA_DSA\\Java IO\\intro.java");
        int i ;
        while((i=fis.read()) != -1){
            System.out.print((char)i);
        }
        fis.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
