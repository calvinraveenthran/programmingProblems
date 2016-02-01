package linkedList;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Node<AnyType>{
   public AnyType data;
   public Node<AnyType> next;

     public Node(AnyType data, Node<AnyType> next){
        this.data = data;
        this.next = next;
     }
}
