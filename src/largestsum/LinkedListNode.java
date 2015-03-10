/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargestSum;
import java.util.Scanner;

public class LinkedListNode {
    
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
