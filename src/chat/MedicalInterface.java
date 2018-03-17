/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

/**
 *
 * @author tolaotesanya
 */
public interface MedicalInterface {
    
    public void enqueue(Object fullName);
    public boolean isEmpty();
    public Object dequeue();
    public String displayQueue();
    public int size();
    public String front();
    
}
