import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class uniqueCharString{

    public static void main(String[] args) {
        String firstWord = "abcdefg";
        String secondWord = "abcdcba";
        String thirdWord ="1234sijfijnviajvadojc<CCDMCDACDIACMFVAF>DCJDSKCD";

        Boolean test1 = isUnique(firstWord);
        Boolean test2 = isUnique(secondWord);
        Boolean test3 = isUnique(thirdWord);

        System.out.println("firstWord = " + firstWord + " = "  + test1 +"\n");
        System.out.println("secondWord = " + secondWord + " = "  + test2 +"\n");
        System.out.println("thirdWord = " + thirdWord + " = " + test2 +"\n");
    }

    public static Boolean isUnique(String word){
      Map<Character,Integer> letterMap = new HashMap<Character,Integer>();
      for(char ch : word.toCharArray()){
        if(letterMap.containsKey(ch))
          return false;
        else
          letterMap.put(ch,1);
      }

      return true;
    }
}
