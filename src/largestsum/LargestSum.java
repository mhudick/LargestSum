
package LargestSum;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Mike Hudick
 */
public class LargestSum {
    public static class LinkedListNode {
    
    private int num;
    private LinkedListNode node;
    
    public LinkedListNode(){
    
        node = null;
        num = 0;
    }
    
    public LinkedListNode (int n, LinkedListNode l){
        num = n;
        node = l;
    }
    
    public void setLink(LinkedListNode l){
        node = l;
    }
    
    public void setNum(int n){
            num = n;
    }
    
    public LinkedListNode getNode(){
            return node;
    }
    public int getNum(){
        return num;
    } 
    } 
   
    public static class LinkedList {
    
    private LinkedListNode head;
    private LinkedListNode tail;
    private int listSize;
    
    public LinkedList(){
        head = null;
        tail = null;
        listSize = 0;
    }
    
    public boolean empty(){
        return head == null;
    }
    
    public int getListSize(){
        return listSize;
    }
    
    public void insert(int set){
        LinkedListNode list = new LinkedListNode(set, null);
        listSize++;
        if(head == null){
            head = list;
            tail = head;
        }
        else {
            tail.setLink(list);
            tail = list;
        }
    }
 }

    public static void main(String[] args)  throws IOException {
         String fileName = "in.txt";
         LinkedList list = new LinkedList();
         Scanner numbers = new Scanner(new File(fileName));
         while(numbers.hasNext()){
            int num = numbers.nextInt();
            list.insert(num);
            System.out.println(num);
         } 
         int out = list.getListSize();
    }
    
  }

