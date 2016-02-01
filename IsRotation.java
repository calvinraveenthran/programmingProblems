import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IsRotation{

    public static void main(String[] args) {
        String firstWord = "abcdefg";
        String secondWord = "efgabcd";

        Boolean test1 = RotationCheck(firstWord,secondWord);


        System.out.println("firstWord = " + firstWord + "secondWord = " + secondWord + " || " + test1 +"\n");

    }

    public static Boolean RotationCheck(String word1, String word2){
        if(word1.length() == word2.length() && word1.length() != 0){
          String word1word1 = word1 + word1;
          return word1word1.contains(word2);
        }

        return false;
    }
}
