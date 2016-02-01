

package linkedList;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IsDuplicate{

    public static void main(String[] args) {
      LinkedList<Character> myList= new LinkedList<Character>();

      myList.addLast('a');
      myList.addLast('b');
      myList.addLast('c');
      myList.addLast('d');
      myList.addLast('e');
      myList.addLast('f');
      myList.addLast('g');
      myList.addLast('h');
      myList.addLast('i');
      myList.addLast('j');
      myList.addLast('k');
      myList.addLast('l');
      myList.printList();
      myList.addLast('a');
      myList.addLast('b');
      myList.addLast('c');
      myList.addLast('d');
      myList.addLast('e');
      myList.addLast('f');
      myList.addLast('g');
      myList.addLast('h');
      myList.addLast('i');
      myList.addLast('j');
      myList.addLast('k');
      myList.addLast('l');
      myList.printList();
      myList.removeDuplicates();
      myList.printList();

    }

}
