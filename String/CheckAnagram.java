package String;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author Deepak
 */
public class CheckAnagram
{
    public static void main(String[] args)
    {
        String str1="keep";
        String str2="Peek";
        
        char[] ch1=str1.toLowerCase().toCharArray();
        char[] ch2=str2.toLowerCase().toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        if(Arrays.equals(ch1, ch2))
        {
            System.out.println("Two strings are anagram");
        }
        else
        {
            System.out.println("Two strings are not anagram");
        }
    }
}
