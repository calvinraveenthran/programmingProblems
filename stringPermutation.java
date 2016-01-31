import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class stringPermutation{

  public static void main(String[] args) {
      String firstWord = "abcdefg";
      String secondWord = "abcdcba";
      String thirdWord ="gfedcba";

      Boolean test1 = isPermutation(firstWord, secondWord);
      Boolean test2 = isPermutation(firstWord,thirdWord);

      System.out.println("firstWord && secondWord = " + firstWord + " || "  + secondWord+ " = "  + test1 +"\n");
      System.out.println("firstWord && thirdWord = " + firstWord + " || "  + thirdWord+ " = "  + test2 + "\n");
  }

  public static Boolean isPermutation(String word1, String word2){

    if(sort(word1).equals(sort(word2))){
      return true;
    }else{
      return false;
    }
  }

  public static String sort(String s){
      char[] firstArray = s.toCharArray();
      Arrays.sort(firstArray);
    return new String(firstArray);
  }
}
