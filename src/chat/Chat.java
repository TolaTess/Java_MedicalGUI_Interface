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
public class Chat{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Doctor_GUI doc = new Doctor_GUI();
        doc.setVisible(true);
        
        Patient_GUI pat = new Patient_GUI();
        pat.setVisible(true);
        
    }
    
}
