package linkedList;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class LinkedList<AnyType>{
   private Node<AnyType> head;

     public LinkedList(){
   		head = null;
    }

     public void addFirst(AnyType item,Node<AnyType> next){
       head = new Node<AnyType>(item, next);
     }

    public void addLast(AnyType item)
    {
      if(head == null){
        addFirst(item, null);
        return;
      }else{
        Node<AnyType> tmp = head;

          while(tmp.next != null){
            tmp = tmp.next;
          }
          tmp.next = new Node<AnyType>(item, null);
      }
    }

    public void insertAfter(AnyType key, AnyType toInsert){
       Node<AnyType> tmp = head;
       while(tmp != null && !tmp.data.equals(key)){
         tmp = tmp.next;
       }

        if(tmp != null){
          tmp.next = new Node<AnyType>(toInsert, tmp.next);
        }
    }

    public void insertBefore(AnyType key, AnyType toInsert){
       if(head == null) return;
       if(head.data.equals(key)){
          Node<AnyType> tmp = head;
          addFirst(toInsert, tmp);
          return;
       }

       Node<AnyType> prev = null;
       Node<AnyType> cur = head;

       while(cur != null && !cur.data.equals(key)){
          prev = cur;
          cur = cur.next;
       }
       //insert between cur and prev
       if(cur != null) prev.next = new Node<AnyType>(toInsert, cur);
    }


    public void remove(AnyType key){
       if(head == null) throw new RuntimeException("cannot delete");

       if( head.data.equals(key) ){
          head = head.next;
          return;
       }

       Node<AnyType> cur  = head;
       Node<AnyType> prev = null;

       while(cur != null && !cur.data.equals(key) ){
          prev = cur;
          cur = cur.next;
       }

       if(cur == null) throw new RuntimeException("cannot delete");

       //delete cur node
       prev.next = cur.next;
    }

    public void printList(){
      Node<AnyType> tmp = head;
          while(tmp != null){
            System.out.print(tmp.data + "->");
            tmp = tmp.next;
          }
          System.out.print("\n");
    }

    public void removeDuplicates(){
      Hashtable letterMap = new Hashtable();

      if(head == null){ return;}
      else{
        Node<AnyType> previous = null;
        Node<AnyType> curr = head;

        while(curr != null){
          if(letterMap.containsKey(curr.data)){
            curr = curr.next;
            previous.next = curr;
          }else{
            letterMap.put(curr.data, true);
            previous = curr;
            curr = curr.next;
          }
        }
      }
    }
}
