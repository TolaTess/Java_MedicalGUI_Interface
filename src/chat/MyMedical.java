/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.util.ArrayList;

/**
 *
 * @author tolaotesanya
 */
public class MyMedical implements MedicalInterface {
    
    ArrayList<String> Tmedi;
    
    //contructor
    public MyMedical(){
        Tmedi = new ArrayList<String>();
    }
    //enqueue method to add object
    public void enqueue(Object ob){
            int len = Tmedi.size();
            if((Tmedi.isEmpty())){
            Tmedi.add(0,(String) ob);
            }
             else 
            Tmedi.add(len,(String) ob);   
    }
    //isEmpty method to check if Queue is empty
    public boolean isEmpty(){
        return Tmedi.isEmpty();
    }
    //dequeue method to remove object from queue
    public Object dequeue(){
            if(!(Tmedi.isEmpty())){
            return Tmedi.remove(0);
            }
             else 
            return null;      
    }
    //display method to display Queue
    public String displayQueue(){
            if(!(Tmedi.isEmpty())){
            return Tmedi.toString();
            }
            else 
                return null;
    } 
        
    //size method to show how many objects in the Queue
    public int size(){
            return Tmedi.size();
    }
    //front method to show first elememnt
    public String front(){
            if(!(Tmedi.isEmpty())){
            return Tmedi.get(0);
            }
            else 
                return null;
    }
    
    
    
}
