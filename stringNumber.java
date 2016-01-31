import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class stringNumber{

    public static void main(String[] args) {
        String firstWord = "aaaaabbbbccccdddddefg";
        String secondWord = "abcdefg";

        String test1 = Amount(firstWord);
        String test2 = Amount(secondWord);


        System.out.println("firstWord = " + firstWord + " = "  + test1 +"\n");
        System.out.println("secondWord = " + secondWord + " = "  + test2 +"\n");
    }

    public static String Amount(String word){
      Map<Character,Integer> letterMap = new HashMap<Character,Integer>();

          for(char ch : word.toCharArray()){
            if(letterMap.containsKey(ch))
              letterMap.put(ch,letterMap.get(ch)+1);
            else
              letterMap.put(ch,1);
          }

          String answer = new String();
          char[] iterator = word.toCharArray();
          char tmp = ' ';
          int j = 0;
          int value;

          for(char chc : word.toCharArray()){
            if(chc != tmp){
              answer= answer + String.valueOf(chc);
              value = letterMap.get(chc);
              answer = answer + Integer.toString(value);
              tmp = chc;
            }
          }

        if(2*word.length() == answer.length()){
          return word;
        }else{
          return answer;
        }
    }
}
