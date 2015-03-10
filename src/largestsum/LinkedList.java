/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LargestSum;

/**
 *
 * @author Mike Hudick
 */
public class LinkedList {
    
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
