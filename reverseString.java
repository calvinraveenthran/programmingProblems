import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class reverseString{

  public static void main(String[] args) {
      String firstWord = "abcdefg";
      String secondWord = "abcdcba";
      String thirdWord ="1234sijfijnviajvadojc<CCDMCDACDIACMFVAF>DCJDSKCD";


      String revFirstWord = reverse(firstWord);
      String revSecondWord = reverse(secondWord);
      String revThirdWord = reverse(thirdWord);

      System.out.println("abcdefg = " + revFirstWord + " = "  + "\n");
      System.out.println("abcdcba = " + revSecondWord + " = "  + "\n");
      System.out.println("1234sijfijnviajvadojc<CCDMCDACDIACMFVAF>DCJDSKCD = " + revThirdWord + " = " + "\n");
  }

  public static String reverse(String str){
    if(str != null){
      char[] s = str.toCharArray();
      int start = 0;
      int end = str.length()-1;
      char tmp;

      while(start < end){
        tmp = s[end];
        s[end] = s[start];
        s[start] = tmp;

        start++;
        end--;
      }
        String b = new String(s);
        return b;
    }
      return str;
  }

}
